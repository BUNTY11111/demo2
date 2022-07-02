package com.EleventhJune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest3 {

	WebDriver driver = null;
	Loginpage3 la = null;
	Downloadpage dp = null;

	@Test
	public void test01() {

		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(
				"file:///C:/Users/HP/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/logout.html");

		la = new Loginpage3(driver);
		dp = la.getUsefulLink();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Downloads");

	}

	@Test
	public void test02() {

		Assert.assertTrue(dp.VerifyDownloads());

	}
}
