package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.pages.Userpage;

public class DashboardPage {
	@FindBy(xpath="//b[text()='Java By Kiran']")
	WebElement header;

	@FindBy(xpath="//span[text()='Users']")
	WebElement userBtn;

	public DashboardPage(WebDriver driver) {
		//this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public Userpage clickuser(WebDriver driver) {
		userBtn.click();  
		return new Userpage(driver);
	}

	public String getHeader() {
		System.out.println(header.getText());
		return header.getText();  

	}

}
