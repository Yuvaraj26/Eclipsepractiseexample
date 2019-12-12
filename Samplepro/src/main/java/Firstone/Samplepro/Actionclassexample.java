package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actionclassexample {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
		// .ChromeDriver d=new ChromeDriver();
	driver=new ChromeDriver();
	driver.get("https://www.amazon.com");
	Actions a=new Actions(driver);
	Thread.sleep(1000);
	//a.moveToElement(driver.findElement(By.xpath("//span[contains(@class,'nav-line-2')][contains(text(),'Account & Lists')]"))).build().perform();
	//Thread.sleep(1000);
	a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
Thread.sleep(1000);
	driver.quit();

	}

}
