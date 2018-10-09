package com.singtel.model.test;
import static org.junit.Assert.*;

import org.junit.Test;

import com.singtel.model.Bird;
import com.singtel.model.Singable;

public class BirdTest {

	@Test
	public void testBirdSingable() {
		Bird b = new Bird();
		assertEquals(true, b instanceof Singable);
	}
	
	@Test
	public void testSing() {
		Bird b = new Bird();
		assertEquals("Iam Singing", b.sing());
	}

}
