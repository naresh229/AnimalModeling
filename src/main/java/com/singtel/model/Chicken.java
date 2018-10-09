package com.singtel.model;

public class Chicken extends Bird implements Singable,Walkable{

	public String sing() {
		return "Cluck, cluck";
	}

	@Override
	public String walk() {
		return "Chicken:walking";
	}
}
