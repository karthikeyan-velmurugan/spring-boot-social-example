/**
 * 
 */
package com.social.controller;

import java.util.Set;

import org.springframework.social.facebook.api.Facebook;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Karthik
 *
 */
@RestController
@RequestMapping("/login")
public class FacebookController {

	private Facebook facebook;

	public FacebookController(Facebook facebook) {
		this.facebook=facebook;
	}

	@GetMapping
	public String welcome() {
		return "Welcome to facebook controller";
	}

	//@GetMapping("/fblogin/{username}/{password}")
	@GetMapping("/fblogin")
	public Set<String> getFbProfile(@PathVariable String username, @PathVariable String password ){

		org.springframework.social.facebook.api.User userProfile = facebook.userOperations().getUserProfile();
		userProfile.getExtraData();

		return userProfile.getExtraData().keySet();

	}
}