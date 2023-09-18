package com.kh.springhome.dto;

import java.sql.Date;

import lombok.Data;

@Data
public class CertDto {
	private String certMail;
	private String certNumber;
	private Date certTime;
}
