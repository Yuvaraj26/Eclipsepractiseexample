package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Uivaidationforenableanddisablle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//In travel siite checking the dropdownn is enabled or not,Even though the drop down looks disable in UI but when you click on it,it gets enabled
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		//.ChromeDriver d=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		//Both the below code returns the drop down enabled as true though the dropdown is disabled in line 18
		
		
		/*
		 * System.out.println((driver.findElement(By.id("ctl00_mainContent_view_date2"))
		 * ).isEnabled());
		 * driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		 * System.out.println((driver.findElement(By.id("ctl00_mainContent_view_date2"))
		 * ).isEnabled());
		 */
		 
		
		//Trying to find difference between enabled and disabled checkbox
		System.out.println((driver.findElement(By.id("Div1"))).getAttribute("style"));
		
		  driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		  System.out.println((driver.findElement(By.id("Div1"))).getAttribute("style")) ;
		 
		//Used to throw pass when the drop down is enabled and throw error when dropdown is disabled
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))
		{
			System.out.println("is enabled");
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertFalse(true);
		}
		driver.quit();
	}

}
