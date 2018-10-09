package com.singtel.model;


public class Fish extends Animal implements Swimable {

	@Override
	public String swim() {
		return "Fish:Swimming";
	}
	
	public Size getSize() {
		return Size.SMALL;
	}
	
	public Color getColor() {
		return Color.WHITE;
	}

}
