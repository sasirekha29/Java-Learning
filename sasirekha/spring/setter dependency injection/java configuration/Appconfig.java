package com.example.learnspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.example.learnspring")
public class Appconfig {

public BasicSpellChecker CreateBasicSpellChecker()
	{
		return new BasicSpellChecker();
	}
	
	@Bean(name="AdvancedSpellchecker")
	public AdvancedSpellchecker CreateAdvancedSpellChecker()
	{
		return new AdvancedSpellchecker();
	}

	@Bean(name="Client")
	public EmailClient CreateEmailClient()
	{
		// return new EmailClient(createBasicSpellChecker());
		EmailClient emailclient=new EmailClient();
		//emailclient.setSpellchecker(CreateBasicSpellChecker());
		emailclient.setSpellchecker(CreateAdvancedSpellChecker());
		return emailclient;
	}
}
