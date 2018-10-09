package com.singtel.model.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.model.Chicken;
import com.singtel.model.Flyable;

public class ChickenTest {

	@Test
	public void testChickenSound() {
		Chicken d = new Chicken();
		assertEquals("Cluck, cluck", d.sing());
	}
	
	@Test
	public void testChickenNotFlyable() {
		assertEquals(false, new Chicken() instanceof Flyable);
	}
	
}
