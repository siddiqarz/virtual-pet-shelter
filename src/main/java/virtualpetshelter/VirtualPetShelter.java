package virtualpetshelter;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {
	Map<String, VirtualPet> pets = new HashMap<String, VirtualPet>();

	public Collection<VirtualPet> getAllPets() {
		return pets.values();
	}

	public VirtualPet findPet(String petName) {
		return pets.get(petName);

	}

	public void add(VirtualPet pet) {
		pets.put(pet.getPetName(), pet);

	}

	public void feedAll() {
		for (VirtualPet eachPet : getAllPets()) {
			eachPet.feed();
		}
	}

	public void waterAll() {
		for (VirtualPet eachPet : getAllPets()) {
			eachPet.water();
		}
	}

	public void playWithPet(String petName, int playTime) {
		VirtualPet playWith = findPet(petName);
		playWith.play(playTime);
	}

	public void cleanACage(String petName) {
		VirtualPet cleanIt = findPet(petName);
		cleanIt.clean();
	}

	public void tick() {
		for (VirtualPet eachPet : getAllPets()) {
			eachPet.tickIt();
		}
	}

	public void remove(VirtualPet pet) {
		pets.remove(pet.getPetName(), pet);
	}

	
}
