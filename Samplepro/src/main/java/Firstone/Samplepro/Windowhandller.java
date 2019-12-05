package Firstone.Samplepro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandller {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;
		String Childwindow = null ;
		System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
		driver = new ChromeDriver();
		String Mainwindow = driver.getWindowHandle();
		System.out.println(" Main window  : " + Mainwindow);
		driver.get("http://demo.guru99.com/popup.php");
		driver.manage().window().maximize();


		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		Set<String> I1 = driver.getWindowHandles();
		System.out.println(I1);
		Iterator<String> s1 = I1.iterator();
		System.out.println(" s1 :" + s1);
//	while(s1.hasNext())
//	{
		 Childwindow = s1.next();
		 System.out.println(Childwindow);
		 Childwindow = s1.next();
		System.out.println(" Child window" + Childwindow);
//	}
		if (!Mainwindow.equalsIgnoreCase(Childwindow))
		{
			driver.switchTo().window(Childwindow);
		Thread.sleep(2000);
		driver.findElement(By.name("emailid")).sendKeys("sample@yopmai.com");
		driver.findElement(By.name("btnLogin")).click();
		driver.close();
	}
driver.switchTo().window("Mainwindow");
}
}
