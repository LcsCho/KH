package com.kh.spring03;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	// 파라미터 관련 문제
	
	// (추가) 스프링은 역할을 명시하는 것을 선호한다.
	@RequestMapping("/square")
	public String square(@RequestParam int a) {
		return a + "의 제곱은" + (a * a);
	}
	// (추가) 연도가 주어지지 않으면 실행을 안할건가?
	// - 파라미터가 없어도 실행되어야 하는 상황(ex: 기본값)
	// - 만약 birth가 제공되지 않는다면 성인 요금을 부여
	// - @RequestParam에 required=false옵션을 주면 없어도 됨
	// - @RequestParam에 defaultValue를 설정하여 기본값을 지정(문자열)
	@RequestMapping("/subway")
	public String subway(
			@RequestParam(required = false, defaultValue = "2000") int birth) {
		int age = LocalDate.now().getYear() - birth + 1;
		// int price = 1250 or 720 or 450 or 0;
		int price;
		if (age < 8 && age >= 65) price = 0;
		else if (age >= 20) price = 1250;
		else if (age >= 14) price = 720;
		else price = 450;
		
		return "요금은 " + price + "원 입니다.";
	}
	
	@RequestMapping("/leap")
	public String leap(@RequestParam int year) {
        boolean isLeapYear = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
        
        if (isLeapYear) return year + "년은 윤년입니다.";
        else return year + "년은 평년입니다.";
	}
	
	@RequestMapping("/circle")
	public String circle(@RequestParam float r) {
		return "원의 넓이는 " + (r * r * 3.14);
	}
}
