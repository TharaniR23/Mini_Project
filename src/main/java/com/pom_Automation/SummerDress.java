package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummerDress {

	public WebDriver driver;

	@FindBy(xpath = "(//a[text()='Summer Dresses'])[4]")
	private WebElement sumDress;

	public WebElement getsumDress() {
		return sumDress;
	}

	public SummerDress(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
