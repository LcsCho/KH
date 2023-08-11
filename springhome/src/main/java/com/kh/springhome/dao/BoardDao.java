package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.BoardDto;

public interface BoardDao {
	public int sequence();
	void insert(BoardDto boardDto);
	BoardDto selectOne(int boardNo);
	public List<BoardDto> list();
	boolean update(BoardDto boardDto);
	boolean delete(int boardNo);
	void updateLike(int boardNo);
	void updateUnlike(int boardNo);
	void updateRead(int boardNo);
	public List<BoardDto> find();
}
