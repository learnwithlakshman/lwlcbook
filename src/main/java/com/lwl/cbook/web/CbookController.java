package com.lwl.cbook.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CbookController {

	@GetMapping(value = "/")
	public String greet() {
		return "Welcome to Spring World";
	}
}
