package com.kh.spring10.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kh.spring10.dao.ShirtDao;
import com.kh.spring10.dao.ShirtSizeDao;
import com.kh.spring10.dto.ShirtDto;
import com.kh.spring10.dto.ShirtSizeDto;

@Controller
@RequestMapping("/shirt")
public class ShirtController {
	@Autowired
	private ShirtDao dao;
	
	@Autowired
	private ShirtSizeDao sizeDao;
	
	@RequestMapping("/detail")
	public String detail(Model model, @RequestParam int shirtNo) {
		ShirtDto dto = dao.selectOne(shirtNo);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/shirt/detail.jsp";
	}
	
	@GetMapping("/add")
	public String insert() {
		return "/WEB-INF/views/shirt/add.jsp";
	}
	
	@PostMapping("/add")
	public String insert(@ModelAttribute ShirtDto dto) {
		int shirtNo = dao.sequence();
		dto.setShirtNo(shirtNo);
		dao.add(dto);
		return "redirect:list";
//		return "redirect:detail?shirtNo=" + shirtNo;
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<ShirtDto> list = dao.selectList();
		model.addAttribute("list", list);
		return "/WEB-INF/views/shirt/list.jsp";
	}
	
	@GetMapping("/edit")
	public String edit(@RequestParam int shirtNo, Model model) {
		ShirtDto dto = dao.selectOne(shirtNo);
		model.addAttribute("dto", dto);
		return "/WEB-INF/views/shirt/edit.jsp";
	}
	@PostMapping("/edit")
	public String edit(@ModelAttribute ShirtDto dto) {
		boolean result = dao.edit(dto);
		if (result) return "redirect:detail?shirtNo=" + dto.getShirtNo(); 
		else return "redirect:에러페이지주소";
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam int shirtNo) {
		boolean result = dao.delete(shirtNo);
		if(result) return "redirect:list";
		else return "redirect:에러페이지";
	}
	
	@GetMapping("/add2")
	public String add2() {
		return "/WEB-INF/views/shirt/add2.jsp";
	}
	
	@PostMapping("/add2")
	public String add2(@ModelAttribute ShirtDto shirtDto,
			@RequestParam List<String> size) {
		int shirtNo = dao.sequence();
		shirtDto.setShirtNo(shirtNo);
		dao.add(shirtDto);
		
		for(String s : size) {
			ShirtSizeDto sizeDto = new ShirtSizeDto();
			sizeDto.setShirtNo(shirtNo);
			sizeDto.setShirtSizeName(s);
			sizeDao.insert(sizeDto);
		}
		
		return "redirect:detail?shirtNo=" + shirtNo;
	}
	
}
