
package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {

	public WebDriver driver;

	@FindBy(xpath = "(//a[text()='Dresses'])[2]")
	private WebElement dress;

	public WebElement getdress() {
		return dress;
	}
	
	public Dresses(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}
