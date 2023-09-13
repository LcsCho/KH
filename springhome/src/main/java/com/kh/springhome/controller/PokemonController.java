package com.kh.springhome.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.kh.springhome.dao.AttachDao;
import com.kh.springhome.dao.PokemonDao;
import com.kh.springhome.dto.AttachDto;
import com.kh.springhome.dto.PokemonDto;

@Controller
@RequestMapping("/pokemon")
public class PokemonController {
	
	@Autowired
	private PokemonDao pokemonDao;
	
	@Autowired
	private AttachDao attachDao;
	
	@GetMapping("/insert")
	public String insert() {
		return "/WEB-INF/views/pokemon/insert.jsp";
	}
	
	@PostMapping("/insert")
	public String insert(
			@ModelAttribute PokemonDto pokemonDto, @RequestParam MultipartFile attach) throws IllegalStateException, IOException {
		
		// 포켓몬등록
		int no = pokemonDao.sequence();
		pokemonDto.setNo(no);
		pokemonDao.insert(pokemonDto);
		
		if (!attach.isEmpty()) {
			// 첨부파일등록(파일이 있을때만)
			int attachNo = attachDao.sequence();
			
			String home = System.getProperty("user.home");
			File dir = new File(home, "upload");
			dir.mkdirs();
			File target = new File(dir, String.valueOf(attachNo));
			attach.transferTo(target);
			
			AttachDto attachDto = new AttachDto();
			attachDto.setAttachNo(attachNo);
			attachDto.setAttachName(attach.getOriginalFilename());
			attachDto.setAttachSize(attach.getSize());
			attachDto.setAttachType(attach.getContentType());
			attachDao.insert(attachDto);
			
			// 연결파일이 있을 때만
			pokemonDao.connect(no, attachNo);
		}
		return "redirect:insert";
	}
}
