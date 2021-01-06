package com.restartmylife35.minimal_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleResponseController {
	
	@RequestMapping("/")
	public String index() {
		return "2021/01/06 21:10";
	}

}
