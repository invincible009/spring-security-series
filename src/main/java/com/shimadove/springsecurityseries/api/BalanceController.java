package com.shimadove.springsecurityseries.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sdl")
public class BalanceController {
	
	@GetMapping("/myBalance")
	public String getBalanceDetails(String input) {
		return "Here are the balance details from the DB";
	}

}
