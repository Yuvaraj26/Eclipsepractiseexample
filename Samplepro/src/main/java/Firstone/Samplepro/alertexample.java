package Firstone.Samplepro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.name("cusid")).sendKeys("1202");
		driver.findElement(By.name("submit")).click();
		//Switch to alert popup
		Alert alert=driver.switchTo().alert();
		String alertmessage=alert.getText();
		//Used to get the alermessage text
		System.out.println(alertmessage);

	Thread.sleep(5000);	
	//Clicks on submit/OK button in alert popup	
	//alert.accept();
	//click on cancel button in alert popup
	alert.dismiss();
	
		//Thread.sleep(5000);	
	//	alert.accept();
	
		
		
	}

}
