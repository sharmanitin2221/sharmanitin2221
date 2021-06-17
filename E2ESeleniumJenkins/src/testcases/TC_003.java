package testcases;

 
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_003 {
	
	ChromeDriver driver = null;
	
	@Test
	public void tc001()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("New");
		driver.findElementById("pass").sendKeys("Here");
		driver.quit();
	}

}
