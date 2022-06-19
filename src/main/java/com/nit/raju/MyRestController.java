package com.nit.raju;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@GetMapping("/hello")
	public String hello() {
		return "Welcome To Jenkins";
	}

}
