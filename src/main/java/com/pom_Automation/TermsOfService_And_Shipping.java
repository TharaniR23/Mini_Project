package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TermsOfService_And_Shipping {

	public WebDriver driver;

	@FindBy(id = "cgv")
	private WebElement term;

	public WebElement getTerm() {
		return term;
	}

	@FindBy(name = "processCarrier")
	private WebElement ship;

	public WebElement getShip() {
		return ship;
	}

	public TermsOfService_And_Shipping(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
