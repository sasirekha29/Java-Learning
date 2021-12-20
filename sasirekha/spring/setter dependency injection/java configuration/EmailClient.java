package com.example.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class EmailClient {
	
	private SpellChecker spellchecker;
	
	public void sendemail(String message)
	{
		spellchecker.spellchecking(message);
	}
@Autowired
	public void setSpellchecker(@Qualifier("advancedSpellchecker")SpellChecker spellchecker) {
		this.spellchecker = spellchecker;
	}
	

}
