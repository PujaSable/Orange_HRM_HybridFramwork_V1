package com.visionit.orangehrm.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
    
	public Properties prop;
	public ConfigDataProvider() {
		
		try {
			File fs = new File ("C:\\Users\\PATIDAR\\eclipse-workspace\\selenium_hybride_framework\\Config\\config.properties");//("./Config/config.properties");
		    FileInputStream fis =new FileInputStream(fs);
		    prop = new Properties();
		    prop.load(fis);
		}
		catch (Exception e)
		{
			
			e.printStackTrace();
		}
	}
	public String getKeyValue(String searchKey) {
		return prop.getProperty(searchKey);
	}
	
	public String getUserName() {
		
		return prop.getProperty("username");
	}
     public String getUserPassword() {
		
		return prop.getProperty("password");
	}
     public String getAppUrl() {
    	 return prop.getProperty("url");
     }
}
