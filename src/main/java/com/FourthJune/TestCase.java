package com.FourthJune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestCase {
		
		@FindBy(xpath="//a[text()='Register a new membership']")
		WebElement registerBtn;
		
		@FindBy(id="name")
		WebElement vuname;
		
		@FindBy(id="mobile")
		WebElement emobile;
		
		@FindBy(id="email")
		WebElement username;
		
		@FindBy(id="password")
		WebElement password;
		
		@FindBy(xpath="//button")
		WebElement loginBtn;
		
		public TestCase(WebDriver driver) {
			
			PageFactory.initElements(driver, this);
		}
		
		public void registerToMembership(String xname, String xmobile, String uname, String pass) {
			registerBtn.click();
			vuname.sendKeys(xname);
			emobile.sendKeys(xmobile);
			username.sendKeys(uname);
			password.sendKeys(pass);
			loginBtn.click();
		}
	}
