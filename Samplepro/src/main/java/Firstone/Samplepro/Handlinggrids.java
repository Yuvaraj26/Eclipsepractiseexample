package Firstone.Samplepro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlinggrids {

	public static void main(String[] args) {
		int sum=0;
		
		// TODO Auto-generated method stub
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22582/aus-vs-nz-2nd-test-new-zealand-tour-of-australia-2019-20");
		WebElement table=driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
		int rowcount=table.findElements(By.cssSelector("cb-col cb-col-100 cb-scrd-itms")).size();
		int count=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
		for(int i=0;i<count-2;i++)
		{
			System.out.println(table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
		String value=table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText();
		int valueinteger= Integer.parseInt(value);
		sum=sum+valueinteger;
		
		}
		System.out.println(sum);
		String Extra=driver.findElement(By.xpath("//div[text()='Extras']/following-sibling::div")).getText();
		int stringint=Integer.parseInt(Extra);
		int totalval=sum+stringint;
		System.out.println(totalval);
		System.out.println(driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText());
		String actualtotal=driver.findElement(By.xpath("//div[text()='Total']/following-sibling::div")).getText();
		int actualvall=Integer.parseInt(actualtotal);
		if(actualvall==totalval)
		{
			System.out.println("count matches");
		}
		else
		{
			System.out.println("Counnt not match");
		}
	}

}
