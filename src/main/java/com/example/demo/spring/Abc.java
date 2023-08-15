package com.example.demo.spring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Abc {

	@GetMapping("/d")
	public String a(Model md) {
		
		String msg="asdfghjk";
		md.addAttribute("A", msg);
	    
		
		
		return "bo0ss";
	}





		@GetMapping("/go")
		public String come(Model md) {
			String msg="we are developers";
			md.addAttribute("Dk",msg);
			return "NewFile";

		}

		/*@GetMapping("/d")
		public ModelAndView abcd() {
			String a="hello";
			ModelAndView mvc=new ModelAndView();
			mvc.addObject("B", a);
			mvc.setViewName("c");
			return mvc;
		}*/

	}



