package com.kh.springhome.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class MemberDto {
	private String memberId, memberPw, memberNickname;
	private String memberEmail, memberContact;
	private String memberBirth;
	private String memberPost, memberAdd1, memberAdd2;
	private String memberLevel;
	private int memberPoint;
	private Date memberJoin, memberLogin, memberChange;
}
