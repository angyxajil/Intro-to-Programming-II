package Software;

import java.util.Scanner;

public abstract class Stables extends SortingVehicles {

	public Stables () {
	
		String idNum;
		String issue;
		
		System.out.println("Type of Vehicle (Land, Air, Farm):");
		
		Scanner input = new Scanner(System.in);
		
		String type;
		type = input.nextLine();
		public int countS = 0;
		
		if (type.equals("farm") || type.equals("Farm")) {
			countS++;
		System.out.println("License Plate / ID Number:");
		
		System.out.println("Choose an issue");
		System.out.println("Wheels		Catatalytic Converter		Engine		Oil Change		 Gears");
		issue = input.nextLine();
		
		if (issue.equals("Wheels")) {
			int wheel = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Wheels' will take " + wheel + "hours to complete.");
		}
		if (issue.equals("Catatalytic Converter")) {
			int conv = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Converter' will take " + conv + "hours to complete.");
		}
		if (issue.equals("Engine")) {
			int e = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Engine' will take " + e + "hours to complete.");
		}
		
		if (issue.equals("Oil Change")) {
			int oc = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Oil Change' will take " + oc + "hours to complete.");
		}
		
		if (issue.equals("Gears")) {
			int gear = (int)((Math.random()* 20) + 1);
			System.out.println("Issue: 'Landing Gears' will take " + gear + "hours to complete.");
		}

		
		
		}
	}
	
}