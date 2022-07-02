package com.EleventhJune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest2 {

	WebDriver driver = null;
	Loginpage2 la = null;
	UsefulLinkpage up = null;

	@Test
	public void test01() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/HP/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/logout.html");

		la = new Loginpage2(driver);
		up = la.getUsefulLink();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Useful Links");

	}

	@Test
	public void test02() {

		Assert.assertTrue(up.VerifyUsefulLinks());

	}
}
