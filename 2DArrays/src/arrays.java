import java.util.Scanner; 

public class arrays {
	public static void main (String[] args) {
		
		/* 
		 * initializes variables needed to create matrix columns and rows
		 */
		
		int columns;
		int rows;
		int max = 10;
		int min = 5;
		
		/*
		 * lines 19-28 read and validate input for columns, input must be an integer between 5 and 10
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of columns. Must be an integer between 5 and 10: ");
		columns = input.nextInt();
		
		while (columns > max || columns < min) {
				System.out.println("Your input is invalid.");	// message to be outputted when input is invalid 
				System.out.println("Enter the number of columns. Must be an integer between 5 and 10: ");
				columns = input.nextInt();
		}
		
		/*
		 * reads and validates input for rows, must be an integer between 5 and 10
		 */
		
		System.out.println("Enter the number of rows. Must be an integer between 5 and 10: ");
		rows = input.nextInt();
		
		while (rows > max || rows < min) {
			System.out.println("Your input is invalid.");
			System.out.println("Enter the number of rows. Must be an integer between 5 and 10: ");
			rows = input.nextInt();
		}
		
		input.close(); // closing scanner so no more input is read

		/*
		 * Creates a matrix with number of columns and rows given by the user 
		 */
			int [][] Matrix = new int [rows][columns];
			
			System.out.println("Generating random int array with " + columns + " columns and " + rows + " rows");
			System.out.println("-----------------------------------------");
			
		/*
		 * 	Loop thats generates random integers between 100-900 into a matrix with the number of columns 
		 *  and rows given by the user
		 */
			for (int i = 0; i < Matrix.length; i++) {
				for (int j = 0; j < Matrix[i].length; j++) {
					Matrix[i][j] = (int)((Math.random()* 900) + 100); 
					
					System.out.print(Matrix[i][j] + " "); // prints the matrix on console
				}
				
				System.out.println(); // formats rows 
			}

			System.out.println("-----------------------------------------");
			System.out.println();
			
			/*
			 * Calls the rings method to print the sum and average of the integers in the matrix
			 */
			rings(Matrix);
			System.out.println("Sum of all elements = " + getsum(Matrix));
			System.out.println("Average of all array elements = " + getaverage(Matrix));
			System.out.println();
			
			/*
			 * Calls the metho outernums to print the sum and average of the integers in the 
			 * border of the matrix only 
			 */
			outernums(Matrix);
			System.out.println("Sum of outer ring elements = " + outersum(Matrix));
			System.out.println("Average of outer ring elements = " + outeravg(Matrix));
			
	}
	
	/*
	 * Method to count the number of rings in the matrix
	 */
	public static void rings (int[][] rInput) {
		
		int rings;
		
		//Divides the of given number of rows by 2 and checks the remainder 
		if (rInput.length % 2 == 0) {
			rings = (rInput[0].length / 2);
			System.out.println("The number of rings in the array = " + rings);
		}
		
		// if there is no remainder, it divides the number of rows by 2
		
		else if ((rInput.length % 2) != 0) {
			rings = ((rInput.length / 2) + 1); 
			System.out.println("The number of rings in the array = " + rings);
		}
		
		/*
		 *  if there is a remainder, the number of rings equals the number of rows divided by 2 + 1
		 *  to count the middle ring.
		 *   NOTE: keyword INT rounds down when the result is a decimal
		 */
	}
	
	/*
	 * Method to add each ekement in the Matrix and produce the total sum 
	 */
	public static int getsum (int [][] Matrix) {
		
		//setting the sum to 0
		int sum = 0;
		
		//loop to add elements into sum
		for (int i = 0; i < Matrix.length; i++) { //traverses through arrays
			for (int j = 0; j < Matrix[i].length; j++) { // traverses through columns in array indexes 
				sum += Matrix[i][j]; // adds all elements in the matrix
			}
		}
		
		//returns variable sum with new value
		return sum;
	}
	
