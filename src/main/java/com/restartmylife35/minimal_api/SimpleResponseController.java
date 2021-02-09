package com.restartmylife35.minimal_api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleResponseController {
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index() {
		return "Now Preparing...";
	}

}
