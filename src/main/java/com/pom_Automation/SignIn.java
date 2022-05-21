package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	public  WebDriver driver;
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement logIn;

	public WebElement getSignIn() {
		return logIn;
	}
	
	public SignIn(WebDriver driver2) {
		this.driver =  driver2;
		PageFactory.initElements(driver, this);
	}
	
}
