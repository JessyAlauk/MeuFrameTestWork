import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDesafioTestarRegraDeNegocio {

	@Test
	public void nomeFoiPreenchido(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jessica.alauk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		Assert.assertEquals("Nome eh obrigatorio", msg);
		alert.accept();
		driver.close();
	}
	
	@Test
	public void sobreNomeFoiPreenchido(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jessica.alauk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Joao da Silva");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		Assert.assertEquals("Sobrenome eh obrigatorio", msg);
		alert.accept();
		driver.close();
	}
	
	@Test
	public void sexoFoiPreenchido(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jessica.alauk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Joao da Silva");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Xavier");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		Assert.assertEquals("Sexo eh obrigatorio", msg);
		alert.accept();
		driver.close();
	}
	
	@Test
	public void ehVegetarianoOuNao(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jessica.alauk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Joao da Silva");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Xavier");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:3")).click();
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		Assert.assertEquals("Tem certeza que voce eh vegetariano?", msg);
		alert.accept();
		driver.close();
	}
	
	@Test
	public void fazEsportesOuNao(){
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jessica.alauk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Joao da Silva");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Xavier");
		driver.findElement(By.id("elementosForm:sexo:0")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:0")).click();
		WebElement element = driver.findElement(By.id("elementosForm:esportes"));
		Select combo = new Select(element);
		combo.selectByVisibleText("Natacao");
		combo.selectByVisibleText("O que eh esporte?");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		
		Alert alert = driver.switchTo().alert();
		String msg = alert.getText();
		Assert.assertEquals("Voce faz esporte ou nao?", msg);
		alert.accept();
		driver.close();
	}
}
