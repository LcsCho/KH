package com.kh.spring11.controller;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring11.dao.MemberDao;
import com.kh.spring11.dto.MemberDto;

// CORS를 해제하기 위한 설정(Annotation)
@CrossOrigin // 전부 다 허용(위험)
// @CrossOrigin(origins = {"http://192.168.130.19:5500"})
@RestController // @Controller + @RespnseBody
public class DummyRestController {
	
	@RequestMapping("/hello")
	public String hello() {
		return "hello sping ajax";
	}
	
	// Rest Controller에서는 내가 전해줄 데이터가 반환형이 된다
	// - 자동으로 Spring에서 JSON형태로 변환하여 반환
	// - 변환을 담당하는 라이브러리는 jackson-databind
	@RequestMapping("/lotto")
	public Set<Integer> lotto() {
		Random r = new Random();
		Set<Integer> set = new TreeSet<>();
		while (set.size() < 6) {
			int n = r.nextInt(45) + 1;
			set.add(n);
		}
		return set;
	}
	
	@Autowired
	private MemberDao memberDao;
	
	@PostMapping("/idCheck")
	public String idCheck(@RequestParam String memberId) {
		MemberDto memberDto = memberDao.selectOne(memberId);
		if (memberDto != null) return "Y"; // 아이디가 있으면
		else return "N"; // 아이디가 없으면
	}
	
	@PostMapping("/nicknameCheck")
	public String nicknameCheck(@RequestParam String memberNickname) {
		MemberDto memberDto = 
			memberDao.selectOneByMemberNickname(memberNickname);
		if(memberDto == null) {
			return "Y";
		}
		else {
			return "N";
		}
	}
}
