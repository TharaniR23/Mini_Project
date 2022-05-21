package com.pom_Adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotel_Search {
	
	public WebDriver driver;
	
	@FindBy(id = "location")
	private WebElement location;

	public WebElement getLocation() {
		return location;
	}
	
	@FindBy(id ="hotels")
	private WebElement hotel;
	
	public WebElement getHotel() {
		return hotel;
	}

	@FindBy(name = "room_type")
	private WebElement room;
	
	public WebElement getRoom() {
		return room;
	}
	
	@FindBy(id = "room_nos")
	private WebElement roomNo;
	

	public WebElement getRoomNo() {
		return roomNo;
	}
	
	@FindBy(name = "datepick_in")
	private WebElement checkIn;
	
	public WebElement getCheckIn() {
		return checkIn;
	}
	
	@FindBy(name = "datepick_out")
	private WebElement checkOut;
	
	public WebElement getCheckOut() {
		return checkOut;
	}
	
	@FindBy(id = "adult_room")
	private WebElement adultsPerRoom;
	
	public WebElement getAdultsPerRoom() {
		return adultsPerRoom;
	}
	
	@FindBy(id = "child_room")
	private WebElement childrenPerRoom;
	
	public WebElement getChildrenPerRoom() {
		return childrenPerRoom;
	}
	
	@FindBy(id = "Submit")
	private WebElement search;
	
	public WebElement getSearch() {
		return search;
	}
	
	public Hotel_Search(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
		}

}
	


