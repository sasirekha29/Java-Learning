package com.example.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class EmailClient {
	
	private SpellChecker spellchecker;
	
	/**
	 * This is constructor (constructor injection)
	 *
	 */
	EmailClient(SpellChecker checker)
	{
		this.spellchecker=checker;
	}
	
	public void sendemail(String message)
	{
		spellchecker.spellchecking(message);
	}
	

}
