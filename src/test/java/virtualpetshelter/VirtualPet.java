package virtualpetshelter;

import java.util.Random;

public class VirtualPet {
	private String petName;
	private String description;
	private int hunger;
	private int boredom;
	private int thirst;
	
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
		thirst +=5;
		boredom +=5;
	}
	public int getHunger() {
		return hunger;
	}
	public void play(int playTime) {
		boredom = boredom - playTime;
	}
	public void water() {
		thirst +=0;
	}
	
	public void tick() {
		
	}
	public int getBoredom() {
		return boredom;
	}
	public void tickIt() {
		Random rand = new Random();
		 hunger = rand.nextInt(10) + 1;
		 thirst = rand.nextInt(10) + 1;
		 boredom = rand.nextInt(10) + 1;
	}
}
