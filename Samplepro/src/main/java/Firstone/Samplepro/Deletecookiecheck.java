package Firstone.Samplepro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Deletecookiecheck {

	public static void main(String[] args) throws IOException, ParseException {
		System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.childrensplace.com/us/home");
//		driver.get("https://www.google.com");
		//driver.findElement(By.xpath("//div[@class='email-signup-modal-header']//button")).click();
		//driver.findElement(By.className("login-link")).click();
	//driver.findElement(By.name("emailAddress")).sendKeys("polo890@yopmail.com");
      //  driver.findElement(By.name("password")).sendKeys("Password001@");							
       // driver.findElement(By.xpath("//button[@class='button-primary login-button']")).click();
         driver.manage().deleteCookieNamed("JSESSIONID");
         File f1 = new File("jsession.data");
			FileReader f2 = new FileReader(f1);
			BufferedReader b1 = new BufferedReader(f2);
			String strline;
			while ((strline = b1.readLine()) != null) {
				StringTokenizer split = new StringTokenizer(strline,";");
				while (split.hasMoreTokens()) {
					String name = split.nextToken();
					//System.out.println(name);
					String value = split.nextToken();
					//System.out.println(value);
					//System.out.println(value);
//					String Domain = split.nextToken();
//					System.out.println(Domain);
//					String getpath = split.nextToken();
//					Date expiry=null;
//					String datevalue=split.nextToken();
//					DateFormat d1=new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy");
//					Date expire=d1.parse(datevalue);
//					String isSecure1=split.nextToken();
//					Boolean isSecure=Boolean.parseBoolean(isSecure1);
	Cookie  ck=new Cookie(name, value);
			driver.manage().addCookie(ck);
			driver.navigate().refresh();
		//			System.out.println(ck);
					Cookie ck1=driver.manage().getCookieNamed("JSESSIONID");
					System.out.println(ck1);
				}
		// TODO Auto-generated method stub

	}

}
	}
