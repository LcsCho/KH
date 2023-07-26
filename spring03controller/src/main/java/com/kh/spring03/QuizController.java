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
	
	@RequestMapping("/square")
	public String square(int a) {
		return a + "의 제곱은" + (a * a);
	}
	
	@RequestMapping("/subway")
	public String subway(int year) {
		if (year <= 1958 || year >= 2018) return "요금은 무료입니다.";
		else if (year < 2010) return "요금은 1250원 입니다.";
		else if (year < 2015) return "요금은 800원 입니다.";
		else if (year < 2018) return "요금은 500원입니다.";
		else return "요금은 무료입니다.";
	}
	
	@RequestMapping("/leap")
	public String leap(int year) {
        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        
        if (isLeapYear) return year + "년은 윤년입니다.";
        else return year + "년은 평년입니다.";
	}
	
	@RequestMapping("/circle")
	public String circle(float r) {
		return "원의 넓이는 " + (r * r * 3.14);
	}
}
