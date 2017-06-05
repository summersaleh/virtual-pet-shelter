
public class VirtualPet {

	// List of attributes

	int thirst;
	int hunger;
	int boredom;
	String name;
	String description;

	// Constructor for virtual pet.

	public VirtualPet(String name, int hunger, int thirst, int boredom) {
		this.name = name;
		this.hunger = hunger;
		this.thirst = thirst;
		this.boredom = boredom;
	}

	// Constructor for the introduction of new pets

	public VirtualPet(String name, String description) {
		this.name = name;
		this.description = description;
		this.hunger = 10;
		this.thirst = 10;
		this.boredom = 10;
	}

	// Getters

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public int getThirst() {
		return thirst;
	}

	public int getHunger() {
		return hunger;
	}

	public int getBoredom() {
		return boredom;
	}

	// Methods

	void feedPets() {
		hunger -= 10;
	}

	void waterPets() {
		thirst -= 10;
	}

	void playWithPet() {
		boredom -= 10;
	}

	// Method for a menu to list the dogs and their stats.

	public String individualPetStats() {
		return name + "\t|\t" + hunger + "\t|\t" + thirst + "\t|\t" + boredom + "  |";
	}

	// Method to assign description to the dogs.

	public String giveDescription(String description) {
		this.description = description;
		return this.description;
	}

	// Override to properly print strings.

	@Override
	public String toString() {
		return name + description;
	}

}
