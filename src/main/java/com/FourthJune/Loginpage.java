package com.FourthJune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.FifthJune.Dashboardpage;

public class Loginpage {
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginBtn;
	
	
	public void Loginpage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication(String uname, String pass) {
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
	}

	}

