package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.vo.PaginationVO;

// 메서드 명세만 작성(책으로 치면 목차)
public interface MemberDao {
	void insert(MemberDto memberDto);
	MemberDto selectOne(String memberId);
	boolean updateMemberLogin(String memberid);
	boolean updateMemberPw(String memberId, String changePw);
	boolean updateMemberChange(MemberDto memberDto);
	boolean exitMember(String memberId);
	
	boolean increaseMemberPoint(String memberId, int point);
	int countList(PaginationVO vo);
	List<MemberDto> selectListByPage(PaginationVO vo);
}

