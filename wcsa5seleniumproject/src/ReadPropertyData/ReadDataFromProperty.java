package ReadPropertyData;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromProperty {

	public static void main(String[] args) throws IOException {
		
		// read the data from config.properties
		FileInputStream fis = new FileInputStream("/.data/config.properties");
		
		// create a object for properties
		Properties pro = new Properties();	
		
		// to make read file to read
		
		pro.load(fis);
		
		// read the property from file
		
		String data = pro.getProperty("Password");
		
		System.out.println(data);
	
	
	
	
	}

}
