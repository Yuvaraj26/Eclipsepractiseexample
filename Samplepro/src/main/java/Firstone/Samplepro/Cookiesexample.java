package Firstone.Samplepro;





import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookiesexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.childrensplace.com/us/home");
//		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class='email-signup-modal-header']//button")).click();
		driver.findElement(By.className("login-link")).click();
	driver.findElement(By.name("emailAddress")).sendKeys("polo890@yopmail.com");
        driver.findElement(By.name("password")).sendKeys("Password001@");							
        driver.findElement(By.xpath("//button[@class='button-primary login-button']")).click();
        		
      //  Cookie ck=(Cookie) driver.manage().getCookies();
       // Set<org.openqa.selenium.Cookie> ck =driver.manage().getCookies();
        Cookie ck=driver.manage().getCookieNamed("JSESSIONID");
        System.out.println(ck);
     
//System.out.println(I1);
        File file =new File("jsession.data");
        try {
			file.createNewFile();
			FileWriter f1=new FileWriter(file);
			BufferedWriter B1=new BufferedWriter(f1);
//			for(Cookie Ck:driver.manage().getCookies())
//			{
				B1.write(ck.getName()+";"+ck.getValue()+";"+ck.getDomain()+";"+ck.getPath()+";"+ck.getExpiry()+";"+ck.isSecure());
			B1.newLine();
			System.out.println(ck);
//			}
			
			B1.close();
			f1.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// cookieexample=driver.manage().getCookies();

	}
}
