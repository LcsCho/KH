package com.kh.springhome.controller;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	// 파일 다운로드
	// - 파일번호(attach_no)를 이용하여 정보를 조회
	// - 실물파일을 불러와서 사용자에게 전송
	// - 화면이 아니라 파일을 전송해야 하므로 RestController처럼 처리
	// - 매핑 위에 @ResponseBody 라고 추가하면 가능
	@ResponseBody
	@RequestMapping("/image")
	public ResponseEntity<ByteArrayResource> 
					image(@RequestParam int no) throws IOException {
		// 1. 포켓몬 번호로 파일 번호를 찾아야 한다
		// 2. 파일 번호로 파일 정보를 불러와야 한다
		// 3. 실제 파일을 불러와야 한다
		// 4. 앞에서 불러온 모든 정보로 ResponseEntity를 생성한다
		// 5. 사용자한테 준다
		
		// 1, 2
		AttachDto attachDto = pokemonDao.findImage(no);
		if(attachDto == null) {
//			throw new NoTargetException("파일 없음"); // 내가 만든 예외로 통합
			return ResponseEntity.notFound().build(); // 404 반환
		}
		
		// 3
		String home = System.getProperty("user.home");
		File dir = new File(home, "upload");
		File target = new File(dir, String.valueOf(attachDto.getAttachNo()));
		
		byte[] data = FileUtils.readFileToByteArray(target); // 실제파일정보 불러오기
		ByteArrayResource resource = new ByteArrayResource(data);
		
		// 4, 5
		return ResponseEntity.ok().body(resource);
	}
	
	
}
