package com.kh.spring20.dto;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor @Builder
public class MemberDto {
	private String memberId, memberPw, memberNickname;
	private String memberEmail, memberContact, memberBirth;
	private String memberPost, memberAddr1, memberAddr2;
	private String memberLevel;
	private int memberPoint;
	private Date memberJoin, memberLogin, memberChange;
}