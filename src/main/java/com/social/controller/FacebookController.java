/**
 * 
 */
package com.social.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Karthik
 *
 */
@RestController
@RequestMapping("/login")
public class FacebookController {
	
	@GetMapping
	public String welcome() {
		return "Welcome to facebook controller";
	}

}