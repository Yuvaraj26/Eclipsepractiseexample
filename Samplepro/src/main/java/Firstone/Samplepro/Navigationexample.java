package Firstone.Samplepro;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.ImeHandler;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigationexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.DemoQA.com");
		driver.findElement(By.xpath("//a[contains(text(),'Sortable')]")).click();;
driver.navigate().back();
driver.navigate().forward();
Thread.sleep(2000);
driver.navigate().to("https://google.com/");
driver.navigate().refresh();
Set<Cookie> G1=driver.manage().getCookies();
System.out.println(G1);
//ImeHandler imeex=driver.manage().ime();
//List<String> I1=imeex.getAvailableEngines();
//System.out.println(I1);
	}

}
