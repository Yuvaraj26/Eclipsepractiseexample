package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamicdropdownexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	
//Dynamic dropdown is dropdown that gets updated based on selection made in different field
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
	//.ChromeDriver d=new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("https://www.spicejet.com");
	driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	driver.findElement(By.xpath("//a[@value='BLR']")).click();
	Thread.sleep(1000);
	//Used index - {2] to select the BLR from To dropdown
	driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
}
}