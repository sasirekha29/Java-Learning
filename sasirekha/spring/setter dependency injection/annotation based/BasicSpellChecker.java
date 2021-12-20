package com.example.learnspring;

import org.springframework.stereotype.Component;

@Component
public class BasicSpellChecker implements SpellChecker {
	
	public void init() {
        System.out.println("init inside Basic Spell Checker");
    }
	
	public void spellchecking(String emailmessage) 
	{
		if(emailmessage!=null) {
		System.out.println("Spelling is checked using basicspellchecker...");
		System.out.println("Spell checking completed!!..");
		System.out.println(emailmessage);
		}
		else
		{
			throw new RuntimeException("Error occured while checking the spelling!!");
		}
		
	}
	public void destroy()
	{
		System.out.println("destroy inside Basic Spell Checker");
	}

}