	/*
	 * Method to add each ekement in the Matrix and produce the total average 
	 */
	public static double getaverage (int [][] Matrix) {
		
		//initializing variables needed to compute the average
		int elements = 0;
		int sum = 0;
		
		for (int i = 0; i < Matrix.length; i++) { // traverses through rows in matrix
			for (int j = 0; j < Matrix[i].length; j++) { // traverses through columns in row index
				sum += Matrix[i][j]; // adds each element
				elements++; // counts each element
			}
		}
		
		// returns new value as the average 
		return sum / elements;
	}

	 /*
	  * Method to read, reverse, and count outer ring elements
	  */
	public static void outernums (int [][] Matrix) {
		
		int count = 0;
		System.out.println("Outer ring elements listed going counter-clockwise: ");
		
		//traverses through top row and left most column
		for (int i = 0; i < Matrix.length; i++) { // traverses through rows in matrix
			for (int j = Matrix[i].length - 1; j >= 0; j--) { // traverses through columns starting at the highest value and decrements by 1
				if (i == 0 || j == 0) { // if in rows[0] and / or column[0]...
					System.out.print(Matrix[i][j] + " "); // ... print element using its index
					count++; // increment outer element num by 1
				}
			}
		}
		
		//traverses through last row and bottom column
		for (int i = 0; i < Matrix.length; i++) { // traverses through rows in matrix
			for (int j = 0; j < Matrix[i].length; j++) { // traverses through columns starting at the lowest value and increments by 1
				if (i == Matrix.length - 1 && j == 0) // if in bottom left corner...
				System.out.print(""); // print nothing to avoid printing element twice
			else if (i == Matrix.length - 1) { // if not...
				System.out.print(Matrix[i][j] + " "); // .. print the element 
				count++; // add 1 to count
			}	
			}
		}
		
		for (int i = Matrix.length - 1; i >= 0; i--) //traverses through rows starting from the bottom
			for (int j = Matrix[i].length - 1; j >= 0; j--) { //traverses through the column starting from the bottom 
				if (i == Matrix.length - 1 && j == Matrix[i].length - 1) //if in the bottom right corner...
					System.out.print(""); // ...do not print
				else if (i == 0 && j == Matrix[i].length - 1)  //if in the top right corner...
					System.out.print(""); // ...do not print
				else if (j == Matrix[i].length - 1) { // if not...
					System.out.print(Matrix[i][j] + " "); // .. print the element 
					count++; // add 1 to count
				}
			}
		
		System.out.println();
		System.out.println("Number of elements in outer ring = " + count); // display new value for count
	}
	
	/*
	 * Method to add outer rings elements only
	 */
	public static int outersum (int [][] Matrix) {
		
		int sum = 0;
		
		for (int i = 0; i < Matrix.length; i++) { // traverses through rows in matrix
			for (int j = 0; j < Matrix[i].length; j++) { // traverses through columns in row index
				if (i == 0) 
					sum += Matrix[i][j];
				else if (i == Matrix.length - 1)
					sum += Matrix[i][j];
				else if (j == 0)
					sum += Matrix[i][j];
				else if (j == Matrix[i].length - 1)
					sum += Matrix[i][j];
				// loop to add element to sum if conditions are true
			}
		}
		
		// returns new value of sum
		return sum;
	}
	
	/*
	 * Method to take the average of the outer ring elements only
	 */
	public static double outeravg (int [][] Matrix) {
		
		int elements = 0;
		int sum = 0;
		
		// loop to add element to sum and count num of elements if conditions are true
		for (int i = 0; i < Matrix.length; i++) { // traverses through rows in matrix
			for (int j = 0; j < Matrix[i].length; j++) { // traverses through columns in row index
				if (i == 0) {
					sum += Matrix[i][j];
					elements++;
				}
				else if (i == Matrix.length - 1) {
					sum += Matrix[i][j];
					elements++;
				}
				else if (j == 0) {
					sum += Matrix[i][j];
					elements++;
				}
				else if (j == Matrix[i].length - 1) {
					sum += Matrix[i][j];
				elements++;
				}
			}
		} 
		
		// returns average
		return sum / elements; 
	}
	
}
