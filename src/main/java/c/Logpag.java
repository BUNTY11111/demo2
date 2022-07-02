package c;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logpag {

	WebDriver driver= null;

	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="password")
	WebElement password;
	
	@FindBy(xpath="//button")
	WebElement loginBtn;
	
	@FindBy(xpath="//span[text()='Users']")
	WebElement userBtn;
	
	public Logpag(WebDriver driver) {
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	public void loginToApplication(String uname, String pass) {
		
		username.sendKeys(uname);
		password.sendKeys(pass);
		loginBtn.click();
		userBtn.click();
	}
	
	public Userspage getuser() {
		
		username.sendKeys("kiran@gmail.com");
		password.sendKeys("123456");
		loginBtn.click();
		userBtn.click();
	
	return new Userspage(driver);
}
}

