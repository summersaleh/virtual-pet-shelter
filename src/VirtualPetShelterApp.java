import java.util.Scanner;

public class VirtualPetShelterApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		VirtualPetShelter summerShelter = new VirtualPetShelter();

		VirtualPet tuck = new VirtualPet("Tuck", 10, 10, 10);
		tuck.giveDescription("gets her name from her snowy white fur!");

		VirtualPet lump = new VirtualPet("Lump", 20, 20, 30);
		lump.giveDescription("loves to eat eat eat! Very high energy but super sweet!");

		VirtualPet bugs = new VirtualPet("Bugs", 20, 20, 30);
		bugs.giveDescription("mischevious! Very curious always looking for an andventure.");

		VirtualPet hope = new VirtualPet("Hope", 15, 15, 10);
		hope.giveDescription("the oldest from the bunch. Sweet, quiet, and loves to lounge.");

		summerShelter.intakeNewPet(tuck);
		summerShelter.intakeNewPet(lump);
		summerShelter.intakeNewPet(bugs);
		summerShelter.intakeNewPet(hope);

		System.out.println(
				"Welcome to Summer's Doges Without Dojos puppy shelter where every dog is a puppy no matter what its age is!\nThank you for volunteering with us today, the pups are really excited to play!\nTheir adorablness is so contagious that you might walk out of here with a new pet!");
		System.out.println("Type \"Quit\" at any time to leave the game.\n");

		// Game Loop

		do {

			System.out.println(summerShelter.shelterPets());

			System.out.println(summerShelter.getMainMenu());

			String choice = input.nextLine();
			checkForQuit(choice);

			switch (choice.toLowerCase()) {

			case "1":
				summerShelter.feedAll();
				System.out.println("Thanks for feeding the doges!");
				break;

			case "2":
				summerShelter.waterAll();
				System.out.println(
						"Boy they were thirsty! After all that water they are going to need a fire hydrant real soon.");
				break;

			case "3":
				System.out.println("Which dog would you like to play with:");
				System.out.println(summerShelter.dogChoices());
				String playChoice = input.nextLine().toString().toLowerCase();
				checkForQuit(playChoice);
				summerShelter.playWithDog(playChoice);
				System.out.println("Thank for playing with " + playChoice + "\n");
				break;

			case "4":
				System.out.println(summerShelter.dogChoices());
				System.out.println("Which dog did you want to adpot?");
				String dogChoice = input.nextLine();
				checkForQuit(dogChoice);
				summerShelter.removePet(dogChoice.toLowerCase());
				System.out
						.println("Thank you for adopting " + dogChoice + ", you guys will make each other very happy!");
				break;

			case "5":
				System.out.println("What is the name of the dog you are donating?");
				String donatedDog = input.nextLine();
				checkForQuit(donatedDog);
				System.out.println("Give us a description of the dog");
				String donatedDescription = input.nextLine(); 
				VirtualPet newDonatedDog = new VirtualPet(donatedDog, donatedDescription);
				summerShelter.intakeNewPet(newDonatedDog);
				System.out.println("We will make sure this little pup finds a new loving home!");
				break;

			}

			summerShelter.tick();

		} while (!input.equals("quit"));

		input.close();

	}

	public static void checkForQuit(String input) {
		if (input.equalsIgnoreCase("quit")) {
			System.out.println("Thank you for playing!");
			System.exit(0);

		}

	}
}
