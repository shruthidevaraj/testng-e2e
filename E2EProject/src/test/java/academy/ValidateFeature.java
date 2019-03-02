package academy;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.Base;

public class ValidateFeature extends Base{
	
	public WebDriver driver;

	
	@Test
	public void validateContent() throws IOException {
		
		driver= initializeDriver();
		driver.get(prop.getProperty("URL"));
		LandingPage lp = new LandingPage(driver);
		assertEquals(lp.validateFeature().getText(), "FEATURED COURSES");
	}

}
