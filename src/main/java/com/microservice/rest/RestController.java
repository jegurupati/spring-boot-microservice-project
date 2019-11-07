package com.microservice.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping(value ="/api/v1/rest")
public class RestController {
	
@GetMapping("/test/user")
public String testUser() {
	return "Test Users";
}

}
