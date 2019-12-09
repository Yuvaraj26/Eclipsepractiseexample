package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		//.ChromeDriver d=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/ajax.html");
		//to find number of iframe in the page
			WebElement e=driver.findElement(By.xpath("//input[@id='yes']"));
			WebElement z=driver.findElement(By.xpath("//body//label[1]"));
			//e.click();
			//Used to find where on the page is the top left-hand corner of the rendered element?
			Point p=e.getLocation();
			System.out.println(p);
			//Used to find size(Width and height) of the element
			Dimension d=e.getSize();
			System.out.println(d);
			//Used to find the location and size of the rendered element
			Rectangle r=e.getRect();
			int x=r.getX();
			int y=r.getY();
			int width=r.getWidth();
			int height=r.getHeight();
			System.out.println("X:"+x);
			System.out.println("Y:"+y);
			System.out.println("width:"+width);
			System.out.println("height:"+height);
			//Used to get tag name of the element
			String f=e.getTagName();
			System.out.println(f);
			//Used to get the value for the provided attribute
			String g=e.getAttribute("id");
			System.out.println(g);
		 //Used to check whether the element is displayed or not
			Boolean b=e.isDisplayed();
			System.out.println(b);
			//Get the visible text of the element
			String visibletext=z.getText();
			System.out.println(visibletext);
			//Used to check whether the element is enabled or not
			Boolean w=e.isEnabled();
			System.out.println(w);
		//Used to check whether the element is selected or nor,it is used mostly for checkbox and radiobutton
			Boolean v=e.isSelected();
			System.out.println(v);
			//used to cllick the element
			e.click();
			//Used to submit the form
			e.submit();
			//Used to clear the text entered in the text box
		/*
		 * Point f=e.getLocation(); 
		 * System.out.println(f);
		 */
	}

}
