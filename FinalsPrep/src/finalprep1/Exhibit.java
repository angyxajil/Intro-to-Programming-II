package finalprep1;

import java.util.ArrayList;
import java.util.List;

public class Exhibit {

	public Exhibit() {
		animal = new ArrayList<>();
		decorations = new ArrayList<>();
	}

	ArrayList<Animal> animal; // ArrayList<Animal> animal
	ArrayList<String> decorations; // list<String> decorations
	Climate environment; // a variable to store the climate type in

	// Enum climate arctic(0) forest(1) jungle(2) desert(3)
	public enum Climate {
		ARCTIC, FOREST, JUNGLE, DESERT
	}

	// add getters and setters
	public List<Animal> getAnimal() {
		return this.animal;
	}

	public void setAnimal(ArrayList<Animal> animal) {
		this.animal = animal;
	}

	public void setDecorations(ArrayList<String> decorations) {
		this.decorations = decorations;
	}

	public List<String> getDecorations() {
		return this.decorations;
	}

	public Climate getEnvironment() {
		return environment;
	}

	public void setEnvironment(Climate environment) {
		this.environment = environment;
	}

}
