package utIits;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileReader {
	public static Properties properties;

	
	public static Properties read(String fileName) {
		try {
			properties = new Properties();
			FileInputStream ip = new FileInputStream(fileName);
			properties.load(ip);
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("IO Exception");
		}
		return properties;
	}
}
