package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Back_To_Order{

	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Back to orders']")
	private WebElement back;

	public WebElement getBack() {
		return back;
	}

	public Back_To_Order(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
