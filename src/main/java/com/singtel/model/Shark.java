package com.singtel.model;

public class Shark extends Fish {

	public Color getColor() {
		return Color.GREY;
	}
	
	public Size getSize() {
		return Size.LARGE;
	}
	
	public String eatFish() {
		return "Shark:Eating Fish";
	}
}
