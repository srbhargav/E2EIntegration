package com.automation.testing.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Utility {

	public static Object  fetchpropertiesvalues(String Key) throws IOException {
		
		FileInputStream file = new FileInputStream("./Config/config.properties");
		Properties property = new Properties();
		property.load(file);
        return property.get(Key);

	}
	
    public static String  fetchlocatorvalues(String Key) throws IOException {
		
		FileInputStream file = new FileInputStream("./Config/elements.properties");
		Properties property = new Properties();
		property.load(file);
        return property.get(Key).toString();

	}

}
