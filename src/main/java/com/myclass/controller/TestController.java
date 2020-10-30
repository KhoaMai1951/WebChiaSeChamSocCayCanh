package com.myclass.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping(path="/admin")
	String users() {
		return "admin-page/v1/index";
	}
}
