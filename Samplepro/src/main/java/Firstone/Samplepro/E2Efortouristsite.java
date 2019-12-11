package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2Efortouristsite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stubWebDriver driver;
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		//.ChromeDriver d=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		
		  Thread.sleep(2000); 
	
		  driver.findElement(By.xpath("//td[contains(@class,'ui-datepicker-today')]")).click();
//		 
		
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
		Thread.sleep(1000);
		driver.findElement(By.id("divpaxinfo")).click();
		Select S1=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		S1.selectByValue("4");
		Select S2=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
		S2.selectByValue("2");
		Select S3=new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
		S3.selectByValue("3");
		Select S4=new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
		S4.selectByValue("AED");
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
		//Select by value
			 s.selectByValue("AED");
			 driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		driver.quit();

	}

}
