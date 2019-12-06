package Firstone.Samplepro;

import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

//import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;

public class Fluentwaitexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//button[contains(text(),'Start')]")).click();
	Wait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
	WebElement ele=wait.until(new Function<WebDriver, WebElement>() {
		public WebElement apply(WebDriver driver) {
			return driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]"));
		}
	});
	System.out.println(driver.findElement(By.xpath("//h4[contains(text(),'Hello World!')]")).isDisplayed());
	}
}
