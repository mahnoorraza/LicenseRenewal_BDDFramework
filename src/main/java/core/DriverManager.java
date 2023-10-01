package core;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	
	
	static WebDriver driver;
	public static void initiateDriver() {
		
		
	
		if (driver == null)
		{
			
			System.out.println("I am in browserSetup ");
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			WebDriverManager.chromedriver().setup();

			System.setProperty("webdriver.chrome.driver","C:\\Users\\mahnoor.moosa\\eclipse-workspace\\Driver\\chromedriver.exe");

			driver= new ChromeDriver(chromeOptions);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));;
			driver.manage().window().maximize();
			driver.get("http://dev.licenserenewal.com/login");

		}
		
	}
	
	public static WebDriver getDriver(){ 
		
		
		return driver;
		
	}
}
