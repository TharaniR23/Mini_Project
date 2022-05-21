package com.pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;

	@FindBy(id = "username")
	private WebElement name;

	public WebElement getName() {
		return name;
	}

	@FindBy(id = "password")
	private WebElement pass;

	public WebElement getPass() {
		return pass;
	}
	
	@FindBy(id = "login")
	public WebElement login;

	public WebElement getLogin() {
		return login;
	}

	public Home_Page(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
