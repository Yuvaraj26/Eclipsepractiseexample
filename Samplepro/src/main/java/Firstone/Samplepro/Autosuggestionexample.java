package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestionexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		//.ChromeDriver d=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.findElement(By.id("src")).sendKeys("Che");
		Thread.sleep(1000);
	//press enter in the keyboard by using Keys.Enter
		driver.findElement(By.id("src")).sendKeys(Keys.ENTER);
		WebElement Destination=driver.findElement(By.id("dest"));
		Destination.sendKeys("Ti");
		Thread.sleep(2000);
		for(int i=0;i<3;i++)
		{
			Destination.sendKeys(Keys.ARROW_DOWN);
		}
		Destination.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.quit();
	}

}
