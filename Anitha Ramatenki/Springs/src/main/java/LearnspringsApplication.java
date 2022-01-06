package com.in28minutes.learnsprings;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.in28minutes.learnsprings.game.GameRunner;

@SpringBootApplication
@ComponentScan("com.in28minutes.learnsprings")
public class LearnspringsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(LearnspringsApplication.class, args);
		
		//GameRunner
		
		GameRunner runner = context.getBean(GameRunner.class);
		//MarioGame game = new MarioGame();
		//SuperContraGame game = new SuperContraGame();
		//GameRunner runner = new GameRunner;
		
		runner.runGame();
	}

}
