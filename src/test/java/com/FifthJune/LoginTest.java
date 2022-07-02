package com.FifthJune;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTest {
	
	WebDriver driver = null;
	Loginpage lp=null;
	Dashboardpage dp = null;
	
	@Test
	public void test01() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/logout.html");
		
		 lp = new Loginpage(driver);
		 
		//dp= lp.getdashboard();//new DashboardPage(driver);
		  
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
		
	}
	
	@Test
	public void test02() {
	Dashboardpage dp = new Dashboardpage(driver);
		Assert.assertTrue(dp.VerifyCourses());
	
}	
}

