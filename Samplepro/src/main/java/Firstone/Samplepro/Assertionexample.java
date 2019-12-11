package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertionexample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		//.ChromeDriver d=new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com");
		// TODO Auto-generated method stub
		//Used to select the checkbox
		//driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
		//Used to check whether the mentioned element is displayed or not
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isDisplayed());
		//Used to Asserts that a condition is true. If it isn't, an AssertionError is thrown 
		Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isDisplayed());
		////Used to check whether the mentioned element is selected or not
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		//Asserts that a condition is false. If it isn't, an AssertionError is thrown.
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
		////Used to check whether the mentioned element is enabled or not
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isEnabled());
		//Used to get the number of checkbox present in the page
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
		//assert between actual and expected. if both are not equal an assertion error is thrown
		Assert.assertEquals(driver.findElements(By.xpath("//input[@type='checkbox']")).size(), 5);
		driver.quit();
		

	}

}
