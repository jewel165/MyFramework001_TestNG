package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class setup {

	public WebDriver driver;

	@BeforeMethod
	public void setup01() {
		//System.setProperty("webdriver.gecko.driver","/Users/jewel/eclipse-workspace/geckodriver");
		//driver = new FirefoxDriver();

		System.setProperty("webdriver.chrome.driver","/Users/jewel/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://wwww.amazon.com");

	}
	
	@AfterMethod
	public void close() {
		driver.quit();
	}
	
}
