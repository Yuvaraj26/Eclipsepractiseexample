package Firstone.Samplepro;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Winndowdimensionexample {
	public static void main (String args[]) throws InterruptedException
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
	//.ChromeDriver d=new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	//Used to get size of the current window
	Dimension D1=driver.manage().window().getSize();
	System.out.println(D1);
	//Used to get position of te current window
	Point P1=driver.manage().window().getPosition();
	System.out.println(P1);
	//Used to set the size of current window
	Dimension D2=new Dimension(1000, 900);
	driver.manage().window().setSize(D2);
	///Used to set the position of current window
	Point P2=new Point(200, 300);
	driver.manage().window().setPosition(P2);
	//Used to full screen the curent window
	driver.manage().window().fullscreen();
	//Used to maximize the current window
	driver.manage().window().maximize();
	
	
	}
	
}
