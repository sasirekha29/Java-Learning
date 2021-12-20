package com.example.learnspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class EmailClient {
	
	private SpellChecker spellchecker;
	
	
	public void sendemail(String message)
	{
		spellchecker.spellchecking(message);
	}

	/**
	 * This is setter(setter injection)
	 *
	 */
	public void setSpellchecker(SpellChecker spellchecker) {
		this.spellchecker = spellchecker;
	}

}
