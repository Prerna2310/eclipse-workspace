import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.FileHandler;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class NewWindowL127 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//to switch to different tab and get url
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Set<String>handles=driver.getWindowHandles();
		Iterator<String> it=handles.iterator();
		String parentWindow=it.next();
		String childWindow=it.next();
		driver.switchTo().window(childWindow);
		driver.get("https://rahulshettyacademy.com/");
		String course=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();
		driver.switchTo().window(parentWindow);
		WebElement name=driver.findElement(By.cssSelector("[name='name']"));
		name.sendKeys(course);
		
		//to capture screenshot
		File source=name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\screenshot.png"));
		
		//get height and width of UI
		System.out.println(name.getRect().getDimension().getHeight());
		System.out.println(name.getRect().getDimension().getWidth());
	}

}
