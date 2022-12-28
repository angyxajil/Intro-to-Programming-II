package Software;

import java.io.File;
import java.nio.file.Files;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class TxtFiles {
	
	public static void main (String[] args) {
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        String ISO = dateFormat.format(new Date());
		
		File originalFile = new File("WorkOrder.txt");
		File newFile = new File("DailyWorkOrder_" + ISO + ".txt");
			
		try {
			Files.copy(originalFile.toPath(), newFile.toPath());
		}
			
		catch (Exception e) {
			System.out.println("No file found :(");
				
		}
		
	}

}
