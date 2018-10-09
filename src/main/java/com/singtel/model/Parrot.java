package com.singtel.model;

public class Parrot extends Bird implements Flyable,Walkable {

	private Singable livingmate;

	public Parrot() {

	}

	public Parrot(Singable livingmate) {

		this.livingmate = livingmate;
	}

	public String fly() {
		return "Parrot:Flying";
	}
	
	public String sing() {
		if(livingmate != null) {
			return livingmate.sing();
		}
		return "mm mm";
	}

	@Override
	public String walk() {
		return "Parrot:Walking";
	}

}
