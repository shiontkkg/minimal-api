package com.restartmylife35.minimal_api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleResponseController {
	
	/** a parameter in application.yml */
	@Value("${application.param}")
	private String param;
	
	/** a secret parameter in AWS Secrets Manager */
	@Value("${application.auth.password}")
	private String password;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public String index() {
		System.out.println("Minimal API Application. param = " + param + ", password = " + password);
		return "Minimal API Application. param = " + param + ", password = " + password;
	}

}
