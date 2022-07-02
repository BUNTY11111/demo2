package com.EleventhJune;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {

	WebDriver driver = null;

	@FindBy(id = "email")
	WebElement username;

	@FindBy(id = "password")
	WebElement password;

	@FindBy(xpath = "//button")
	WebElement loginBtn;

	@FindBy(xpath = "//span[text()='     Useful Links']")
	WebElement usefullinkBtn;

	public Loginpage2(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	public void loginToApplication(String uname, String pass) {

		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
		usefullinkBtn.click();

	}

	public UsefulLinkpage getUsefulLink() {

		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
		usefullinkBtn.click();

		return new UsefulLinkpage(driver);
	}
}

