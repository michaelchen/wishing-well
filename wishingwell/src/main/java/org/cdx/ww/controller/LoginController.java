package org.cdx.ww.controller;

import javax.servlet.http.HttpSession;

import org.cdx.ww.entity.Account;
import org.cdx.ww.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@Autowired
	private AccountService accountService;

	@RequestMapping("login")
	public ModelAndView login(HttpSession session, @ModelAttribute("SpringWeb") Account acc) {
		if (acc != null && acc.getAccount() == null && acc.getPassword() == null) {
			return new ModelAndView("login", "command", new Account());
		}

		String username = (String)session.getAttribute("username");
		boolean isLogin = false;
		if (username != null) {
			isLogin = true;
		} else {
			isLogin = accountService.auth(acc);
		}
		String result = "";
		if (isLogin) {
			session.setAttribute("username", acc.getAccount());
			result = "Hey " + acc.getAccount() + ", you have been logged in successfully.";
		} else {
			result = "You failed to be logged in, please login again <a href='/wishingwell/login'>Login</a>";
		}
		return new ModelAndView("auth", "message", result);
	}

	@RequestMapping(value="/logout")  
    public String logout(HttpSession session) {  
        session.invalidate();  
        return "redirect:login";
    }

}
