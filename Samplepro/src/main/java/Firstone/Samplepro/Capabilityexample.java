package Firstone.Samplepro;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Capabilityexample {
	public static void main (String args[]) throws InterruptedException
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
	//.ChromeDriver d=new ChromeDriver();
	driver = new ChromeDriver();
	Capabilities h=((RemoteWebDriver)driver).getCapabilities();
	String browsername=h.getBrowserName();
	String Version=h.getVersion();
	System.out.println(browsername +  Version);
	Platform platform=h.getPlatform();
	System.out.println(platform);

}
}
