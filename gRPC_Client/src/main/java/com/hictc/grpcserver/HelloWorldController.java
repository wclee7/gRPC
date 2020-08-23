package com.hictc.grpcserver;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	
	@RequestMapping(value="/helloworld")
	public ModelAndView world(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("helloworld");
		mav.addObject("msg", "wclee");
		return mav;
	}
	
	@RequestMapping(value = "/displayMessage/{msg}", method = RequestMethod.GET)
    public ModelAndView displayMessage(@PathVariable String msg) {
		ModelAndView mav = new ModelAndView("helloworld");
		System.out.println("#################### msg : "+msg);
        mav.addObject("msg", msg);  
        return mav;
    }	
	
}
