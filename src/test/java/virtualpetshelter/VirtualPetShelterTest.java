package virtualpetshelter;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class VirtualPetShelterTest {
	VirtualPetShelter underTest;
	String petName;
	VirtualPet pet1;

	@Before
	public void setUp() {
		underTest = new VirtualPetShelter();
		pet1 = new VirtualPet("a", "yellow");

	}

	@Test
	public void returnAllPets() {
		Collection<VirtualPet> allPets = underTest.getAllPets();
	}

	@Test
	public void returnASpecificPetByName() {
		underTest.findPet(petName);
	}

	@Test
	public void addHomelessPet() {
		underTest.add(pet1);
		VirtualPet retrievedPet = underTest.findPet("a");
		assertThat(retrievedPet, is(pet1));
	}

	@Test
	public void shouldDecreaseHunger() {
		VirtualPet pet2 = new VirtualPet("", "", 5, 3, 2, 1);
		pet2.feed();
		assertEquals(0, pet2.getHunger());
	}

	@Test
	public void shouldDecreaseThirstOfAll() {

	}

	@Test
	public void playWithEachPet() {
		underTest.add(pet1);
		underTest.playWithPet(pet1.getPetName(), 10);
		assertThat(pet1.getBoredom(), is(0));
	}

	public void parametersShouldChangeOverTime() {
		int boredomBefore = pet1.getBoredom();
		underTest.tick();
		int boredomAfter = pet1.getBoredom();
		assertTrue(boredomBefore < boredomAfter);
	}
}
