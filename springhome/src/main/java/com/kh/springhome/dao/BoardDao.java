package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
	int sequence();
	void insert(BoardDto boardDto);
	List<BoardDto> selectList();
	BoardDto selectOne(int boardNo);
	boolean update(BoardDto boardDto);
	boolean delete(int boardNo);
	
	boolean updateBoardReadcount(int boardNo);
	Integer selectMax(String boardWriter);
	List<BoardDto> selectList(String type, String keyword);
	
}