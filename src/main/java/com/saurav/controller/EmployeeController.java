package com.saurav.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Value("${app.home.message}")
	private String MESSAGE;
	
	@Value("${app.home.title}")
	private String TITLE;
	
	@RequestMapping("employee")
	public String getEmp(Map<String, Object> model) {
		model.put("title", TITLE);
		model.put("message", MESSAGE);
		return "Home";
	}
	
	
}
