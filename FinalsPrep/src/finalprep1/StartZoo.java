package finalprep1;

import java.util.ArrayList;
import java.util.Scanner;
import finalprep1.Animal.FoodType;
import finalprep1.Animal.animalType;
import finalprep1.Exhibit.Climate;
import finalprep1.LandAnimal.CoveringType;

// command line program

public class StartZoo {

	public static void main(String[] args) {

		System.out.println("Welcome to the Zoo.");
		System.out.println("Enjoy your journey of discovery today as you visit the exhibits.");

		System.out.println("\nPress enter to start the tour!");

//		make 2 LandAnimal objects - fill in all their attributes
		LandAnimal hippo = new LandAnimal();
		hippo.setAnimalType(animalType.PREY);
		hippo.setCovering(CoveringType.SKIN);
		hippo.setFeatures("purpl-ish and rubbery");
		hippo.setFoodType(FoodType.HERBAVORES);
		hippo.setSound("gr gr rgurunt");
		hippo.setAnimalName("Hippopotamus");
		hippo.setWeight(4000.53);

//		String animalName, double weight, String sound, FoodType fudtyp, String
		// decor, CoveringType coverUp, animalType pred
		LandAnimal pbear = new LandAnimal("Polar Bear", 990.25, "grrowwl", FoodType.CARNIVORES, "thick white coating",
				CoveringType.FUR, animalType.PREDATOR);

//		make 2 Exhibit objects - set the climate
		Exhibit jungle = new Exhibit();
		jungle.setEnvironment(Climate.JUNGLE);

		Exhibit arctic = new Exhibit();
		arctic.setEnvironment(Climate.ARCTIC);

//		add one LandAnimal to each exhibit
		// jungle.animal.add(hippo); // really dont know if this is even right ): // CLOSE!
		jungle.getAnimal().add(hippo);
		arctic.getAnimal().add(pbear);

//		put some decoration in each exhibit (at least 1 decoration)
		jungle.getDecorations().add("a Waterfall");
		jungle.getDecorations().add("lots and lots of trees");

		arctic.getDecorations().add("so much snow");
		arctic.getDecorations().add("a fake ocean");

//		make an ArrayList to hold both exhibits
		ArrayList<Exhibit> exhibits = new ArrayList<>();
		exhibits.add(jungle);
		exhibits.add(arctic);

//		Make a while loop that will repeat as long as there are unseen exhibits (in this case it will run twice)
		
		Scanner scanner = new Scanner(System.in);

		int repeats = 0;
		while (repeats < exhibits.size()) {
			scanner.nextLine();
			System.out.println("----------------------------------------------------");
			
			Exhibit tempExhib = exhibits.get(repeats); // dont know how this works ):
			
			System.out.println("In this Exhibit, we have " + tempExhib.getDecorations().get(0) + " and ");
			System.out.println(tempExhib.getDecorations().get(1));
			System.out.println("\nYou'll notice, this resembles the " + tempExhib.getEnvironment());
			
			
			LandAnimal tempLA = (LandAnimal) tempExhib.getAnimal().get(0); // dont know what this means ):
			
			System.out.println("This enviro- *gasp* Is that a " + tempLA.getAnimalName() + "?!?");
			System.out.println("\n" + tempLA.getSound() + " :o Sure sounds like it!");
			System.out.println("This beautiful creature weighs about " + tempLA.getWeight() + " pounds!");
			System.out.println("\nFun fact: they are " + tempLA.getFoodType());
			System.out.println("\nBecause of their environment, these beautiful animals "
					+ "\nhave " + tempLA.getFeatures() + " " + tempLA.getCovering()); 
			
			System.out.println("\nPress enter to visit the next Exhibit!");

			repeats++;
		}
		
		System.out.println("\nWelp, That is all for today!");
		System.out.println("Thank you for visiting the Zoo. Looking forward to seeing you again in the future!");
		scanner.close();
	}

} 
