package virtualpetshelter;

import java.util.Scanner;

public class VirtualPetShelterApp {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		VirtualPetShelter myPet = new VirtualPetShelter();

		VirtualPet Boris = new VirtualPet("Boris", " A seal: clumsy, overfed, loves his naps");
		VirtualPet Dima = new VirtualPet("Dima", "A bald eagle: fierce and cold blooded");
		VirtualPet Peago = new VirtualPet("Peago", "The puggle: lazy, scaredy cat and fat");
		VirtualPet Kiki = new VirtualPet("Kiki", "The kitty: mischievous, tiny and fiesty");
		myPet.add(Boris);
		myPet.add(Dima);
		myPet.add(Peago);
		myPet.add(Kiki);

		System.out.println("Welcome to Unique Pet Shelter!");
		Boolean quit = false;
		while (quit == false) {
			System.out.println("The pet's stats are: ");
			System.out.println("Name\t|Hunger\t|Thirst\t|Boredom|Dirt Level");
			System.out.println("--------------------------------------------");
			for (VirtualPet eachPet : myPet.getAllPets()) {
				System.out.println(eachPet.getPetName() + "  \t|" + eachPet.getHunger() + "\t|" + eachPet.getThirst()
						+ "\t|" + eachPet.getBoredom() + "\t|" + eachPet.getDirtLevel());
			}
			System.out.println("What would you like to do next?");
			System.out.println(
					"1. Feed Pets\n2. Water Pets\n3. Play with a pet\n4. Adopt a pet\n5. Admit a pet\n6. Clean a cage\n7. Quit");
			int userChoice = input.nextInt();
			while (userChoice < 1 || userChoice > 7) {
				System.out.println("Please choose from the following numbers: ");
				System.out.println(
						"1. Feed Pets\n2. Water Pets\n3. Play with a pet\n4. Adopt a pet\n5. Admit a pet\n6. Quit");
				userChoice = input.nextInt();
			}
			input.nextLine();
			if (userChoice == 1) {
				System.out.println("Ok, let's feed all pets!");
				myPet.feedAll();

			}

			else if (userChoice == 2) {
				System.out.println("Nice! They all got their water");
				myPet.waterAll();
			} else if (userChoice == 3) {
				int playTime;
				System.out.println("Ok, so you'd like to play! Please choose one: ");
				for (VirtualPet eachPet : myPet.getAllPets()) {
					System.out.println("[" + eachPet.getPetName() + "]" + "  " + eachPet.getDescription());
				}
				String petChoice = input.nextLine();
				System.out.println("Select how long you want to play between 0-10");
				playTime = input.nextInt();
				if (petChoice.equals("Boris")) {
					myPet.playWithPet(petChoice, playTime);
					System.out.println("Slips falls, passes out");
				} else if (petChoice.equals("Peago")) {
					myPet.playWithPet(petChoice, playTime);
					System.out.println("You tired him completely out!");
				} else if (petChoice.equals("Dima")) {
					myPet.playWithPet(petChoice, playTime);
					System.out.println("*Glares and gouges your eyes out*");
				} else if (petChoice.equals("Kiki")) {
					myPet.playWithPet(petChoice, playTime);
					System.out.println("Hides under the shrub while you search frantically in 90 degree weather");
				} else
					System.out.println("Please check the names and try again");
			}
			if (userChoice == 4) {
				System.out.println("We're so glad you'd like to adopt a pet!");
				System.out.println("Please choose whom you'd like to adopt: Boris, Dima, Peago or Kiki?");

				try {
					String adoptChoice = input.nextLine();
					switch (adoptChoice) {
					case "Boris":
						System.out.println("Passes out.");
						break;
					case "Peago":
						System.out.println("Gets up slowly and waddles to you");
						break;
					case "Kiki":
						System.out.println("Already found half your lost items in the car");
						break;
					case "Dima":
						System.out.println("Soars to freedom without looking back");
						break;
					default:
						System.out.println("Type in the name right?");
					}

				} catch (Exception e) {

				}
			}
			if (userChoice == 5) {
				System.out.println("We'd love to take care of a new pet!");
				System.out.println("What is the pet's name?");
				String admitPetName = input.nextLine();
				System.out.println("Can you briefly describe " + admitPetName);
				String description = input.nextLine();
				VirtualPet newP = new VirtualPet(admitPetName, description);
				myPet.add(newP);

			}
			if (userChoice == 6) {
				System.out.println("Ooh, you want to get your hands dirty! Whose cage would you like to clean?");
				for (VirtualPet eachPet : myPet.getAllPets()) {
					System.out.println("[" + eachPet.getPetName() + "]" + "  " + eachPet.getDescription());
				}
				String petToClean = input.nextLine();
				myPet.cleanACage(petToClean);
			}
			if (userChoice == 7) {
				System.out.println("So sorry to see you go, come back again!");
				System.exit(0);
			}
			myPet.tick();
		}
		input.close();
	}
}
