package com.FifthJune;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import c.Userspage;

public class DashboardTest {

	WebDriver driver = null;
	Loginpage lp = null;
	Userspage  up =null;
	
	@BeforeMethod
	public void  before() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.driver");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		lp=  LoginPage(driver);
	}
	private Loginpage LoginPage(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}
	@Test(priority = 1)
	
	public void test01() {
		 
		Dashboardpage dp = lp.getdashboard();

		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		System.out.println(driver.getTitle());
		
	}	
}

