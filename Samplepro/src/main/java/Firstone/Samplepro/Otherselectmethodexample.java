package Firstone.Samplepro;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Otherselectmethodexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
		// .ChromeDriver d=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("http://compendiumdev.co.uk/selenium/basic_html_form.html");
		Select s = new Select(driver.findElement(By.xpath("//select[@name='multipleselect[]']")));
		s.selectByValue("ms1");
		Thread.sleep(1000);
		// Used to deselect the selected option
		s.deselectAll();
		// Used to deselect the particular index
		s.selectByIndex(0);
		Thread.sleep(1000);
		s.deselectByIndex(0);
		Thread.sleep(1000);
		// Used to deselect option by value
		s.selectByVisibleText("Selection Item 3");
		Thread.sleep(1000);
		s.deselectByValue("ms3");
		Thread.sleep(1000);

		// Used to deselect option by visible text
		s.selectByVisibleText("Selection Item 3");
		Thread.sleep(1000);
		s.deselectByVisibleText("Selection Item 3");
		Thread.sleep(1000);
		driver.quit();

	}

}
