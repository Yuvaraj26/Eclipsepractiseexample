package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriverscopexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//limiting the webdriver scope by using findelement and findelements method
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		//Calculate the link count in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement Footer=driver.findElement(By.id("gf-BIG"));
		System.out.println(Footer.findElements(By.tagName("a")).size());
		
		

	}

}
