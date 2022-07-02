package com.FourthJuneTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.FourthJune.Loginpage;
import com.FourthJune.TestCase;

public class TestCaseTesting {

	@Test
	public void test02() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/logout.html");
		
		TestCase tc = new TestCase(driver);
		tc.registerToMembership("Vinod", "7276752103", "chaudharivinod19@gmail.com", "123456");
		
		Assert.assertEquals(driver.getTitle(), "User registered successfully");
	}
}

		
		
		
