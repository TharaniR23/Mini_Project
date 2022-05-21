package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Faded_Tshirt {

	public WebDriver driver;

	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img")
	private WebElement FadedShirt;

	public WebElement getShirt() {
		return FadedShirt;
	}

	public Faded_Tshirt(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

}