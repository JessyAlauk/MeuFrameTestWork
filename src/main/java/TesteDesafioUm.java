import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * 
 * @author jessica.alauk
 * Esta classe contém um desafio: preencher os campos da tela "Campo de Treinamento"
 */
public class TesteDesafioUm {

	@Test
	public void testDesafio() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\jessica.alauk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();		
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		
		driver.findElement(By.id("elementosForm:nome")).sendKeys("Jessica");
		driver.findElement(By.id("elementosForm:sobrenome")).sendKeys("Santos Alauk");
		driver.findElement(By.id("elementosForm:sexo:1")).click();
		driver.findElement(By.id("elementosForm:comidaFavorita:1")).click();
		WebElement elementComboBox = driver.findElement(By.id("elementosForm:escolaridade"));
		Select combo = new Select(elementComboBox);
		combo.selectByVisibleText("Superior");
		WebElement elementComboMultiplo = driver.findElement(By.id("elementosForm:esportes"));
		Select comboMultiplo = new Select(elementComboMultiplo);
		comboMultiplo.selectByVisibleText("Futebol");
		comboMultiplo.selectByVisibleText("Corrida");
		driver.findElement(By.id("elementosForm:cadastrar")).click();
		Assert.assertTrue(driver.findElement(By.id("resultado")).getText().startsWith("Cadastrado!"));
		Assert.assertEquals("Nome: Jessica", driver.findElement(By.id("descNome")).getText());
		Assert.assertEquals("Sobrenome: Santos Alauk", driver.findElement(By.id("descSobrenome")).getText());
		Assert.assertEquals("Sexo: Feminino", driver.findElement(By.id("descSexo")).getText());
		Assert.assertEquals("Comida: Frango", driver.findElement(By.id("descComida")).getText());
		Assert.assertEquals("Escolaridade: superior", driver.findElement(By.id("descEscolaridade")).getText());
		Assert.assertEquals("Esportes: Futebol Corrida", driver.findElement(By.id("descEsportes")).getText());
		
		driver.quit();
	}
}
