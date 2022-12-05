package com.Base;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.utils.PropertyUtils;

public class BaseClass {
	
	public static WebDriver driver;
	public static ExtentReports  report=null;
	public static ExtentSparkReporter spark= null;
	public ExtentTest test =null;
	
	public static Logger log =Logger.getLogger(BaseClass.class);
	
	
	public static void initilization() throws Exception {
		
		System.out.println("reading a file from browser");
		log.info("reading a file from browser");
		
		String browsername= PropertyUtils.readProperty("browser");
		
		if(browsername.equalsIgnoreCase("chrome")) {
			log.info("intilailizing chrome browser");
			
			
			System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		
		if(browsername.equals("firefox")) {
			log.info("intilailizing firefox browser");
			
			System.setProperty("webdriver.gekco.driver","geckodriver.exe");
			driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(PropertyUtils.readProperty("url"));
		
	}
	
	public void reportInint() {
		
		report= new ExtentReports();
		String path=System.getProperty("user.dir")+"/target/ExtentReport.html";
		spark = new ExtentSparkReporter(path);
		report.attachReporter(spark);
	}
	}


