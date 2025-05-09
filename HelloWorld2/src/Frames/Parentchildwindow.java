package Frames;

import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parentchildwindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (2)\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://rahulshettyacademy.com/loginpagePractise/");
			driver.findElement(By.cssSelector("a.blinkingText")).click();	
			
			Set<String> windows=driver.getWindowHandles();//get parent id,child id
			java.util.Iterator<String> it = windows.iterator();
			String parentId=it.next();//go to 0th index
			String childId=it.next();//go to next window
			
			//switch to child window
			driver.switchTo().window(childId);
			
			//split text 2 times from the sentence
			String emailID=driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
			
			//switch to parent window
			driver.switchTo().window(parentId);
			driver.findElement(By.id("username")).sendKeys(emailID);
			
			
	}

}
