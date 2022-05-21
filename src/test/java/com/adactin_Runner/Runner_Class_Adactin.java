package com.adactin_Runner;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.BaseClass.Base_Class;
import com.configuration_helper.File_Reader_Manager_Adactin;
import com.object_manager_Adactin.Page_Object_Manager;
import com.pom_Adactin.Book_Hotel;
import com.pom_Adactin.Home_Page;
import com.pom_Adactin.Hotel_Search;
import com.pom_Adactin.Logout_Page;
import com.pom_Adactin.Select_Hotel;

public class Runner_Class_Adactin extends Base_Class {
	
	public static WebDriver driver = browser_Configuration("chrome");
	
	public static Page_Object_Manager pom= new Page_Object_Manager(driver);
	
	public static Logger log = Logger.getLogger(Runner_Class_Adactin.class);

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");
		
		String url = File_Reader_Manager_Adactin.get_Instance_FRM().get_Instance_CR().get_config_url(); //Used Singleton design pattern
		
		getUrl(url);
		
		// HOME PAGE
		
		// user name
		String username = File_Reader_Manager_Adactin.get_Instance_FRM().get_Instance_CR().get_config_username(); //Used Singleton design pattern
		inputValueElement(pom.getHp().getName(),username);
		
		// password
		String password = File_Reader_Manager_Adactin.get_Instance_FRM().get_Instance_CR().get_config_password(); //Used Singleton design pattern
		inputValueElement(pom.getHp().getPass(),password);

		// login
		clickOnElement(pom.getHp().login);
		
		log.info("Logged in successfully");

     	// HOTEL SEARCH
		
		// location
		selectElement("byValue",pom.getHs().getLocation(),"Paris");

		// hotels
		selectElement("byIndex",pom.getHs().getHotel(),"2");

		// room type
		selectElement("byValue",pom.getHs().getRoom(),"Deluxe");		

		// no.of rooms
		selectElement("byValue",pom.getHs().getRoomNo(),"1");

		// check-in date
		inputValueElement(pom.getHs().getCheckIn(),"13/03/2022");
		
		// check-out date
		inputValueElement(pom.getHs().getCheckOut(),"23/03/2022");

		// adults per room
		explicitWait(pom.getHs().getAdultsPerRoom());
		selectElement("byValue",pom.getHs().getAdultsPerRoom(),"1");

		// children per room
		selectElement("byValue",pom.getHs().getChildrenPerRoom(),"0");

		// search
		clickOnElement(pom.getHs().getSearch());
		
		log.info("Hotel search done");
		
		// SELECT HOTEL
		
		// select - RadioButton
		clickOnElement(pom.getSh().getSelect());

		// continue
		clickOnElement(pom.getSh().getCont());
		
		log.info("Hotel selected");

		// BOOK HOTEL
		// first name
		inputValueElement(pom.getBh().getFirstName(),particular_Cell_Data("C:\\Users\\ELCOT\\Desktop\\Tharani\\Mini project\\Testcase_Adactin.xlsx", 23,5));

		// last name
		inputValueElement(pom.getBh().getLastName(),particular_Cell_Data("C:\\Users\\ELCOT\\Desktop\\Tharani\\Mini project\\Testcase_Adactin.xlsx", 24,5));

		// billing address
		inputValueElement(pom.getBh().getAddress(),particular_Cell_Data("C:\\Users\\ELCOT\\Desktop\\Tharani\\Mini project\\Testcase_Adactin.xlsx", 25,5));

		// card number
		//String cardNumber = particular_Cell_Data("C:\\Users\\ELCOT\\Desktop\\Tharani\\Mini project\\Testcase_Adactin.xlsx", 26,5);
		inputValueElement(pom.getBh().getCardNo(),particular_Cell_Data("C:\\Users\\ELCOT\\Desktop\\Tharani\\Mini project\\Testcase_Adactin.xlsx", 26,5));

		// card type
		selectElement("byIndex",pom.getBh().getCardType(),"2");

		// card expiry month
		selectElement("byText",pom.getBh().getCardExpiryDate(),"May");

		// card expiry year
		selectElement("byValue",pom.getBh().getCardExpiryYear(),"2022");		

		// CVV number
		inputValueElement(pom.getBh().getCvv(),particular_Cell_Data("C:\\Users\\ELCOT\\Desktop\\Tharani\\Mini project\\Testcase_Adactin.xlsx", 29,5));

	    // book now
		clickOnElement(pom.getBh().getBookNow());

		implicitWait(10,TimeUnit.SECONDS);
		
		log.info("Hotel booked");
		
		// LOGOUT PAGE
				
		explicitWait(pom.getLp().getLogout());
		
		// booking confirmation - screenshot - top page
        screenshot("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\Screenshots\\Adactin1.png");
		
		// scroll down to bottom page
        scrollUpDown(pom.getBh().getDown());
		
		// booking confirmation - screenshot - bottom page
		screenshot("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\Screenshots\\Adactin2.png");

		clickOnElement(pom.getLp().getLogout());   
		
		log.info("Logged out successfully"); 

	}


}
