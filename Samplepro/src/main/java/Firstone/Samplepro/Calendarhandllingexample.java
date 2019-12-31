package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarhandllingexample {
 public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.path2usa.com/travel-companions");
	driver.findElement(By.xpath("//input[@id='travel_date']")).click();
	
 }

}
