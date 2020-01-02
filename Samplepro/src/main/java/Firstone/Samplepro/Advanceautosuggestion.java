package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Advanceautosuggestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * WebDriver driver; System.setProperty("webdriver.chrome.driver",
		 * "/Users/yuvarajk/Downloads/chromedriver"); driver = new ChromeDriver();
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://ksrtc.in/oprs-web/");
		driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
		/*
		 * driver.findElement(By.id("fromPlaceName")).sendKeys("beng");
		 * driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		 * driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		 */
		//driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		//Text  is not displsyed because thst particular text is idden innn page source
		//System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		//Javascript executor is used to finnnd te hidden element bby tranversing through DOM
		JavascriptExecutor js=(JavascriptExecutor)driver;
		String script= "return document.getElementById(\"fromPlaceName\").value; ";
	//Execute the java script 
		String text=	(String) js.executeScript(script);
	System.out.println(text);
	int i=0;
	while(!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
	{
		driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.ARROW_DOWN);
		text=	(String) js.executeScript(script);
		System.out.println(text);
	
	
	if(i>5)
	{
		break;
	}
	
	}
	if(i>10)
	{
		System.out.println("ellement not found");
	}

}

}