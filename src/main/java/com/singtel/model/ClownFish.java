package com.singtel.model;

public class ClownFish extends Fish {

	public Color getColor() {
		return Color.ORANGE;
	}
	
	public Size getSize() {
		return Size.SMALL;
	}
	
	public String makeJoke() {
		return "ClownFish:Making Joke";
	}
}
