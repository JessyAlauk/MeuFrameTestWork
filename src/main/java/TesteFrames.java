import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteFrames {
	@Test
	public void testDesafio() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jessica.alauk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
	}
}
