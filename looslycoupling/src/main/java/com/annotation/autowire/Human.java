package com.annotation.autowire;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {

	private Heart heart;

	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}

	public void displayHeatStatus() {
		if(heart!=null)
			heart.heartBeat();
		else 
			System.out.println("you are dead...! :( ");
	}
}
