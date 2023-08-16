package org.appium.utils;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.testng.annotations.Test;

	public class StoreProperties {

		public static String filePath;
		public static String configFilesPath = "C:\\Users\\91934\\eclipse-workspace\\ReachPOM\\resource";
		public static int timeoutInSeconds;

		private static Properties props = new Properties();

		public static Properties readPropertiesFile(String fileName) {

			try (InputStream fis = new FileInputStream(fileName)) {
				props.load(fis);
			} catch (IOException e) {
				e.printStackTrace();
			}
			return props;
		}
		public static String get(String key) {
			String environment = readPropertiesFile(configFilesPath + "\\baseConfig.properties").getProperty("Environment");
			Properties props = new Properties();

			try (InputStream input = StoreProperties.class.getClassLoader().getResourceAsStream("project.properties")) {
				props.load(input);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			String multiEnvironment = props.getProperty("Environment");
			if (environment.equals("${Environment}")) {
				environment = multiEnvironment;
			}
			try {
				switch (environment.toLowerCase()) {
				case "testing":
					filePath = configFilesPath + "\\testing\\testing.properties";
					break;
				case "staging":
					filePath = configFilesPath + "\\staging\\staging.properties";
					break;
				case "prod":
					filePath = configFilesPath + "\\Prod\\prod.properties";
					break;
				default:
					throw new Exception("Invalid Environment Selected");
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

			return readPropertiesFile(filePath).getProperty(key);
		}
	}

	
	  /*  private static final  Properties props = new Properties();
	    static {
	        try {
	            InputStream input = new FileInputStream("C:\\Users\\91934\\eclipse-workspace\\ReachPOM\\resource\\Testing\\testing.properties");
	            props.load(input);
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }

	    public static String get(String key) {
	        return props.getProperty(key);
        
	    }
	*/

    
	    
	    
	    
	    
	    
	 