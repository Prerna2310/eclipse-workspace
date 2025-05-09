package Exercise;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class Brokenlinks {
	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links=driver.findElements(By.cssSelector(".gf-li a"));
		SoftAssert a=new SoftAssert();
		for(WebElement link: links)//enhanced for loop
		{
			String url=link.getAttribute("href");
			HttpURLConnection conn=(HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			int respCode=conn.getResponseCode();
			System.out.println(respCode);
			a.assertTrue(respCode<400, "The link with text "+link.getText()+" is broken "+respCode);
			/*if(respCode>400)
			{
				System.out.println("The link with text "+link.getText()+" is broken "+respCode);
				Assert.assertTrue(false);//stops execution 
			}*/
		}
		a.assertAll();
		//broken URL
		//Step 1-to get all URLs tied to links using Selenium
		//Step 2-Java methods will call URL and gets you the status code
		//if status code>400 then the URL is not working--link tied to the URL is broken
		//creating the object and calling that method with the object and the openconnection() method.
	}
	

}
