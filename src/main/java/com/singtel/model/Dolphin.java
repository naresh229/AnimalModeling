package com.singtel.model;

public class Dolphin extends Animal implements Swimable {

	@Override
	public String swim() {
		return "Dolphin:Swiming";
	}

}
