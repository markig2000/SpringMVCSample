
package com;

import java.io.FileInputStream;
import java.util.Base64;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class HelloController {

	/*@RequestMapping("/hello")
	public ModelAndView mymethod(){
		return new ModelAndView("hellopage","msg","Hello First Spring");
	}*/
	
	@RequestMapping("/hello")
	public ModelAndView mymethod(){
		
		
		
		return new ModelAndView("hellopage","msg","Hello First Spring");
	}
}
