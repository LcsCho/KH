package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;
import com.kh.springhome.dto.MemberDto;

public interface BoardDao {
	public int sequence();
	void insert(BoardDto boardDto);
	BoardDto selectOne(int boardNo);
	boolean update(BoardDto boardDto);
	boolean delete(int boardNo);
	void updateLike(int boardNo, int boardLikecount);
	void updateUnlike(int boardNo, int boardLikecount);
	void updateRead(int boardNo);
	public List<BoardDto> list(String type, String keyword, int pageNo, int pageSize);
}
