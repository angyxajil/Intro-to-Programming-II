package finalprep2;

import java.util.ArrayList;
import java.util.Scanner;

import finalprep2.Exhibit.DisplayType;

public class StartMuseum {

	public static void main(String[] args) { // main()

		System.out.println("Welcome to the Museum.");
		System.out.println("Enjoy your journey of discovery today as you visit the exhibits.");

		System.out.println("\nPress enter to start the tour!");

//		Make a ArrayList<Exhibit>
		ArrayList<Exhibit> displays = new ArrayList<>();

		// String nameOfPerson, boolean isCursed, boolean magicProtection, String
		// nameOfArtifact, String description, String fromYear
		Mummy egyptian = new Mummy("Amenophis II", true, false, "Egyptian Mummy", "found under Pyramid", "3548 BCE");
		Exhibit e1 = new Exhibit(DisplayType.pedistal, egyptian);

		Mummy otzy = new Mummy("Ötzi", false, false, "Frozen Iceman", "found in French mountains", "200 AD");
		Exhibit e2 = new Exhibit(DisplayType.glassCase, otzy);
		// DisplayType dType, Artifact artIn

//		Add exhibits to array list
		displays.add(e1);
		displays.add(e2);

		Scanner scanner = new Scanner(System.in);
		int index = 0;
		while (index < displays.size()) {
			scanner.nextLine();
			System.out.println("--------------------------------");

			// display exhibit
			System.out.println(displays.get(index).toString()); //!!!!!
			System.out.println("\nPress Enter to view next exhibit");

			index++;

		}

		System.out.println("\nThank you for visiting the Museum. Looking forward to seeing you again in the future!");
		scanner.close();
	}
}