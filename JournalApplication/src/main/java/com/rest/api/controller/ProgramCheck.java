package com.rest.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProgramCheck 
{
	@GetMapping("/check")
	public String check()
	{
		return "Running Successfully";
	}

}
