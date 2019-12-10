package Firstone.Samplepro;

import java.awt.List;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
	//
	Boolean b=s.isMultiple();
	System.out.println(b);
	//Used to get list of all options in the dropdown
	java.util.List<WebElement> s1= s.getOptions();
	for(WebElement s2:s1)
	{
		String lists=s2.getText();
		System.out.println(lists);
	}
		//Used to get all selected options in the dropdown
	java.util.List<WebElement> t1=s.getAllSelectedOptions();
	for(WebElement t2:t1)
	{
		String lists1=t2.getText();
		System.out.println(lists1);
	}
	
	//Used to get the first selected element in dropdown
	WebElement c=s.getFirstSelectedOption();
	String c1=c.getText();
	System.out.println(c1);
	
	//
	
		 
	driver.quit();
	}


}
