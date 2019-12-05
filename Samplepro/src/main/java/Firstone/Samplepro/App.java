package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	WebDriver driver;
    	System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
    	//.ChromeDriver d=new ChromeDriver();
    	driver = new ChromeDriver();
    	driver.get("http://demo.guru99.com/test/guru99home/");
    	driver.manage().window().maximize();
    	String e=driver.getWindowHandle();
    	System.out.println(e);
    
//WebDriver frame(String nameOrId);
    	//Finding iframes through name/ID
		/*
		 * TargetLocator targetlocator=driver.switchTo();
		 * targetlocator.frame("a077aa5e");
		 * driver.findElement(By.xpath("//html//body//a//img")).click();
		 */
    	
    	//WebDriver frame(int index);
    	//Finding iframes through index
		/*
		 * TargetLocator targetlocator=driver.switchTo(); targetlocator.frame(1);
		 * driver.findElement(By.xpath("//html//body//a//img")).click(); }
		 */
    	
    	//WebDriver frame(WebElement frameElement);
    	//Select a frame using its previously located
    	//switch to an iFrame by simply passing the iFrame WebElement to the driver.switchTo().frame() command.
    	//Not working
		/*
		 * WebElement frameele=driver.findElement(By.xpath("/html[1]/body[1]/a[1]]"));
		 * TargetLocator targetlocator=driver.switchTo(); targetlocator.frame(frameele);
		 * frameele.click();
		 */
    	TargetLocator targetlocator=driver.switchTo(); 
    	targetlocator.frame(1);
		 driver.findElement(By.xpath("//html//body//a//img")).click();
		 
		 }
    	
    	
    	
   
    	
    	
    }

