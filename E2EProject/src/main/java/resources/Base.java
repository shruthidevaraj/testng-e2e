package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{

		 prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Shruthi Devaraj\\E2EProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		
		String browserName = prop.getProperty("browser");
		
		if(browserName.equals("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "C:\\softwares\\chromedriver.exe");
			driver =new ChromeDriver();
		
		}else if(browserName.equals("firefox")) {
			
			System.setProperty("webdriver.gecko.driver","c:\\webdrivers\\geckodriver.exe");
			driver = new  FirefoxDriver();
		}else {

			System.out.println("Internet explorer code here");
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		return driver;
	}
}

