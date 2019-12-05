package Firstone.Samplepro;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

import javax.swing.text.DateFormatter;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class cookiewrite {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/yuvarajk/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.childrensplace.com");
		try {
			File f1 = new File("targetfille.data");
			FileReader f2 = new FileReader(f1);
			BufferedReader b1 = new BufferedReader(f2);
			String strline;
			while ((strline = b1.readLine()) != null) {
				StringTokenizer split = new StringTokenizer(strline, ";");
				while (split.hasMoreTokens()) {
					String name = split.nextToken();
					String value = split.nextToken();
					String Domain = split.nextToken();
					System.out.println(Domain);
					String getpath = split.nextToken();
					Date expiry = null;
					String Val;
					if (!(Val = split.nextToken()).equals("null")) {
						// System.out.println(Val);
						// Dateformat parsing
						DateFormat expirys = new SimpleDateFormat("EEE MMM dd kk:mm:ss z yyyy");
						expiry = expirys.parse(Val);
						// System.out.println(exp);

						System.out.println(expiry);
					}
					// Boolean isSecure=new Boolean
					// Boolean parsing
					String secure = split.nextToken();
					Boolean isSecure = Boolean.parseBoolean(secure);
					Boolean a = isSecure.booleanValue();
					System.out.println(a);
					System.out.println(isSecure);
					// Cookie ck=new Cookie(name, value, Domain, getpath, expiry, isSecure);
					Cookie ck = new Cookie(name, value, Domain, getpath, expiry, isSecure);
					System.out.println(ck);
					driver.manage().addCookie(ck);
				}
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//driver.get("http://demo.guru99.com/test/cookie/selenium_aut.php");

	}

}
