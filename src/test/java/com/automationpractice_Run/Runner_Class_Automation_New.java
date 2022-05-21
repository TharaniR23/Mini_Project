package com.automationpractice_Run;

import java.util.concurrent.TimeUnit;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import com.BaseClass.Base_Class;
import com.configuration_helper.File_Reader_Manager_Automation;
import com.object_manager_Automation.Page_Object_Manager_Automation;

public class Runner_Class_Automation_New extends Base_Class {

	public static WebDriver driver = browser_Configuration("chrome");

	public static Page_Object_Manager_Automation pom = new Page_Object_Manager_Automation(driver);

	public static Logger log = Logger.getLogger(Runner_Class_Automation_New.class);

	public static void main(String[] args) throws Throwable {

		PropertyConfigurator.configure("log4j.properties");

		String url = File_Reader_Manager_Automation.get_Instance_FRM().get_Instance_CR().url();
		getUrl(url);

		implicitWait(10, TimeUnit.SECONDS);

		// Sign in
		clickOnElement(pom.getSi().getSignIn());

		String email = File_Reader_Manager_Automation.get_Instance_FRM().get_Instance_CR().email(); // Used Singleton design pattern here

		inputValueElement(pom.getArs().getUsername(), email);

		inputValueElement(pom.getArs().getPassword(), particular_Cell_Data(
				"C:\\Users\\ELCOT\\Desktop\\Tharani\\Mini project\\Testcase_AutomationPratice.xlsx", 19, 5));

		log.info("Signed in successfully");

		clickOnElement(pom.getArs().getSignIn());

		implicitWait(10, TimeUnit.SECONDS);

		clickOnElement(pom.getD().getdress());

		clickOnElement(pom.getSd().getsumDress());

		scrollUpDown(pom.getPsm().getScrollDown());

		clickOnElement(pom.getPsm().getPrnitSumDress());

		Thread.sleep(1000);

		selectElement("byValue", pom.getSc().getSize(), "3");

		clickOnElement(pom.getSc().getCart());

		Thread.sleep(1000);

		clickOnElement(pom.getPc().getProceed());

		clickOnElement(pom.getS().getSummary());

		Thread.sleep(1000);

		clickOnElement(pom.getA().getAddress());

		Thread.sleep(1000);

		clickOnElement(pom.getTs().getTerm());

		clickOnElement(pom.getTs().getShip());

		clickOnElement(pom.getPbc().getCheque());

		clickOnElement(pom.getCo().getOrder());

		log.info("1st dress ordered successfully");

		screenshot("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\Screenshots\\Order.png");

		implicitWait(10, TimeUnit.SECONDS);

		clickOnElement(pom.getBo().getBack());

		implicitWait(10, TimeUnit.SECONDS);

		screenshot("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\Screenshots\\OrderHistory.png");

		clickOnElement(pom.getSo().getSignOut());

		log.info("Signed out successfully");

		// 2nd Dress
		String url1 = File_Reader_Manager_Automation.get_Instance_FRM().get_Instance_CR().url();
		getUrl(url1);

		implicitWait(10, TimeUnit.SECONDS);

		// Sign in
		clickOnElement(pom.getSi().getSignIn());

		String email1 = File_Reader_Manager_Automation.get_Instance_FRM().get_Instance_CR().email(); //Used Singleton design pattern here
																										
		inputValueElement(pom.getArs().getUsername(), email1);

		inputValueElement(pom.getArs().getPassword(), particular_Cell_Data(
				"C:\\Users\\ELCOT\\Desktop\\Tharani\\Mini project\\Testcase_AutomationPratice.xlsx", 19, 5));

		log.info("Signed in successfully");

		clickOnElement(pom.getArs().getSignIn());

		implicitWait(10, TimeUnit.SECONDS);

		clickOnElement(pom.getW().getWomenDress());

		scrollUpDown(pom.getPsm().getScrollDown());

		clickOnElement(pom.getPsm().getPrnitSumDress());

		Thread.sleep(1000);

		selectElement("byValue", pom.getSc().getSize(), "2");

		clickOnElement(pom.getSc().getCart());

		Thread.sleep(1000);

		clickOnElement(pom.getPc().getProceed());

		clickOnElement(pom.getS().getSummary());

		Thread.sleep(1000);

		clickOnElement(pom.getA().getAddress());

		Thread.sleep(1000);

		clickOnElement(pom.getTs().getTerm());

		clickOnElement(pom.getTs().getShip());

		clickOnElement(pom.getPbc().getCheque());

		clickOnElement(pom.getCo().getOrder());

		log.info(" 2nd dress ordered successfully");

		screenshot("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\Screenshots\\Order2.png");

		implicitWait(10, TimeUnit.SECONDS);

		clickOnElement(pom.getBo().getBack());

		implicitWait(10, TimeUnit.SECONDS);

		screenshot("C:\\Users\\ELCOT\\eclipse-workspace\\Maven_Project\\Screenshots\\OrderHistory2.png");

		clickOnElement(pom.getSo().getSignOut());

		log.info("Signed out successfully");

		close();

	}

}
