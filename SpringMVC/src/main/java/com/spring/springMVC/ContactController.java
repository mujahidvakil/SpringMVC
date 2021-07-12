package com.spring.springMVC;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.springMVC.model.User;
import com.spring.springMVC.services.UserService;

@Controller
public class ContactController {

	@Autowired
	private UserService userService;
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String processForm(@ModelAttribute User user , Model model) {
		System.out.println(user);
		this.userService.insertUser(user);
		//model.addAttribute(user);
		return "processForm";
	}
	/*
	@RequestMapping(path = "/processForm", method = RequestMethod.POST)
	public String processForm(@RequestParam(name="email" , required = true) String email,@RequestParam("userName") String userName,
			@RequestParam("password") String password,Model model) {
		System.out.println(email);
		System.out.println(userName);
		System.out.println(password);
		User user=new User();
		user.setUserName(userName);
		user.setEmail(email);
		user.setPassword(password);
		System.out.println(user);
		model.addAttribute(user);
		
		/*
		 * model.addAttribute("name", userName); model.addAttribute("email", email);
		 * model.addAttribute("password", password);
		 
		return "processForm";
	}
     */
}
