package com.learn.SpringMVCFORM;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admission.html", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm()
	{
		ModelAndView model=new ModelAndView("AdmissionForm");
		return model;
	}
	
	@ModelAttribute
	public void addcommonobjects(Model model1)
	{
		model1.addAttribute("message","Engineering courses Details!!");
	}
	@RequestMapping(value="/submission.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1, @ModelAttribute("address1") Address address1,BindingResult result)
	{
		if(result.hasErrors())
		{
			ModelAndView model=new ModelAndView("AdmissionForm");
			return model;
		}
	student1.setAddress(address1);
		ModelAndView model=new ModelAndView("SubmissionForm");
		return model;
	}
}
