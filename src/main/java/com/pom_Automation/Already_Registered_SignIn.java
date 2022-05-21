package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Already_Registered_SignIn {

	public WebDriver driver;

	@FindBy(id = "email")
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(id = "passwd")
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement signIn;

	public WebElement getSignIn() {
		return signIn;
	}

	public Already_Registered_SignIn(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
}
