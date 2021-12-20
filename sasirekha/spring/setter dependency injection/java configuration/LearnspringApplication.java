package com.example.learnspring;



import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import org.springframework.context.ConfigurableApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;





public class LearnspringApplication 
{

	
public static void main(String[] args) 
{

ApplicationContext context= new AnnotationConfigApplicationContext(Appconfig.class);
EmailClient client=context.getBean("emailClient",EmailClient.class);
	client.sendemail("This is for testing");
	}

}
			