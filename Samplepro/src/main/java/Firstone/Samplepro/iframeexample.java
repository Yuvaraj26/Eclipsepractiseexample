package Firstone.Samplepro;

import java.util.LinkedList;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class iframeexample {
	public static void main (String args[]) throws InterruptedException
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
	//.ChromeDriver d=new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	//to find number of iframe in the page
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		/*
		 * Frame switch through index 
		 * driver.switchTo().frame(0);
		 */
		
		  //Frame switch through "WebDriver frame(WebElement frameElement)";
		  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		 
		/*Frame switch through ID
		driver.switchTo().frame("Framenname");*/
		  
	driver.findElement(By.id("draggable")).click();
	//Drag and drop Web element
	Actions a=new Actions(driver);
	WebElement source=driver.findElement(By.id("draggable"));
	WebElement target=driver.findElement(By.id("droppable"));
	a.dragAndDrop(source, target).build().perform();
	//return back to main window from iframe
	driver.switchTo().defaultContent();
//Switc from cilld iframe to previoud parent iframe
	driver.switchTo().parentFrame();

	
		
		
	
		/*
		 * driver.get("https://www.toolsqa.com/iframe-practice-page/");
		 * driver.manage().window().maximize(); Thread.sleep(6000);
		 * driver.navigate().to("google.com"); driver.manage().
		 */
		//Not working
	
		/*
		 * TargetLocator targetlocator= driver.switchTo();
		 * targetlocator.frame("iframe1");
		 * driver.findElement(By.xpath("//div[@class=\"branding\"]//a/img" )).click();
		 * driver.switchTo().parentFrame(); Thread.sleep(4000);
		 * driver.switchTo().frame("iframe2");
		 * driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[1]/a")).
		 * click();
		 */
	} 
}
	/*driver.switchTo().frame("iframe1");
	WebElement sample=driver.switchTo().activeElement();
WebElement hi = driver.findElement(By.xpath("//p[text()='yuvi']"));

	System.out.println(sample);
	}
}*/