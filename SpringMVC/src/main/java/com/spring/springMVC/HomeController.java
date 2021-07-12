package com.spring.springMVC;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		System.out.println("this is the home url");
		return "home";
	}
	
	@RequestMapping("/index")
	public String getIndex(Model model) {
		model.addAttribute("name","mujahid");
		model.addAttribute("id", "123");
		return "index";
	}
	
	@RequestMapping("/")
	public ModelAndView getHelp() {
		ModelAndView mav=new ModelAndView();
		mav.addObject("name","mujahid");
		mav.addObject("id" , 123);
		List<String> frnds= new ArrayList<String>();
		frnds.add("mujahid");
		frnds.add("majahar");
		frnds.add("mosaheb");
		frnds.add("monu");
		mav.addObject("frnds", frnds);
		mav.setViewName("help");
		return mav;
	}
	
}
