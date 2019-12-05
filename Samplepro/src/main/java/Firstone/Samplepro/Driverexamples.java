package Firstone.Samplepro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driverexamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.childrensplace.com");
		String e=driver.getCurrentUrl();
		String f=driver.getPageSource(); 
		String h=driver.getTitle();
		System.out.println(e);
		System.out.println(f);
		System.out.println(h);
		
		

	}

}
