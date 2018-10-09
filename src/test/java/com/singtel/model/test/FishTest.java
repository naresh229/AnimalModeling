package com.singtel.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.model.Fish;
import com.singtel.model.Singable;
import com.singtel.model.Swimable;
import com.singtel.model.Walkable;

public class FishTest {
	
	Fish fish;
	
	@Before
	public void init() {
		fish = new Fish();
	}

	@Test
	public void testFishDoNotSing() {
		assertNotEquals(true, fish instanceof Singable);
	}
	
	@Test
	public void testFishDoNotWalk() {
		assertNotEquals(true, fish instanceof Walkable);
	}

	@Test
	public void testFishSwimmable() {
		assertEquals(true, fish instanceof Swimable);
	}
	@Test
	public void testFishSwimming() {
		assertEquals("Fish:Swimming", fish.swim());
	}
	
	

}
