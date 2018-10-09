package com.singtel.model.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.singtel.model.Cat;
import com.singtel.model.Dog;
import com.singtel.model.Duck;
import com.singtel.model.Parrot;
import com.singtel.model.Rooster;
import com.singtel.model.Singable;

public class ParrotTest {

	@Test
	public void testParrotSingable() {
		assertEquals(true, new Parrot() instanceof Singable);
	}

	@Test
	public void testParrotSound() {
		Parrot d = new Parrot();
		assertEquals("mm mm", d.sing());
	}

	@Test
	public void testParrotSoundLivingWithDog() {
		Parrot d = new Parrot(new Dog());
		assertEquals("Woof, woof", d.sing());
	}

	@Test
	public void testParrotSoundLivingWithCat() {
		Parrot d = new Parrot(new Cat());
		assertEquals("Meow", d.sing());
	}

	@Test
	public void testParrotSoundLivingWithDuck() {
		Parrot d = new Parrot(new Duck());
		assertEquals("Quack,quack", d.sing());
	}

	@Test
	public void testParrotSoundLivingWithRooster() {
		Parrot d = new Parrot(new Rooster());
		assertEquals("Cock-a-doodle-doo", d.sing());
	}

}
