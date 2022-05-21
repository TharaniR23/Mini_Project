package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Proceed_To_Checkout {

	public WebDriver driver;

	@FindBy(xpath = "(//a[@href='http://automationpractice.com/index.php?controller=order'])[3]")
	private WebElement proceed;

	public WebElement getProceed() {
		return proceed;
	}

	public Proceed_To_Checkout(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}