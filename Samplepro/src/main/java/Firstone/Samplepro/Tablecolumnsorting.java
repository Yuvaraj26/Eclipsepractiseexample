package Firstone.Samplepro;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tablecolumnsorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
	List<WebElement> fruits=driver.findElements(By.xpath("//tr/td[2]"));
	ArrayList<String> Originallist=new ArrayList<String>();
	for(int i=0;i<fruits.size();i++)
	{
		//System.out.println(fruits.get(i).getText());
		Originallist.add(fruits.get(i).getText());
	}
	ArrayList<String> Copiedlist= new  ArrayList<String>();
	for (int j=0;j<Originallist.size();j++)
	{
		Copiedlist.add(Originallist.get(j));
	}
Collections.sort(Copiedlist);
for(String s:Copiedlist)
{
	System.out.println(s);
}
Assert.assertTrue(Originallist.equals(Copiedlist));
	}

}
