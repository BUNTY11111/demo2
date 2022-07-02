package com.EleventhJune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest1 {

	WebDriver driver = null;
	Loginpage1 la = null;
	Operatorpage op = null;

	@Test
	public void test01() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/HP/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/logout.html");

		la = new Loginpage1(driver);
		op = la.getoperator();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Operators");

	}

	@Test
	public void test02() {

		Assert.assertTrue(op.VerifyOperatos());

	}
}
