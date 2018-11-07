package com.rs.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.rs.aop.AOPtestMain;



@Controller
public class HelloController  {

	
	@Autowired
	AOPtestMain aopTestMain;
	
	@RequestMapping("/")
	protected ModelAndView helloworl()  {
		ModelAndView modelAndView = new ModelAndView("welcome");
		aopTestMain.getMessage();
		modelAndView.addObject("welcomeMessage","hi,how are you this is ranga");
		return modelAndView;
	}
	
	@RequestMapping("/welcome")
	protected ModelAndView helloworld()  {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage","hi,how are you this is ranga");
		return modelAndView;
	}
	
	@RequestMapping("/welcome/{name}")
	protected ModelAndView greeMessage(@PathVariable("name") String username)  {
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMessage","hi,how are you "+username+" this is ranga");
		return modelAndView;
	}

}
