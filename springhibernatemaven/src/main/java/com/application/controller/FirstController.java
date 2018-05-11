package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.application.service.Serv;


@RestController
public class FirstController {

	@Autowired
	private Serv s;
	
	@ResponseBody
	@RequestMapping(value="/demo",method=RequestMethod.GET)
	public String firstResponce(){
		s.saveStudent();
		return "hello ramesh";
	}
	
	
}
