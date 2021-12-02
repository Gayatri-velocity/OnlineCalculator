package OnlineCalculator;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	WebDriver driver;
	
	public WebDriver browserInitialize() 
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user1\\Desktop\\Selenium\\chromedriver (2).exe");
	    driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get(" https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

}
