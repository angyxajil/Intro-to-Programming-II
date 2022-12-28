package Software;
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;

public class EODActivity {
	
	public static void main(String[] args) throws IOException {
		
		PrintWriter DR = new PrintWriter("dailyReport_Date.txt");
		File originalFile = new File("WorkOrder.txt");
		
		Garage finalcountG = new Garage();
		System.out.println(finalcountG.countG);
		
	        
	        DR.println("Requests:" + originalFile);  
	        DR.println("Fuels Used:");
	        DR.println("	Regular:");
	        DR.println("	Premium:");
	        DR.println("Ongoing Repairs:");
	        DR.println("	Remaining Time:");
	        
	        
	        DR.close(); 
	}
	
}
