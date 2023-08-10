package com.kh.springhome.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class BoardDto {
	private int boardNo, boardReadcount, boardLikecount, boardReplycount;
	private String boardWriter, boardTitle, boardContent;
	private Date boardCtime, boardUtime;
}
