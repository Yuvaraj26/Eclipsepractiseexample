package Firstone.Samplepro;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Takescreenshotexample {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		 {
			// TODO Auto-generated method stub

		
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		//.ChromeDriver d=new ChromeDriver();
		driver = new ChromeDriver();
		driver.get("https://google.com");
		//Steps to take screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("/Users/yuvarajk/Downloads/Samplescreen.png"));
		driver.quit();
		

	}
	}
}


