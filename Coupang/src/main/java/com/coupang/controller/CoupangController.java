package com.coupang.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class CoupangController {
	
	@RequestMapping("/")
	String landing() {
		return "index";
	}
}

//��ü������ ��ǰ� ����