package com.shimadove.springsecurityseries.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sdl/notices")
public class NoticesController {
	
	@GetMapping("/notices")
	public String getNotices(String input) {
		return "Here are the notices details from the DB";
	}

}
