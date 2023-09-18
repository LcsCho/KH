package com.kh.spring13;

import java.util.Properties;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootTest
public class Test01 {
   @Test
   public void test() {
      // 프로젝트 생성시 java mail  sender 라는 도구가 추가 되어야함
	   
	  // 전송 도구 - 업체오 계정관련 정보 설정
      JavaMailSenderImpl sender = new JavaMailSenderImpl();
      sender.setHost("smtp.gmail.com"); // 업체주소
      sender.setPort(587); // 업체포트
      sender.setUsername("lcscho22");
      sender.setPassword("dwtazpbrqiduumjg");
      
      // 통신과 관련된 추가 설정
      Properties props = new Properties();
      props.setProperty("mail.smtp.auth", "true"); // 인증 후 이용 설정(필수)
      props.setProperty("mail.smtp.debug", "true"); // 디버깅 기능 이용 설정(선택)
      props.setProperty("mail.smtp.starttls.enable", "true"); // TLS 사용 설정(필수)
      props.setProperty("mail.smtp.ssl.protocols", "TLSv1.2"); // TLS 버전 설정
      props.setProperty("mail.smtp.ssl.trust", "smtp.gmail.com");
      
      sender.setJavaMailProperties(props);
      
      // 전송메세지 상대방의 정보와 메일 내용을 설정
      SimpleMailMessage message = new SimpleMailMessage();
      message.setTo("chojunhee98@gmail.com");
      message.setSubject("하위~");
      message.setText("바위~");
      
      // 전송
      sender.send(message);
   }

}