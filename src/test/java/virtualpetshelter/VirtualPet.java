package virtualpetshelter;

import java.util.Random;

public class VirtualPet {
	private String petName;
	private String description;

	Random rand = new Random();

	private int hunger = rand.nextInt(10) + 1;
	private int thirst = rand.nextInt(10) + 1;
	private int boredom = rand.nextInt(10) + 1;

	public VirtualPet(String petName, String description) {
		this.petName = petName;
		this.description = description;
	}

	public VirtualPet(String petName, String Description, int hunger, int thirst, int boredom) {
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	public String getPetName() {

		return petName;
	}

	public void feed() {
		hunger = 0;
		thirst += 5;
		boredom += 5;
	}

	public int getHunger() {
		return hunger;
	}

	public void play(int playTime) {
		boredom = boredom - playTime;
		if(boredom<0) {
			boredom = 0;
		}
	}

	public int getBoredom() {
		return boredom;
	}

	public void water() {
		thirst -= 10;
		if (thirst <0){
			thirst = 0;
		}
	}

	public int getThirst() {
		return thirst;
	}


	public void tickIt() {

		hunger = rand.nextInt(5) + 1;
		thirst = rand.nextInt(5) + 1;
		boredom = rand.nextInt(5) + 1;
	}
}
