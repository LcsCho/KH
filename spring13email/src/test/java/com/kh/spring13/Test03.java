package com.kh.spring13;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test03 {
   
	@Autowired
	private JavaMailSender sender;
	
	@Test
    public void test() {
      // 전송메세지 - 상대방의 정보와 메일 내용을 설정
      SimpleMailMessage message = new SimpleMailMessage();
      message.setTo("chojunhee98@gmail.com");
      message.setSubject("하위~");
      message.setText("바위~");
      
      // 전송
      sender.send(message);
   }

}