package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handlingcalendarintravelsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		//.ChromeDriver d=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("divpaxinfo")).click();
		Select S1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		S1.selectByValue("4");
		Select S2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		S2.selectByValue("2");
		Select S3=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		S3.selectByValue("3");
		Select S4=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		S4.selectByValue("AED");
		Thread.sleep(1000);
		//Selecting the date in calendar
		driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
		driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today')]")).click();
		//Not working need to check later
		//driver.findElement(By.xpath("//a[@class='ui-state-default.ui-state-highlight.ui-state-active']")).click();
		driver.quit();
		
		

	}

}
