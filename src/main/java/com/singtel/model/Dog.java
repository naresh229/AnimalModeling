package com.singtel.model;

public class Dog extends Animal implements Singable,Walkable {

	public String sing() {
		return "Woof, woof";
	}

	@Override
	public String walk() {
		return "Dog:walking";
	}

}
