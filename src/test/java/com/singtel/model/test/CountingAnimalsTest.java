package com.singtel.model.test;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.singtel.model.Animal;
import com.singtel.model.Bird;
import com.singtel.model.ButterFly;
import com.singtel.model.Cat;
import com.singtel.model.CaterPillar;
import com.singtel.model.Chicken;
import com.singtel.model.ClownFish;
import com.singtel.model.Dog;
import com.singtel.model.Dolphin;
import com.singtel.model.Duck;
import com.singtel.model.Fish;
import com.singtel.model.Parrot;
import com.singtel.model.Rooster;
import com.singtel.model.Shark;
import com.singtel.util.CountingAnimals;

public class CountingAnimalsTest {
	
	Animal []animals ;
	@Before
	public void init() {
		animals = new Animal[]{
				new Bird(),
				new ButterFly(),
				new Cat(),
				new CaterPillar(),
				new Chicken(),
				new ClownFish(),
				new Dolphin(),
				new Duck(),
				new Fish(),
				new Parrot(),
				new Rooster(),
				new Shark()
		};
	}

	@Test(expected = IllegalArgumentException.class)
	public void testCountFlyableWhenNullArray() {
		CountingAnimals.countFlyable(null);
	}
	
	@Test
	public void testCountFlyableWhenEmptyArray() {
		assertEquals(0, CountingAnimals.countFlyable(new Animal[] {}));
	}
	
	@Test
	public void testCountFlyable() {
		assertEquals(3, CountingAnimals.countFlyable(animals));
	}

	@Test
	public void testCountFlyableWhenNoFlyable() {
		assertEquals(0, CountingAnimals.countFlyable(new Animal[] {new Chicken(),new Fish(),new Shark()}));
	}

	@Test
	public void testCountFlyableOnlyFlyables() {
		assertEquals(2, CountingAnimals.countFlyable(new Animal[] {new ButterFly(),new Parrot()}));
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testcountWalkableWhenNullArray() {
		CountingAnimals.countWalkable(null);
	}
	
	@Test
	public void testcountWalkableWhenEmptyArray() {
		assertEquals(0, CountingAnimals.countWalkable(new Animal[] {}));
	}
	
	@Test
	public void testcountWalkable() {
		assertEquals(6, CountingAnimals.countWalkable(animals));
	}

	@Test
	public void testcountWalkableWhenNoWalkable() {
		assertEquals(0, CountingAnimals.countWalkable(new Animal[] {new ButterFly(),new Fish(),new Shark()}));
	}

	@Test
	public void testcountWalkableOnlyWalkables() {
		assertEquals(5, CountingAnimals.countWalkable(new Animal[] {new Dog(),new Cat(),new Parrot(),new CaterPillar(),new Chicken()}));
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void testcountSingableWhenNullArray() {
		CountingAnimals.countSingable(null);
	}
	
	@Test
	public void testcountSingableWhenEmptyArray() {
		assertEquals(0, CountingAnimals.countSingable(new Animal[] {}));
	}
	
	@Test
	public void testcountSingable() {
		assertEquals(6, CountingAnimals.countSingable(animals));
	}

	@Test
	public void testcountSingableWhenNoSingable() {
		assertEquals(0, CountingAnimals.countSingable(new Animal[] {new ClownFish(),new Fish(),new Shark()}));
	}

	@Test
	public void testcountSingableOnlySingables() {
		assertEquals(4, CountingAnimals.countSingable(new Animal[] {new Dog(),new Cat(),new Parrot(),new Chicken()}));
	}
	
	
	@Test(expected = IllegalArgumentException.class)
	public void testcountSwimableWhenNullArray() {
		CountingAnimals.countSwimable(null);
	}
	
	@Test
	public void testcountSwimableWhenEmptyArray() {
		assertEquals(0, CountingAnimals.countSwimable(new Animal[] {}));
	}
	
	@Test
	public void testcountSwimable() {
		assertEquals(5, CountingAnimals.countSwimable(animals));
	}

	@Test
	public void testcountSwimableWhenNoSwimable() {
		assertEquals(0, CountingAnimals.countSwimable(new Animal[] {new ButterFly(),new CaterPillar(),new Chicken()}));
	}

	@Test
	public void testcountSwimableOnlySwimables() {
		assertEquals(4, CountingAnimals.countSwimable(new Animal[] {new ClownFish(),new Fish(),new Shark(),new Duck()}));
	}
}
