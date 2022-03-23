package com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base_Class {

	public static WebDriver driver;

	public static String value;

	public static WebDriver browser_Configuration(String type) {

		if (type.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "\\Drivers\\chromedriver.exe");

			driver = new ChromeDriver();

		}
		driver.manage().window().maximize();

		return driver;
	}

	public static void getUrl(String url) {
		driver.get(url);
	}

	public static void clickOnElement(WebElement element) {
		element.click();
	}

	public static void clickOnElementUsingActions(WebDriver driver, WebElement element) {
		Actions a = new Actions(driver);
		a.click(element).build().perform();

	}

	public static void clickOnElementUsingJavascriptExecutor(WebElement element, WebDriver driver) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);

	}

	public static void inputValueElement(WebElement element, String data) {
		element.sendKeys(data);
	}

	public static void selectElement(String type, WebElement element, String value) {

		Select s = new Select(element);

		try {
			if (type.equalsIgnoreCase("byValue")) {
				s.selectByValue(value);

			} else if (type.equalsIgnoreCase("byText")) {
				s.selectByVisibleText(value);

			} else if (type.equalsIgnoreCase("byIndex")) {
				int index = Integer.parseInt(value);
				s.selectByIndex(index);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void screenshot(String path) throws Exception {
		TakesScreenshot t = (TakesScreenshot) driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File dest = new File(path);
		FileUtils.copyFile(src, dest);
	}

	public static void implicitWait(int time, TimeUnit unit) {
		driver.manage().timeouts().implicitlyWait(time, unit);

	}

	public static void explicitWait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(element));

	}

	public static void scrollUpDown(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static String particular_Cell_Data(String path, int row_Index, int cell_Index) throws Throwable {

		File f = new File(path);

		FileInputStream fis = new FileInputStream(f);

		Workbook wb = new XSSFWorkbook(fis);

		Sheet s = wb.getSheetAt(0);

		Row r = s.getRow(row_Index);

		Cell c = r.getCell(cell_Index);

		CellType type = c.getCellType();

		if (type.equals(CellType.STRING)) {
			 value = c.getStringCellValue();

		} else if (type.equals(CellType.NUMERIC)) {

			double numericCellValue = c.getNumericCellValue();
			long val = (long)numericCellValue;
			value = String.valueOf(val);
			
		}
		return value;

	}

	public static void close() {
		driver.close();
	}
}
