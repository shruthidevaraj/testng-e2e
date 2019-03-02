package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	WebDriver driver;
	
	By signIn  = By.linkText("Login");
	By course = By.xpath("//div[@class='container']/div/h2");
	
	public LandingPage(WebDriver driver) {
		this.driver=driver;
	}
	public WebElement signIn() {
		
		return driver.findElement(signIn);
		
	}
		
	public WebElement validateFeature() {
		
		return driver.findElement(course);
	}

	
	
}
