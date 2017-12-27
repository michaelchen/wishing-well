package org.cdx.ww.controller;

import org.cdx.ww.service.HelloWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@Autowired
	private HelloWorldService hwService;
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		String countStr = "" + hwService.getUserCount();
		return new ModelAndView("welcome", "message", countStr);
	}
}
