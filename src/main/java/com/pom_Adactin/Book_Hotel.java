package com.pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {

	public WebDriver driver;

	@FindBy(id = "first_name")
	private WebElement firstName;

	public WebElement getFirstName() {
		return firstName;
	}
	
	@FindBy(xpath = "//input[@name='last_name']")
	private WebElement lastName;

	public WebElement getLastName() {
		return lastName;
	}
	
	@FindBy(id = "address")
	private WebElement address;

	public WebElement getAddress() {
		return address;
	}
	
	@FindBy(id = "cc_num")
	private WebElement cardNo;

	public WebElement getCardNo() {
		return cardNo;
	}

	@FindBy(id = "cc_type")
	private WebElement cardType;

	public WebElement getCardType() {
		return cardType;
	}
	
	@FindBy(id = "cc_exp_month")
	private WebElement cardExpiryDate;

	public WebElement getCardExpiryDate() {
		return cardExpiryDate;
	}
	
	@FindBy(id = "cc_exp_year")
	private WebElement cardExpiryYear;

	public WebElement getCardExpiryYear() {
		return cardExpiryYear;
	}
	
	@FindBy(xpath = "//input[@name='cc_cvv']")
	private WebElement cvv;

	public WebElement getCvv() {
		return cvv;
	}
	
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement bookNow;
	
	public WebElement getBookNow() {
		return bookNow;
	}

	@FindBy(xpath = "//h4[text()='About Adactin']")
	private WebElement down;
	
	public WebElement getDown() {
		return down;
	}

	public Book_Hotel(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}
	

}
