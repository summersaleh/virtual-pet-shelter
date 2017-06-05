import java.util.HashMap;
import java.util.Map;

public class VirtualPetShelter {

	// Map initialization

	Map<String, VirtualPet> shelterPets = new HashMap<String, VirtualPet>();

	// Tick to show the passing of time
	public void tick() {
		for (VirtualPet current : shelterPets.values()) {
			current.hunger += 10;
			current.thirst += 10;
			current.boredom += 10;
		}
	}

	// Method to add new dogs to the map.

	public void intakeNewPet(VirtualPet pet) {
		shelterPets.put(pet.getName().toLowerCase(), pet);
	}

	// to remove pets from the map when they are adopted

	public void removePet(String pet) {
		shelterPets.remove(pet);
	}

	// Code to print out the contents of the map in a table.

	public String shelterPets() {
		String rosterMenu = "Name        " + " Hunger    " + "     Thirst    " + "      Boredom ";
		String divider = "-----------------------------------------------------";
		String menuLine = "";
		for (VirtualPet entry : shelterPets.values()) {
			menuLine = entry.individualPetStats();
			rosterMenu = rosterMenu + "\n" + divider + "\n" + menuLine + "\n";
		}
		return rosterMenu;
	}

	// Code that allows specific dogs to get selected.

	public VirtualPet getDog(String name) {
		return shelterPets.get(name);
	}

	// method with loop to feed and water all the dogs

	public void feedAll() {
		for (VirtualPet current : shelterPets.values()) {
			current.feedPets();
		}
	}

	public void waterAll() {
		for (VirtualPet current : shelterPets.values()) {
			current.waterPets();
		}
	}

	public void playWithDog(String name) {
		getDog(name).playWithPet();
	}

	// Method for the main menu.

	public String getMainMenu() {
		return "What would you like to do next:\n 1) Feed the dogs\n 2) Give water the dogs\n 3) Play with a dog\n 4) Adopt a dog\n 5) Admit a dog\n ";
	}

	
	
	public String dogChoices() {
		String selectedPet = "";
		for (VirtualPet current: shelterPets.values()) {
			selectedPet = selectedPet + current.toString();
			
		}
		return selectedPet;
	}

}
