package com.singtel.model.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.model.Rooster;
import com.singtel.model.Flyable;

public class RoosterTest {

	@Test
	public void testRoosterSound() {
		Rooster d = new Rooster();
		assertEquals("Cock-a-doodle-doo", d.sing());
	}
	
	@Test
	public void testRoosterNotFlyable() {
		assertEquals(false, new Rooster() instanceof Flyable);
	}
	
}
