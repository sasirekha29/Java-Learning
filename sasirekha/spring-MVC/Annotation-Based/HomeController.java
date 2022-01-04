package com.learn.springMVC;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
/**
public class HomeController extends AbstractController{
  
   @Override
   protected ModelAndView handleRequestInternal(HttpServletRequest request,
      HttpServletResponse response) throws Exception {
      ModelAndView model = new ModelAndView("home");
      model.addObject("message", "Welcome!");
      return model;
   }
}
*/

@Controller
public class HomeController{
	
	@RequestMapping("/welcome")
	public ModelAndView helloworld()
	{
		  ModelAndView model = new ModelAndView("home");
	      model.addObject("message", "Welcome!");
	      return model;
	}
}