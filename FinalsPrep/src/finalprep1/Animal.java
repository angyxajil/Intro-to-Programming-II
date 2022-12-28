package finalprep1;

abstract class Animal {
	
	private String animalName; // String typeOfAnimal
	private double weight; // double weight
	private FoodType foodType;// FoodType foodType , variable to store the type of food it eats
	private String sound; // String sound it makes
	private animalType animalType;
	
	
	// Enum food type carnivore(0) herbivore(1) omnivore(1)
	public enum FoodType {
		CARNIVORES, HERBAVORES, ONMIVORES
	};

	
	// Enum type of animal prey(0) predator(1)
	public enum animalType {
		PREY, PREDATOR
	}

	// animalType animalType;

	public String getAnimalName() {
		return animalName;
	}


	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public FoodType getFoodType() {
		return foodType;
	}


	public void setFoodType(FoodType foodType) {
		this.foodType = foodType;
	}


	public String getSound() {
		return sound;
	}


	public void setSound(String sound) {
		this.sound = sound;
	}


	public animalType getAnimalType() {
		return animalType;
	}


	public void setAnimalType(animalType animalType) {
		this.animalType = animalType;
	}

}
