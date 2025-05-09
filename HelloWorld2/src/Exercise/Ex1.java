package Exercise;

import java.util.Set;
import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//1. count of links
		System.out.println(driver.findElements(By.tagName("a")).size());
		
		//2.count of footer section links 
		WebElement footerdriver=driver.findElement(By.id("gf-BIG"));//concept of limiting webdriver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3.link of first footer column
		WebElement columndriver=footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columndriver.findElements(By.tagName("a")).size());
		
		//4.click on each link and check pages are opening
		for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
		{
			String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);//click Ctrl and press link to open in new tab
			columndriver.findElements(By.tagName("a")).get(i).sendKeys(clicklink);			
		}

		//5.go to all tabs opened and get title
		//method 1
		/*Set<String> abc=driver.getWindowHandles();//get different windows
		Iterator<String> it=abc.iterator();//iterate to different tabs
		
		while(it.hasNext())//if iterator has more windows
		{
			driver.switchTo().window(it.next());//switch to next window*/
		//method 2
		for(String winHandle:driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
			System.out.println(driver.getTitle());
		}
	}

}
