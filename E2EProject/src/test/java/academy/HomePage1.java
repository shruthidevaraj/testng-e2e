package academy;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePage1 extends Base{
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();

		}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String userName,String password)
	{
		driver.get(prop.getProperty("URL"));
		LandingPage lp= new LandingPage(driver);
		lp.signIn().click();
		LoginPage loginPage = new LoginPage(driver);
		loginPage.email().sendKeys(userName);
		loginPage.password().sendKeys(password);
		loginPage.submit().click();
		
		
		
	}
	
	@DataProvider
	public Object[][] getData() {
		
		Object[][] data=new Object[3][2];
		data[0][0]="shruthimdevaraj@gmail.com";
		data[0][1]="password1";
		data[1][0]="prvnmali@gmail.com";
		data[1][1]="password2";
		data[2][0]="usha1639@gmail.com";
		data[2][1]="password3";
		return data;
		
		
	}
	
	@AfterTest
	public void name() {
	driver.close();
	driver=null;
		
	}
}
