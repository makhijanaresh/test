package com.example.test.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class Controller {

	@GetMapping("/check")
	public String check() {
		return "Modified Automated Success";
	}
}
