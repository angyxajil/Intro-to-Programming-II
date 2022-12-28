package Software;

import java.io.IOException;
import java.io.PrintWriter;

public class Restock {

public static void main(String[] args) throws IOException {
		
		PrintWriter RO = new PrintWriter("dailyReport_Date.txt");
		
	        RO.println("Fuels Needed:");
	        RO.println("	Regular:");
	        RO.println("	Premium:");
	        RO.println("Parts Needed:");
	        RO.println("");
	        
	        
	        RO.close(); 
	}
	
}
