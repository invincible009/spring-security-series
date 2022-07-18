package com.shimadove.springsecurityseries.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sdl")
public class LoansController {
	
	@GetMapping("/myLoans")
	public String getLoanDetails(String input) {
		return "Here are the loan details from the DB";
	}

}
