package Firstone.Samplepro;

import java.util.List;
import java.util.Optional;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.SessionNotCreatedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.Location;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.gargoylesoftware.htmlunit.javascript.configuration.WebBrowser;

import mx4j.tools.i18n.I18NStandardMBean;

public class Capabilityexample {
	public static void main (String args[]) throws InterruptedException
	{
	WebDriver driver;
	System.setProperty("webdriver.chrome.driver","/Users/yuvarajk/Downloads/chromedriver");
	//.ChromeDriver d=new ChromeDriver();
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
	Capabilities h=((RemoteWebDriver)driver).getCapabilities();
	String browsername=h.getBrowserName();
	String Version=h.getVersion();
	System.out.println(browsername +  Version);
	Platform platform=h.getPlatform();
	System.out.println(platform);
	Location l1= new Location(0, 1, 2);
	Double e=l1.getAltitude();
	//Double f =I1
	
	
	System.out.println(e);
	
		/*
		 * WebDriverInfo Wifi=(WebDriverInfo) new ChromeDriver(); String
		 * e=Wifi.getDisplayName(); System.out.println(e);
		 */
//String D=((WebDriverInfo)driver).getDisplayName();
		/*
		 * System.out.println(D); System.out.println(h);
		 */
			
	
	}
}
		