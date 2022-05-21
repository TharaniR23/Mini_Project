package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payby_Cheque{

	public WebDriver driver;

	@FindBy(xpath = "//a[@class='cheque']")
	private WebElement cheque;

	public WebElement getCheque() {
		return cheque;
	}

	public Payby_Cheque(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
