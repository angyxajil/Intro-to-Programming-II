package finalprep1;

public class LandAnimal extends Animal { // subclass of Animal

	// Enum CoveringType fur(0) or skin(1) or scales(1)
	public enum CoveringType {
		FUR, SKIN, SCALES
	}

	private String features; // variable to store the description of color and patterns - for example "blue
								// fur with orange spots"
	private CoveringType covering; // CoveringType covering //variable to store CoveringType

	// make a constructor
	LandAnimal() {
	}

	public LandAnimal(String animalName, double weight, String sound, FoodType fudtyp, String feat,
			CoveringType coverUp, animalType pred) {
		setAnimalName(animalName);
		setWeight(weight);
		setSound(sound);
		setFoodType(fudtyp);
		setFeatures(feat);
		setCovering(coverUp);
		setAnimalType(pred);
	}

	// add getters and setters for all the attributes
	public String getFeatures() {
		return features;
	}

	public void setFeatures(String decorations) {
		this.features = decorations;
	}

	public CoveringType getCovering() {
		return covering;
	}

	public void setCovering(CoveringType covering) {
		this.covering = covering;
	}

}
