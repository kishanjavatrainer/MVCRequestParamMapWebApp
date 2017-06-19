package com.infotech.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.infotech.model.User;

@Controller
public class UserController {

	@RequestMapping(value="/",method=RequestMethod.GET)
	public String registerPage(){
		return "register";
	}
	
	@RequestMapping(value="/registerSuccess",method=RequestMethod.POST)
	public ModelAndView registerSuccess(@RequestParam Map<String,String> requestMap){
		User user = new User(requestMap.get("name"), Integer.parseInt(requestMap.get("age")), requestMap.get("email"), requestMap.get("country"));
		ModelAndView modelAndView = new ModelAndView("registerSuccess");
		modelAndView.addObject("user", user);
		
		return modelAndView;
	}
	
}
