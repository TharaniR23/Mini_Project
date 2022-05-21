package com.object_manager_Adactin;

import org.openqa.selenium.WebDriver;

import com.pom_Adactin.Book_Hotel;
import com.pom_Adactin.Home_Page;
import com.pom_Adactin.Hotel_Search;
import com.pom_Adactin.Logout_Page;
import com.pom_Adactin.Select_Hotel;

public class Page_Object_Manager {
	public WebDriver driver;

	private Home_Page hp;

	private Hotel_Search hs;

	private Select_Hotel sh;

	private Book_Hotel bh;

	public Logout_Page lp;

	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public Home_Page getHp() {
		if(hp==null) {
			hp = new Home_Page(driver);
		}
		return hp;
	}

	public Hotel_Search getHs() {
		if(hs==null) {
			hs = new Hotel_Search(driver);
		}
		return hs;
	}

	public Select_Hotel getSh() {
		if(sh==null) {
			sh = new Select_Hotel(driver);
		}
		return sh;
	}

	public Book_Hotel getBh() {
		if(bh==null) {
			bh = new Book_Hotel(driver);
		}
		return bh;
	}

	public Logout_Page getLp() {
		if(lp==null) {
			lp = new Logout_Page(driver);
		}
		return lp;
	}
}
