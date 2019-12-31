package Firstone.Samplepro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlingcalendar {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.path2usa.com/travel-companions/post-travel-companion");
		//Select month and date
		Thread.sleep(2000);
		driver.findElement(By.id("travel_date")).click();
	
		//Select month
		while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("April"))
		{
			driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
		}
		//Select date
		List<WebElement> date=driver.findElements(By.className("day"));
		int count=date.size();
		for (int i=0;i<count;i++)
		{
		String text=date.get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
			date.get(i).click();
			break; //break is used to get out of the for loop once the if condition founds the expected value
		}
		//driver.quit();
		}
		
	}

	}
