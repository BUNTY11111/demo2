package com.jbk.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.jbk.pages.LoginPage;

public class TestCasesExecution {

	WebDriver driver; 
	LoginPage lp;
	@BeforeSuite
	public void openBrowser()  {

		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/dashboard.html");
		driver.manage().window().maximize();
		lp = new LoginPage(driver);
		
	}
	
	@Test(priority=1)
	public void checkUserbutton() 
	{
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		String actMsg=driver.findElement(By.xpath("//span[text()='Users']")).getText();
		Assert.assertEquals( actMsg,"Users");
		
	}
	
	@Test(priority=2)
	public void checkExistingUsers() 
	{
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		String actMsg=driver.findElement(By.xpath("//span[text()='Users']")).getText();
		Assert.assertEquals(actMsg, "Users");
		
	}
	
	@Test(priority=3)
	public void checkAlreadyExistingUser() 
	{
		driver.findElement(By.xpath("//span[text()='Users']")).click();
		driver.findElement(By.xpath("//td[text()='Monica']")).click();
		String actMsg=driver.findElement(By.xpath("//td[text()='Monica']")).getText();
		Assert.assertEquals( actMsg,"Monica");
		
	}
	
	@Test(priority=4)
	public void checkExistingOperators() 
	{
		driver.findElement(By.xpath("//span[text()='Operators']")).click();
		String actMsg=driver.findElement(By.xpath("//span[text()='Operators']")).getText();
		Assert.assertEquals(actMsg, "Operators");
		
	}
	
	@Test(priority=5)
	public void checkExistingUsefulLinks() 
	{
		driver.findElement(By.xpath("//span[text()='     Useful Links']")).click();
		String actMsg=driver.findElement(By.xpath("//span[text()='     Useful Links']")).getText();
		Assert.assertEquals(actMsg, "Useful Links");
		
	}
	
	@Test(priority=6)
	public void checkExistingDownLoads() 
	{
		driver.findElement(By.xpath("//a[@href='downloads.html']")).click();
		String actMsg=driver.findElement(By.xpath("//a[@href='downloads.html']")).getText();
		Assert.assertEquals(actMsg, "Downloads");
		
	}
	
	@Test(priority=7)
	public void checkNavigationOfLogout() 
	{
		driver.findElement(By.xpath("//a[text()='LOGOUT']")).click();
		String actMsg=driver.findElement(By.xpath("//p[contains(text(),'session')]")).getText();
		Assert.assertEquals(actMsg,"Sign in to start your session");
		
	}
	}
	
