package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nestedframes {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com");
		
		driver.findElement(By.linkText("Nested Frames")).click();//click on link using linktext
		
		driver.switchTo().frame("frame-top");
		
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.id("content")).getText());
	}

}
