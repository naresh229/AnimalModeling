package com.singtel.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.model.Color;
import com.singtel.model.ClownFish;
import com.singtel.model.Size;

public class ClownFishTest {

	ClownFish clownFish;

	@Before
	public void init() {
		clownFish = new ClownFish();
	}

	@Test
	public void testClownFishSize() {
		assertEquals(Size.SMALL, clownFish.getSize());
	}
	
	@Test
	public void testClownFishColor() {
		assertEquals(Color.ORANGE, clownFish.getColor());
	}
	
	@Test
	public void testClownFishMakingJoke() {
		assertEquals("ClownFish:Making Joke",clownFish.makeJoke());
	}

}
