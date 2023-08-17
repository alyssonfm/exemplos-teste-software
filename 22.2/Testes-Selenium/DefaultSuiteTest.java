// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class DefaultSuiteTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new FirefoxDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void acessandoiFood() {
    driver.get("https://www.globo.com/");
    driver.manage().window().setSize(new Dimension(1860, 1053));
    driver.findElement(By.cssSelector(".landing-v2-address-search__input")).click();
    driver.findElement(By.cssSelector(".landing-v2-address-search__input")).sendKeys("jantar");
    driver.findElement(By.cssSelector(".landing-v2-address-search__input")).sendKeys(Keys.ENTER);
    driver.findElement(By.cssSelector("li:nth-child(1) .btn-address--full-size")).click();
    driver.findElement(By.cssSelector(".address-maps__submit > .btn__label")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".btn:nth-child(2) > .btn__label"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector(".btn--full-width")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".carousel__slide:nth-child(6) .round-image__figure"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.cssSelector(".carousel__slide:nth-child(4) .round-image__figure")).click();
  }
  @Test
  public void acessandoGoogle() {
    driver.get("https://www.globo.com/");
    driver.manage().window().setSize(new Dimension(1860, 1053));
    driver.findElement(By.name("q")).click();
    driver.findElement(By.cssSelector("center:nth-child(1) > .RNmpXc")).click();
    driver.findElement(By.cssSelector(".on img")).click();
    driver.findElement(By.cssSelector(".history-card:nth-child(15) img")).click();
    driver.findElement(By.cssSelector(".history-card:nth-child(16) img")).click();
    driver.findElement(By.id("searchinput")).click();
    driver.findElement(By.id("searchinput")).sendKeys("aloha");
    driver.findElement(By.id("searchbtn")).click();
  }
  @Test
  public void acessoGlobo() {
    driver.get("https://www.globo.com/");
    driver.manage().window().setSize(new Dimension(1018, 854));
    driver.findElement(By.cssSelector(".headline__container .post__title")).click();
    js.executeScript("window.scrollTo(0,935)");
    js.executeScript("window.scrollTo(0,2606)");
    js.executeScript("window.scrollTo(0,3326)");
    driver.switchTo().frame(0);
    driver.switchTo().frame(0);
    js.executeScript("window.scrollTo(0,0)");
    driver.switchTo().defaultContent();
    driver.switchTo().defaultContent();
    js.executeScript("window.scrollTo(0,4267)");
    js.executeScript("window.scrollTo(0,7064)");
    js.executeScript("window.scrollTo(0,9226)");
    js.executeScript("window.scrollTo(0,10468)");
    js.executeScript("window.scrollTo(0,12098)");
  }
}
