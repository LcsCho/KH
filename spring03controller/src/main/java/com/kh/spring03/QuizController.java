package com.kh.spring03;

import java.util.Random;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuizController {
	
	Random r = new Random();
	
	@RequestMapping("/dice")
	public int dice() {
		return r.nextInt(6) + 1;
	}
	
	@RequestMapping("/lotto")
	public int lotto() {
		return r.nextInt(45) + 1;
	}
}
