package com.singtel.util;

import java.util.Arrays;

import com.singtel.model.Animal;
import com.singtel.model.Flyable;
import com.singtel.model.Singable;
import com.singtel.model.Swimable;
import com.singtel.model.Walkable;

public class CountingAnimals {

	public static int countFlyable(Animal[] animals) {
		if(animals == null) {
			throw new IllegalArgumentException();
		}
		
		return (int) Arrays.stream(animals).filter(a -> a instanceof Flyable).count();
	}
	
	public static int countWalkable(Animal[] animals) {
		if(animals == null) {
			throw new IllegalArgumentException();
		}
		
		return (int) Arrays.stream(animals).filter(a -> a instanceof Walkable).count();
	}
	
	public static int countSingable(Animal[] animals) {
		if(animals == null) {
			throw new IllegalArgumentException();
		}
		
		return (int) Arrays.stream(animals).filter(a -> a instanceof Singable).count();
	}
	
	public static int countSwimable(Animal[] animals) {
		if(animals == null) {
			throw new IllegalArgumentException();
		}
		
		return (int) Arrays.stream(animals).filter(a -> a instanceof Swimable).count();
	}
	
}
