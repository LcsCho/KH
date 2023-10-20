package com.kh.spring20.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebSocketViewController {
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/time")
	public String time() {
		return "time";
	}
	
	@RequestMapping("/default")
	public String defaultServer() {
		return "default";
	}

}
