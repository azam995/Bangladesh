package Unit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Script {
	
	 public static WebDriver driver;
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/Users/Ekramul/Documents/Selenium file folder/SeleniumWebdriver/chromedriver_win32/chromedriver.exe");
		
		driver=new ChromeDriver();
		
		driver.get("https://google.com");
		
		driver.quit();
	}

}
