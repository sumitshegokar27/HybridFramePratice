package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Base.BaseClass;
import com.pages.DashboardPage;

public class LoginPage extends BaseClass {
	
	@FindBy(id="email")
	WebElement username;	
	
	@FindBy(id="password")
	WebElement password;	
	
	@FindBy(xpath="//button")
	WebElement LoginButton;	
	
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void LoginToApplication(String Username,String Pass) {
		username.sendKeys(Username);
		password.sendKeys(Pass);
		LoginButton.click();
	}
	
	public DashboardPage validLogin(WebDriver driver) {
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		LoginButton.click();
		return new DashboardPage(driver);
	}

}
