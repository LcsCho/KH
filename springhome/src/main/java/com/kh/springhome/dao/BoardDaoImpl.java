package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.MemberDto;
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

//	@Override
//	public BoardDto selectOne(int boardNo) {
//		String sql = "select * from board where board_no = ?";
//		String sql = "select * from board a inner join member b on a.? = b.?";
//		Object[] data = {boardNo};
//		List<BoardDto> list = jdbcTemplate.query(sql, mapper, data);
//		return list.isEmpty() ? null : list.get(0);
//	}
	
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
    public List<BoardDto> list(String type, String keyword, int pageNo, int pageSize) {
          String a = "";
          
          if (type != null && keyword != null && !keyword.isEmpty()) {
              a = " where " + type + " like ?";
          }

          int start = (pageNo - 1) * 10 + 1;   //1페이지면 (1-1)*10+1이니 1이다
                                           //2페이지면 (2-1)*10+1이니 11
          int end = pageNo * 10;

          String sql = "SELECT * FROM (SELECT rownum rn, TMP.* FROM (SELECT * FROM board" + a
                  + " ORDER BY board_no DESC) TMP) WHERE rn BETWEEN ? AND ?";

          System.out.println(sql);

          List<BoardDto> results;

          if (type != null && keyword != null && !keyword.isEmpty()) {
              results = jdbcTemplate.query(sql, listMapper, "%" + keyword + "%", start, end);
          } else {
              results = jdbcTemplate.query(sql, listMapper, start, end);
          }

          return results;
      }

	@Override
	public int sequence() {
		String sql = "select board_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql, int.class);
	}

	@Override
    public void updateUnlike(int boardNo, int boardLikecount) {
        String sql = "update board set board_likecount=? where board_no=?";
        Object[] data = { boardLikecount, boardNo };
        jdbcTemplate.update(sql, data);
    }

	@Override
    public void updateLike(int boardNo, int boardLikecount) {
        String sql = "update board set board_likecount=? where board_no=?";
        Object[] data = { boardLikecount, boardNo };
        jdbcTemplate.update(sql, data);
    }

	@Override
	public void updateRead(int boardNo) {
		String sql = "update board set board_readcount = board_readcount + 1 where board_no = ?";
		Object[] data = {boardNo};
		jdbcTemplate.update(sql, data);
	}
}
