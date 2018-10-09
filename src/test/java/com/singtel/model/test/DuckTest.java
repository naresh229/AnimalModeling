package com.singtel.model.test;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.model.Duck;
import com.singtel.model.Flyable;
import com.singtel.model.Swimable;

public class DuckTest {

	
	@Test
	public void testDuckSound() {
		Duck d = new Duck();
		assertEquals("Quack,quack", d.sing());
	}
	
	@Test
	public void testDuckSwimable() {
		assertEquals(true, new Duck() instanceof Swimable);
	}
	
	@Test
	public void testDuckSwimming() {
		Duck d = new Duck();
		assertEquals("Duck:Swiming", d.swim());
	}

	
	@Test
	public void testDuckFlyable() {
		assertEquals(true, new Duck() instanceof Flyable);
	}
	
	@Test
	public void testDuckFlyming() {
		Duck d = new Duck();
		assertEquals("Duck:Flying", d.fly());
	}
	
	
}
