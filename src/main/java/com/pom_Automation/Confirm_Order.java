package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_Order{

	public WebDriver driver;

	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement order;

	public WebElement getOrder() {
		return order;
	}

	public Confirm_Order(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}

