package realFinal;

import java.util.ArrayList;

public class IngredientList {

//	private ArrayList of Ingredient objects
	private ArrayList<Ingredient> mixings;

//	add getter
	public ArrayList<Ingredient> getMixings() {
		return mixings;
	}

//	add constructor(s) as needed
	public IngredientList() {
		mixings = new ArrayList<>();
	}

//	Include a getTotalIngredientCost() method
	public double getTotalIngredientCost() {
		
		double totalCost = 0;
		
		for (int i = 0; i < mixings.size(); i++) {
			totalCost += mixings.get(i).getCostPerMA() * mixings.get(i).getAmountUsed();
		}
		double totalRoundOff = (double) Math.round(totalCost * 100) / 100; // optional
		
		return totalRoundOff;

		/* This method calculates the
		 * total cost for all the ingredient objects by looping through the ingredient
		 * ArrayList. Total Cost Formula: ( sum-of-all (CostPerMeasurementAmmount *
		 * getAmountUsed) ) ) Return the result as a double.
		 */
		
	}

}
