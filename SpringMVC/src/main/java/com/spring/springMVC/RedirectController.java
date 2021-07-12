package com.spring.springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	@RequestMapping("/one")
	public String one() {
		System.out.println("this is the one page");
		return "redirect:/two";
	}
	
	@RequestMapping("/two")
	public String Two(Model m) {
		System.out.println("this is the Second page");
		m.addAttribute("msg", "wow we redirect from one page");
		return "twoPage";
	}
	
}
