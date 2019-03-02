package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	
	By email = By.cssSelector("input[id='user_email']");
	By password = By.cssSelector("input[name='user[password]']");
	By submit = By.xpath("//*[@id='new_user']/div[3]/input");
	
	public WebElement email() {
		return driver.findElement(email);
	}
	
	public WebElement password() {
		return driver.findElement(password);
	}
	
	public WebElement submit() {
		return driver.findElement(submit);
	}
}
