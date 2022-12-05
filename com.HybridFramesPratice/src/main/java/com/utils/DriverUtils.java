package com.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.Base.BaseClass;

public class DriverUtils extends BaseClass{
	
	public static String getScreenshot(String name) throws Exception {
		
		TakesScreenshot ts=(TakesScreenshot)driver; 
		File scr= ts.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"/screenshots/"+name+".jpg";
		File dest = new File(path);
		FileUtils.copyFile(scr, dest);
		return path;
		
	}

}
