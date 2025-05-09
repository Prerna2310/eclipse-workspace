package Frames;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchwindowassign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector("div.example a")).click();
		
		Set<String> windows=driver.getWindowHandles();//get parent id,child id
		java.util.Iterator<String> it = windows.iterator();
		String parentId=it.next();//go to 0th window
		String childId=it.next();//go to next window
		
		driver.switchTo().window(childId);
		driver.get("https://the-internet.herokuapp.com/windows/new");
		System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		driver.switchTo().window(parentId);
		System.out.println(driver.findElement(By.cssSelector("div.example h3")).getText());
		
	}

}
