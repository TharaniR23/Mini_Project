package com.pom_Automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Size_And_Cart {

	public WebDriver driver;

	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size;

	public WebElement getSize() {
		return size;
	}

	@FindBy(xpath = "//p[@id='add_to_cart']//descendant::span")
	private WebElement cart;

	public WebElement getCart() {
		return cart;
	}

	// 3rd Dress

	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement box;

	public WebElement getBox() {
		return box;
	}

	public Size_And_Cart(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

} 
