package com.FifthJune;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dashboardpage1() {

	
	@FindBy(xpath="//h3")
	public List<WebElement> courses;//4

	public void Dashboardpage (WebDriver driver) {
		
		PageFactory.initElements(driver, this);	
	}
	
	@Test
	public void verifyCourses() {
		
		ArrayList<String> ExpList = new ArrayList<String>();  
		ArrayList<String> ActList = new ArrayList<String>();  
		ExpList.add("Selenium");
		ExpList.add("Java / J2EE");
		ExpList.add("Python");
		ExpList.add("Php");
		
		for(WebElement course : courses) {
			String nameCourse=course.getText();
			System.out.println("Courses Name : "+nameCourse);
			
			ActList.add(nameCourse);
		}
	Assert.assertEquals(ActList, ExpList);
	System.out.println(ActList);
	}
