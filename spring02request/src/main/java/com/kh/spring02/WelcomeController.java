package com.kh.spring02;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@RequestMapping("/welcom") 
	public String welcom() {
		return "Welcom to Spring Framework!";
	}
}
