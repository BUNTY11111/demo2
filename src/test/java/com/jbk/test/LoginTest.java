package com.jbk.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;

public class LoginTest {
	WebDriver driver; 
	LoginPage lp;
	@BeforeMethod
	public void openBrowser() {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/index.html");
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
	}

	@Test
	public void verifycorrectCredentials() {
		lp.correctCredentials();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");

	}
}
