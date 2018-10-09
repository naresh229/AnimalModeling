package com.singtel.model;

public class Cat extends Animal implements Singable,Walkable {

	public String sing() {
		return "Meow";
	}

	@Override
	public String walk() {
		return "Cat:walking";
				
	}

}
