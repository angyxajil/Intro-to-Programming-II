package Software;

import java.util.Scanner;

public abstract class Hanger extends SortingVehicles {
	
	public Hanger () {
		
		String idNum;
		String issue;

		System.out.println("Type of Vehicle (Land, Air, Farm):");
		
		Scanner input = new Scanner(System.in);
		
		String type;
		type = input.nextLine();
		public int countH = 0;
		
		if (type.equals("Air") || type.equals("air")) {
			countH ++;
			
		System.out.println("License Plate / ID Number:");
		
		idNum = input.nextLine();
		
		System.out.println("Choose an issue");
		System.out.println("Wheels		Wings		Engine		Air Bags 	 Landing Gears");
		issue = input.nextLine();
		
		if (issue.equals("Wheels")) {
			int wheel = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Wheels' will take " + wheel + "hours to complete.");
		}
		if (issue.equals("Wings")) {
			int wing = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Wings' will take " + wing + "hours to complete.");
		}
		if (issue.equals("Engine")) {
			int e = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Engine' will take " + e + "hours to complete.");
		}
		
		if (issue.equals("Air Bags")) {
			int ab = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Air Bags' will take " + ab + "hours to complete.");
		}
		
		if (issue.equals("Landing Gears")) {
			int land = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Landing Gears' will take " + land + "hours to complete.");
		}
		
		}
		
	}
}