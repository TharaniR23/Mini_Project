package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women {

	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Women']")
	private WebElement WomenDress;

	public WebElement getWomenDress() {
		return WomenDress;
	}

	public Women(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}