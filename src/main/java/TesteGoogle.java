import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TesteGoogle {
	
	@Test
	public void testChrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jessica.alauk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("http://www.google.com");
		Assert.assertEquals("Google", driver.getTitle());
//		driver.close();
		driver.quit();
	}
	
	
	//ta com erro no firefox
//	@Test
//	public void testFirefox() {
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\jessica.alauk\\Downloads\\geckodriver-v0.20.1-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
//		driver.get("http://www.google.com");
//		Assert.assertEquals("Google", driver.getTitle());
//		driver.close();
//	}
	
//	@Test
//	public void testInternetExplorer() {
//		System.setProperty("webdriver.ie.driver", "C:\\Users\\jessica.alauk\\Downloads\\IEDriverServer.exe");
//		WebDriver driver = new InternetExplorerDriver();
//		driver.get("http://www.google.com");
//		Assert.assertEquals("Google", driver.getTitle());
//		driver.close();
//	}
	
	
}
