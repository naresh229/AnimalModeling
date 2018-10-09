package com.singtel.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.model.Color;
import com.singtel.model.Shark;
import com.singtel.model.Size;

public class SharkTest {

	Shark shark;

	@Before
	public void init() {
		shark = new Shark();
	}

	@Test
	public void testSharkSize() {
		assertEquals(Size.LARGE, shark.getSize());
	}
	
	@Test
	public void testSharkColor() {
		assertEquals(Color.GREY, shark.getColor());
	}
	
	@Test
	public void testSharkEatingFish() {
		assertEquals("Shark:Eating Fish",shark.eatFish());
	}

}
