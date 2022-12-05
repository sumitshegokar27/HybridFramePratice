package com.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertyUtils {
	

	public static String readProperty(String keys) throws Exception {
		
		String path=System.getProperty("user.dir")+"/src/main/resources/config.properties";
		Properties prop=new Properties();
		FileInputStream fis= new FileInputStream(path);
		prop.load(fis);
		
		return prop.getProperty(keys);
	}
	public static void main(String[] args) throws Exception {
		
		System.out.println(readProperty("browser"));
	}
}
