package com.in28minutes.learnsprings.game;

import org.springframework.stereotype.Component;

@Component
public class MarioGame implements GamingConsole {
	
	public void up() {
		
		System.out.println("jump");
	}
	
public void down() {
		
		System.out.println("go into hole");
		}
		
	
		public void left() {
			
			System.out.println("stop");
		}
	

		public void right() {
			
			System.out.println("ga faster");
		}
}
