package Firstone.Samplepro;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Staticdropdownexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		//.ChromeDriver d=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		//Static dropdown is a dropdown which has select tag
		org.openqa.selenium.support.ui.Select s=new org.openqa.selenium.support.ui.Select(driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']")));
//Select by value
		s.selectByValue("AED");
		Thread.sleep(1000);
//Select by index - index value start with 0
		s.selectByIndex(3);
		Thread.sleep(1000);
//select by visible text
	s.selectByVisibleText("INR");
	Thread.sleep(1000);
	driver.quit();
	}


}
