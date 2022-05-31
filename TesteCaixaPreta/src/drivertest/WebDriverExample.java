package drivertest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverExample {
    
    public static void main(String[] args) {
	// Abre uma instancia do Firefox
	WebDriver driver = new FirefoxDriver();

	// Navega ate o endereco do Google
	driver.get("https://www.google.com");

	// O nome que o gravador de testes detectou para o campo de busca do Google eh 'q'
	WebElement element = driver.findElement(By.name("q"));
	
	// Este codigo insere o termo a ser buscado no campo de busca
	element.sendKeys("Teste de busca no Google");

	// Este codigo envia o comando de busca para o Google
	element.submit();

	// Imprime o nome da pagina no console de saida
	System.out.println("O titulo da pagina eh: " + driver.getTitle());
	
	// Aqui o navegador sera fechado
	driver.quit();
	
	
    }

}
