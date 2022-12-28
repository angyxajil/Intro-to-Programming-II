package realFinal;

import java.util.Scanner;
import realFinal.DryIngredient.DryIngredientType;
import realFinal.WetIngredient.WetIngredientType;

public class StartBakeCakePlanner {

	public static void main(String arghs[]) { // main()

		/*
		 * Make 3 DryIngredient objects and fill out the attributes do not set the
		 * cost-per-unit, make sure the constructor sets it to default of 0.0.
		 */
		DryIngredient dry1 = new DryIngredient(2.5, "Cup", DryIngredientType.FLOUR);
		DryIngredient dry2 = new DryIngredient(2.75, "Teaspoon", DryIngredientType.BAKINGPOWDER);
		DryIngredient dry3 = new DryIngredient(1.25, "Cup", DryIngredientType.SUGAR);

		WetIngredient wet1 = new WetIngredient(1.5, "Cup", WetIngredientType.MILK);
		WetIngredient wet2 = new WetIngredient(2, "Whole raw egg", WetIngredientType.EGG);
		WetIngredient wet3 = new WetIngredient(4, "Tablespoon", WetIngredientType.BUTTER);

//		Make a IngredientList object.
		IngredientList ingList = new IngredientList();

//		Add all the ingredients to the ingredientList.
		ingList.getMixings().add(dry1);
		ingList.getMixings().add(dry2);
		ingList.getMixings().add(dry3);
		ingList.getMixings().add(wet1);
		ingList.getMixings().add(wet2);
		ingList.getMixings().add(wet3);

// The main has NO Lists or Arrays in it - everything is stored in the class objects.

		int numberItems = ingList.getMixings().size(); // <--- actually not '1', fix this // OK!

		// loop through the list of ingredients and set the cost for each unit amount
		Scanner input = new Scanner(System.in);
		double tempCost = 0.0;
		int item = 0;

		while (item < numberItems) {
			System.out.println(
					"---------------------------------------------------------------------------------------------------");

//			get the next ingredient object in the list
			Ingredient tempList = ingList.getMixings().get(item); // something something .get(item), thanks for the
																	// hint!

//			display ingredient info
			System.out.println(tempList.toString()); // fixed!

			System.out.print("\nEnter the cost for a SINGLE unit of this ingredient: ");

			tempCost = input.nextDouble(); // just going to trust the user for good input values

// 			set the cost of a unit amount of the ingredient
//			use the setter to change the Cost Per Measurement Amount
			tempList.setCostPerMA(tempCost);

			item += 1;
		}

		input.close();

		for (int i = 0; i < numberItems; i++) {

//			display MediaItem info
			System.out.println();
			System.out.println("Bakery Invoice");
			System.out.println(ingList.getMixings().get(i).toString());
			System.out.println("---------------------------------------------------------------------------------------------------");

		}

		/*
		 * Finally, use the getTotalIngredientCost() method from the IngredientList
		 * class to print out the total cost for all of the ingredients used.
		 */
		System.out.println("Total cost of cake ingredients: " + ingList.getTotalIngredientCost());

	}

}
