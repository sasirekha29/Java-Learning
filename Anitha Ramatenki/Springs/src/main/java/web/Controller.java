package com.in28minutes.learnsprings.sample.enterprise.flow.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.learnsprings.sample.enterprise.flow.business.BusinessService;

//Sending response in the right format
@RestController
public class Controller {
	
	@Autowired
     private BusinessService businsessService;
	//"/sum"=>100
	@GetMapping("/sum")
	public long displaySum() {
		return businsessService.calculateSum();
		
	}

}