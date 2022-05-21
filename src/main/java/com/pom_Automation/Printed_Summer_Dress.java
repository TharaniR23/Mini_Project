package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Printed_Summer_Dress {

	public WebDriver driver;
	
	@FindBy(xpath = "//li[text()='View']")
	private WebElement scrollDown;
	
	public WebElement getScrollDown() {
		return scrollDown;
	}

	@FindBy(xpath = "(//img[@title='Printed Summer Dress'])[1]")
	private WebElement PrnitSumDress;

	public WebElement getPrnitSumDress() {
		return PrnitSumDress;
	}

	public Printed_Summer_Dress(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
