package com.kh.springhome.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.springhome.dao.BoardDao;
import com.kh.springhome.dto.BoardDto;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	private BoardDao boardDao;
	
	@GetMapping("/write")
	public String insert() {
		return "/WEB-INF/views/board/write.jsp";
	}
	
	@PostMapping("/write")
	public String insert(@ModelAttribute BoardDto boardDto, HttpSession session) {
		String boardWriter = (String) session.getAttribute("name");
		int boardNo = boardDao.sequence();
		boardDto.setBoardNo(boardNo);
		boardDto.setBoardWriter(boardWriter);
		boardDao.insert(boardDto);
		return "redirect:list";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<BoardDto> list = boardDao.list();
		model.addAttribute("list", list);
		return "/WEB-INF/views/board/list.jsp";
	}
	
	@RequestMapping("/detail")
	public String detail(@RequestParam int boardNo, Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/detail.jsp";
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam int boardNo, Model model) {
		BoardDto boardDto = boardDao.selectOne(boardNo);
		model.addAttribute("boardDto", boardDto);
		return "/WEB-INF/views/board/edit.jsp";
	}
	
	@PostMapping("/edit")
	public String edit(@ModelAttribute BoardDto boardDto) {
		boolean result = boardDao.update(boardDto);
		if (result) return "redirect:detail?boardNo=" + boardDto.getBoardNo();
		else return "redirect:에러페이지";
	}
	
	@RequestMapping("/delete")
	public String delete(@RequestParam int boardNo) {
		boolean result = boardDao.delete(boardNo);
		if (result) return "redirect:/board/list";
		else return "redirect:에러페이지";
	}
}
