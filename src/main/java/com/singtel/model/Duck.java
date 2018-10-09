package com.singtel.model;

public class Duck extends Bird implements Swimable,Flyable,Walkable{

	public String sing() {
		return "Quack,quack";
	}

	public String swim() {
		return "Duck:Swiming";
	}
	
	public String fly() {
		return "Duck:Flying";
	}

	@Override
	public String walk() {
		return "Duck:Walking";
	}
}
