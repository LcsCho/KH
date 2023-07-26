package com.kh.spring03;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // 애너테이션(Annotation) - 역할 정의
public class QuizController {

	Random r = new Random();

	@RequestMapping("/dice")
	public String dice() {
		return "주사위: " + (r.nextInt(6) + 1);
	}

	@RequestMapping("/lotto")
	public String lotto() {
		return "주사위: " + (r.nextInt(45) + 1);
	}
}
