package realFinal;

public class DryIngredient extends Ingredient { // make subclass of Ingredient

	private DryIngredientType dryIngredient;

	public enum DryIngredientType {
		FLOUR, BAKINGPOWDER, SUGAR, SALT, YEAST
	}

//	add getters, setters
	public DryIngredientType getDryIngredient() {
		return dryIngredient;
	}

	public void setDryIngredient(DryIngredientType dryIngredient) {
		this.dryIngredient = dryIngredient;
	}

//	 add constructor - there is no default dryIngredient, must be specified in the constructor
	DryIngredient(double usedAmount, String measureType, DryIngredientType dryIngredient) {
		super(usedAmount, measureType);

		this.dryIngredient = dryIngredient;
	}

	@Override
	public String toString() {
		return "Ingredient Type: " + dryIngredient 
				+"\tMeasurment Units: " + getMeasurements() 
				+"\tAmount Used: " + getAmountUsed() 
				+"\tCost Per Unit: " + getCostPerMA();
	}

}
