package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkboxhandlinng {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		//.ChromeDriver d=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		// TODO Auto-generated method stub
		//Used to select the checkbox
		driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		//Used to check whether the mentioned element is displayed or not
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isDisplayed());
		////Used to check whether the mentioned element is selected or not
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		////Used to check whether the mentioned element is enabled or not
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isEnabled());
		//Used to get the number of checkbox present in the page
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		driver.quit();
		
		

	}

}
