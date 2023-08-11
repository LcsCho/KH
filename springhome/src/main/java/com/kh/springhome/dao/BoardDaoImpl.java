package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.mapper.BoardListMapper;
import com.kh.springhome.mapper.BoardMapper;

@Repository
public class BoardDaoImpl implements BoardDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private BoardListMapper listMapper;
	
	@Autowired
	private BoardMapper mapper;

	@Override
	public void insert(BoardDto boardDto) {
		String sql = "insert into board(board_no, board_writer, board_title, board_content) "
				+ "values(?, ?, ?, ?)";
		Object[] data = {boardDto.getBoardNo(), boardDto.getBoardWriter(), boardDto.getBoardTitle(), boardDto.getBoardContent()};
		
		jdbcTemplate.update(sql, data);
		
	}

	@Override
	public BoardDto selectOne(int boardNo) {
		String sql = "select * from board where board_no = ?";
		Object[] data = {boardNo};
		List<BoardDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}


	@Override
	public boolean update(BoardDto boardDto) {
		String sql = "update board set board_title = ?, board_content = ?, board_utime = sysdate "
				+ "where board_no = ?";
		Object[] data = {boardDto.getBoardTitle(), boardDto.getBoardContent(),
				boardDto.getBoardNo()
		};
		
		return jdbcTemplate.update(sql, data) > 0;
	}

	@Override
	public boolean delete(int boardNo) {
		String sql = "delete from board where board_no = ?";
		Object[] data = {boardNo};
		return jdbcTemplate.update(sql, data) > 0;
	}

	@Override
	public List<BoardDto> list() {
		String sql = "select * from board order by board_no desc";
		return jdbcTemplate.query(sql, listMapper);
	}

	@Override
	public int sequence() {
		String sql = "select board_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql, int.class);
	}

	@Override
	public void updateLike(int boardNo) {
		String sql = "update board set board_likecount = board_likecount + 1 where board_no = ?";
		Object[] data = {boardNo};
		jdbcTemplate.update(sql, data);
	}

	@Override
	public void updateUnlike(int boardNo) {
		String sql = "update board set board_likecount = board_likecount - 1 where board_no = ?";
		Object[] data = {boardNo};
		jdbcTemplate.update(sql, data);
	}

	@Override
	public void updateRead(int boardNo) {
		String sql = "update board set board_readcount = board_readcount + 1 where board_no = ?";
		Object[] data = {boardNo};
		jdbcTemplate.update(sql, data);
	}

	@Override
	public List<BoardDto> findList(String type, String keyword) {
		String sql = "select * from board where board_title like ? or board_writer like ?";
		Object[] data = {"%" + type + "%", "%" + keyword + "%"};
		return jdbcTemplate.query(sql, listMapper, data);
	}


}
