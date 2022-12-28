package realFinal;

public class WetIngredient extends Ingredient { // make subclass of Ingredient

	private WetIngredientType wetIngredient;

	public enum WetIngredientType {
		EGG, MILK, WATER, BUTTER
	}

//	add constructor - there is no default wetIngredient, must be specified in the constructor
	public WetIngredient(double usedAmount, String measureType, WetIngredientType wetIngredient) {
		super(usedAmount, measureType);

		this.wetIngredient = wetIngredient;

	}

//	add getters, setters,
	public WetIngredientType getWetIngredient() {
		return wetIngredient;
	}

	public void setWetIngredient(WetIngredientType wetIngredient) {
		this.wetIngredient = wetIngredient;
	}

	@Override
	public String toString() {
		
		return "Ingredient Type: " + wetIngredient 
		+"\tMeasurment Units: " + getMeasurements() 
		+"\tAmount Used: " + getAmountUsed() 
		+"\tCost Per Unit: " + getCostPerMA();
	}

}
