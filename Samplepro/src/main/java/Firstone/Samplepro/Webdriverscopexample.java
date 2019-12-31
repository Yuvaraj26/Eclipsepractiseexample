package Firstone.Samplepro;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;

import net.sourceforge.htmlunit.corejs.javascript.ast.WhileLoop;

public class Webdriverscopexample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//limiting the webdriver scope by using findelement and findelements method
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("http://www.qaclickacademy.com/practice.php");
		//Calculate the link count in the page
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement Footer=driver.findElement(By.id("gf-BIG"));
		//Calculating links in the footer
		System.out.println(Footer.findElements(By.tagName("a")).size());
		//calculating links present in the first column of footer
		WebElement Footercolumn=Footer.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(Footercolumn.findElements(By.tagName("a")).size());
		//Click on each link in the column
		
	for(int i=1;i<Footercolumn.findElements(By.tagName("a")).size();i++)
{
		//Keys.Chord used to press multiple keys at the same time
		String Combine=Keys.chord(Keys.COMMAND,Keys.ENTER);
		System.out.println(Combine);
		
		//get(i) * Returns the element at the specified position in this list.
				
				// @param index index of the element to return
				
	Footercolumn.findElements(By.tagName("a")).get(i).sendKeys(Combine);
}
	//Thread.sleep(1000);
	
	//To switch to different windows
	Set<String> S1=driver.getWindowHandles();
	System.out.println(S1);
	Iterator<String> I1=S1.iterator();
		/*
		 * for(String I2:I1) { System.out.println(I2); }
		 */
while(I1.hasNext())
{
	driver.switchTo().window(I1.next());
	System.out.println(driver.getTitle());
	Thread.sleep(2000);
}
	


		driver.quit();
		

	}

}
