package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframeexample {
	public static void main (String args[]) throws InterruptedException
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
	//.ChromeDriver d=new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("https://www.toolsqa.com/iframe-practice-page/");
	driver.manage().window().maximize();
	Thread.sleep(6000);
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