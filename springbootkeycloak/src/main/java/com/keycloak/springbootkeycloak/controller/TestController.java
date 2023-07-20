package com.keycloak.springbootkeycloak.controller;

import javax.annotation.security.RolesAllowed;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@GetMapping("/user1")
	@RolesAllowed("admin")
	public String testing1() {
	    return "success for user 1";
  }
	
	@GetMapping("/user2")
	public String testing2() {
		return "success for user 2";
		
	}
}
