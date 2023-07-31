package com.kh.spring08.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.kh.spring08.dao.MemberDao;
import com.kh.spring08.dto.MemberDto;

@RestController
@RequestMapping("/member") // 공용주소
public class MemberController {
	
	@Autowired
	private MemberDao dao;
	
	@RequestMapping("/join")
	public String insert(
		@ModelAttribute MemberDto dto) {
		dao.insert(dto);
		return "회원 가입 완료";
	}
	@RequestMapping("/password")
	public String updatePw(@ModelAttribute MemberDto dto) {
		if (dao.updatePw(dto)) return "비밀번호 변경 완료";
		else return "없는 아이디입니다.";
	}
	@RequestMapping("/change")
	public String updateInfo(@ModelAttribute MemberDto dto) {
		if (dao.updateInfo(dto)) return "회원정보 변경 완료";
		else return "없는 아이디입니다.";
	}
	@RequestMapping("/exit")
	public String delete(@RequestParam String memberId) {
		if (dao.delete(memberId)) return "삭제 완료";
		else return "존재하지 않는 아이디";
	}
	@RequestMapping("/list")
	public String list() {
		List<MemberDto> list = dao.selectList();
		StringBuffer buffer = new StringBuffer();
		for (MemberDto dto : list) {
			buffer.append(dto);
			buffer.append("<br>");
		}
		return buffer.toString();
	}
	@RequestMapping("/detail")
	public String selectOne(@RequestParam String memberId) {
		MemberDto dto = dao.selectOne(memberId);
		if (dto == null) return "없는 아이디";
		else {
//			return dto.toString();
			StringBuffer buffer = new StringBuffer();
			buffer.append(dto);
			return buffer.toString();
		}
	}

	// 비밀번호를 변경할 때는 아이디, 바꿀 비밀번호만 있으면 된다.
	// 하지만, 여러가지 확인을 위해 추가정보를 요구할 수도 있다.
	// (ex) 기존 비밀번호(o), 비밀번호확인(x)
	@RequestMapping("/password2")
	public String password(
			@RequestParam String memberId,// 아이디
			@RequestParam String memberPw,// 기존비번
			@RequestParam String changePw){ // 바꿀비번
		
		// 일단 아이디로 DB의 회원정보를 불러온다
		MemberDto originDto = dao.selectOne(memberId);
		if (originDto == null) return "존재하지 않는 아이디";
		
		if(originDto.getMemberPw().equals(memberPw)) {
			MemberDto changeDto = new MemberDto();
			changeDto.setMemberId(memberId);
			changeDto.setMemberPw(changePw);
			dao.updatePw(changeDto);
			return "변경 완료";
		}
		else return "비밀번호가 일치하지 않음";
	}
	
	@RequestMapping("/change2")
	public String change(@ModelAttribute MemberDto changeDto) {
		// 비밀번호 검사를 위한 원 정보 조회
		MemberDto originDto = dao.selectOne(changeDto.getMemberId());
		if (originDto == null) return "아이디 없음";
		if (originDto.getMemberPw().equals(changeDto.getMemberPw()) == false) return "비밀번호 맞지 않음";
		
		dao.updateInfo(changeDto);
		return "변경 완료";
	}
	
	@RequestMapping("/exit2")
	public String exit(@ModelAttribute MemberDto inputDto) {
		MemberDto originDto = dao.selectOne(inputDto.getMemberId());
		if (originDto == null) return "아이디 없음";
		if (originDto.getMemberPw().equals(inputDto.getMemberPw()) == false) return "비밀번호 맞지 않음";
		dao.delete(inputDto.getMemberId());
		return "안녕히 가세요 여러분~";
	}
}
