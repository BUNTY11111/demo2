package D;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import c.Logpag;
import c.Userspage;

public class LoTest {
	
	WebDriver driver = null;
	Logpag lp = null;
	Userspage up = null;
	@Test
	public void test01() {
		
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/HP/Downloads/javabykiran-Selenium-Softwares%20(1)/javabykiran-Selenium-Softwares/Offline%20Website/pages/examples/logout.html");
		
		Logpag lp = new Logpag(driver);
		up= lp.getuser();
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | User");
		
	}
	
	@Test
	public void test02() {
	
		Assert.assertTrue(up.VerifyUsers());
	
	}
}	


