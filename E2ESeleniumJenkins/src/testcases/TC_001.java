package testcases;

 
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_001 {
	
	ChromeDriver driver = null;
	@Test
	public void tc001() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().timeouts().pageLoadTimeout(100,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElementById("email").sendKeys("hello");
		driver.findElementById("pass").sendKeys("hello");
		driver.quit();
	}

}
