package Software;

import java.util.Scanner;

public abstract class Garage extends SortingVehicles {

	public Garage () {
		System.out.println("Type of Vehicle (Land, Air, Farm):");
		Scanner input = new Scanner(System.in);
		
		String type;
		String idNum;
		String issue;
		
		System.out.println("Type of Vehicle (Land, Air, Farm):");
		type = input.nextLine();
		public static final int countG = 0;
		
		if (type.equals("Land") || type.equals("land")) {
			countG ++;
			System.out.println("License Plate / ID Number:");
		}
		
		idNum = input.nextLine();
		
		System.out.println("Choose an issue");
		System.out.println("Wheels		Radiator	 Battery		Air Conditioner		Oil Filter");
		issue = input.nextLine();
		
		if (issue.equals("Wheels")) {
			int w = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Wheels' will take " + w + "hours to complete.");
		}
		if (issue.equals("Radiator")) {
			int r = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Radiator' will take " + r + "hours to complete.");
		}
		if (issue.equals("Battery")) {
			int b = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Battery' will take " + b + "hours to complete.");
		}
		
		if (issue.equals("Air Conditioner")) {
			int ac = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Air Conditioner' will take " + ac + "hours to complete.");
		}
		
		if (issue.equals("Oil Filter")) {
			int f = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Oil Filter' will take " + f + "hours to complete.");
		}
		
	}
	
}