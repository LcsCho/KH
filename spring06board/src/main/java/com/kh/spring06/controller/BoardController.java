package com.kh.spring06.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring06.dao.BoardDao;
import com.kh.spring06.dto.BoardDto;

@RestController
public class BoardController {

	@Autowired
	private BoardDao dao;
	
	@RequestMapping("/insert")
	public String insert(
		@ModelAttribute BoardDto dto) {
		dao.insert(dto);
		return "게시글 등록 완료";
	}
	
	@RequestMapping("/update")
	public String update(@ModelAttribute BoardDto dto) {
		if (dao.update(dto)) return "게시판 정보 변경 완료";
		else return "해당 게시판은 존재하지 않습니다.";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		if (dao.delete(boardNo)) return "삭제 완료";
		else return "존재하지 않는 게시판";
	}
	
	@RequestMapping("/list")
	public String list() {
		List<BoardDto> list = dao.selectList();
		StringBuffer buffer = new StringBuffer();
		for (BoardDto dto : list) {
			buffer.append(dto);
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	
	@RequestMapping("/detail")
	public String selectOne(@RequestParam int boardNo ) {
		BoardDto dto = dao.selectOne(boardNo);
		if (dto == null) return "없는 게시판";
		else {
			StringBuffer buffer = new StringBuffer();
			buffer.append(dto);
			return buffer.toString();
		}
	}
}
