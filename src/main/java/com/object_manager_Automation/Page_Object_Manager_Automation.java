package com.object_manager_Automation;

import org.openqa.selenium.WebDriver;

import com.pom_Automation.Address;
import com.pom_Automation.Already_Registered_SignIn;
import com.pom_Automation.Back_To_Order;
import com.pom_Automation.Confirm_Order;
import com.pom_Automation.Dresses;
import com.pom_Automation.Faded_Tshirt;
import com.pom_Automation.Payby_Cheque;
import com.pom_Automation.Printed_Summer_Dress;
import com.pom_Automation.Proceed_To_Checkout;
import com.pom_Automation.SignIn;
import com.pom_Automation.SignOut;
import com.pom_Automation.Size_And_Cart;
import com.pom_Automation.Summary;
import com.pom_Automation.SummerDress;
import com.pom_Automation.TermsOfService_And_Shipping;
import com.pom_Automation.Tshirt;
import com.pom_Automation.Women;

public class Page_Object_Manager_Automation {

	public WebDriver driver;
	
	private SignIn si;
	private Already_Registered_SignIn ars;
	private Dresses d;
	private SummerDress sd;
	private Printed_Summer_Dress psm;
	private Size_And_Cart sc;
	private Proceed_To_Checkout pc;
	private Summary s;
	private Address a;
	private TermsOfService_And_Shipping ts;
	private Payby_Cheque pbc;
	private Confirm_Order co;
	private Back_To_Order bo;
	private SignOut so;
	
	// Second Dress
	private Women w;
	
	// Third Dress
	private Tshirt t;
	private Faded_Tshirt fs;
	
	public Page_Object_Manager_Automation(WebDriver driver2) {
		this.driver = driver2;
	}
	
	public SignIn getSi() {
		if(si==null) {
		si = new SignIn(driver);
	}
		return si;
	}

	public Already_Registered_SignIn getArs() {
		
			if(ars==null) {
				ars = new Already_Registered_SignIn(driver);
		}
		return ars;
	}

	public Dresses getD() {
		if(d==null) {
			d = new Dresses(driver);
		}
	
		return d;
	}

	public SummerDress getSd() {
		if(sd==null) {
			sd = new SummerDress(driver);
		}
		return sd;
	}

	public Printed_Summer_Dress getPsm() {
		if(psm==null){
			psm = new Printed_Summer_Dress(driver);
		}
		return psm;
	}

	public Size_And_Cart getSc() {
		if(sc==null){
			sc = new Size_And_Cart(driver);
		}
		return sc;
	} 

	public Proceed_To_Checkout getPc() {
		if(pc==null){
			pc = new Proceed_To_Checkout(driver);
		}
		return pc;
	} 

	public Summary getS() {
		if(s==null){
			s = new Summary(driver);
		}
		return s;
	}

	public Address getA() {
		if(a==null){
			a = new Address(driver);
		}
		return a;
	}

	public TermsOfService_And_Shipping getTs() {
		if(ts==null){
			ts = new TermsOfService_And_Shipping(driver);
		}
		return ts;
	}
	
	public Payby_Cheque getPbc() {
		if(pbc==null) {
			pbc = new Payby_Cheque(driver);
		}
	return pbc;
	}

	public Confirm_Order getCo() {
		if(co==null){
			co = new Confirm_Order(driver);
		}
		return co;
	}

	public Back_To_Order getBo() {
		if(bo==null){
			bo = new Back_To_Order(driver);
		}
		return bo;
	} 

	public SignOut getSo() {
		if(so==null){
			so = new SignOut(driver);
		}
		return so;
	}
	
	// 2nd Dress
	
	public Women getW() {
		if(w==null) {
			w = new Women(driver);
		}
		return w;
	}

	public Tshirt getT() {
		if(t==null) {
			t= new Tshirt(driver);
		}
		return t;
	}
	
	public Faded_Tshirt getFs() {
		if(fs==null) {
			fs = new Faded_Tshirt(driver);
		}
		return fs;
	}
	
	
}
