package com.automationpractice_Run;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.BaseClass.Base_Class;

public class Runner_Class_Automation extends Base_Class {

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {

		driver = browser_Configuration("chrome");
		getUrl("http://automationpractice.com/index.php");
		
		implicitWait(10,TimeUnit.SECONDS);

		// Sign in
		WebElement signIn = driver.findElement(By.xpath("//a[@class='login']"));
		clickOnElement(signIn);

		WebElement email = driver.findElement(By.id("email"));
		inputValueElement(email, "peterjohn@gmail.com");

		WebElement password = driver.findElement(By.id("passwd"));
		inputValueElement(password, "qwerty@7");

		WebElement signin = driver.findElement(By.xpath("//i[@class='icon-lock left']"));
		clickOnElement(signin);

		WebElement dress = driver.findElement(By.xpath("(//a[text()='Dresses'])[2]"));
		clickOnElement(dress);

		WebElement summerDress = driver.findElement(By.xpath("(//img[@title='Printed Summer Dress'])[1]"));
		clickOnElement(summerDress);
		
		WebElement size = driver.findElement(By.xpath("//select[@name='group_1']")); 
		selectElement("byValue", size, "1");
		
		WebElement cart = driver.findElement(By.xpath("//span[text()='Add to cart']"));
		clickOnElement(cart);
		
		WebElement proceed = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		explicitWait(proceed);
		clickOnElementUsingActions(driver, proceed);
		
		WebElement summary = driver.findElement(By.xpath("(//a[@title='Proceed to checkout'])[2]"));
		clickOnElement(summary);

		WebElement address = driver.findElement(By.name("(//i[@class='icon-chevron-right right'])[7]"));
		clickOnElement(address);
		
		WebElement termsOfService = driver.findElement(By.id("cgv"));
		explicitWait(termsOfService);
		clickOnElement(termsOfService);

		WebElement shipping = driver.findElement(By.name("processCarrier"));
		clickOnElement(shipping);

		WebElement chequePayment = driver.findElement(By.xpath("//a[@class='cheque']"));
		clickOnElement(chequePayment);

//		WebElement order = driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
//		clickOnElement(order);
//
//		screenshot("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\Screenshots\\Order.png");
//		
//		implicitWait(10,TimeUnit.SECONDS);
//
//		WebElement backToOrders = driver.findElement(By.xpath("//a[@title='Back to orders']"));
//		clickOnElement(backToOrders);
//
//		implicitWait(10,TimeUnit.SECONDS);
//		
//		screenshot("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\Screenshots\\OrderHistory.png");
//
//		WebElement signOut = driver.findElement(By.xpath("//a[@class='logout']"));
//		clickOnElement(signOut);
//
//		close();
	}

}
