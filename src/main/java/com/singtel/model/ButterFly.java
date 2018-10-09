package com.singtel.model;

public class ButterFly extends Animal implements Flyable {

	private CaterPillar myOldLife;
	
	public String fly() {
		return "Butterfly:Flying";
	}

}
