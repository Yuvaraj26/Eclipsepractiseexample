package Firstone.Samplepro;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class timeoutexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		//Implicit wait example
		driver.manage().timeouts().implicitlyWait(3,TimeUnit.SECONDS);
		String eTitle = "Demo Guru99 Page";
		String aTitle = "" ;
		// launch Chrome and redirect it to the Base URL
		driver.get("http://demo.guru99.com/test/guru99home/" );
		//Maximizes the browser window
		driver.manage().window().maximize() ;
		//get the actual value of the title
		aTitle = driver.getTitle();
		//compare the actual title with the expected title
		if (aTitle.equals(eTitle))
		{
		System.out.println( "Test Passed") ;
		}
		else {
		System.out.println( "Test Failed" );
		}
		//close browser
		driver.close();
	}
	


	}


