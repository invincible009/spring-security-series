package com.shimadove.springsecurityseries.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sdl/account")
public class AccountController {
	
	@GetMapping("/myAccount")
	public String getAccountDetails(String input) {
		return "Here are the account details from the DB";
	}

}
