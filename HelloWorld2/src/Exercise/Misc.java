package Exercise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Misc {//common for every browser

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();//to maximise the browser window
		driver.manage().deleteAllCookies();//to delete cookies
		
		//session key deletion
		//driver.manage().deleteCookieNamed("sessionkey");//to delete one cookie with known name
		driver.get("https://google.com");
		
		//to take screenshots and copy them to local folder
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\screenshot.png"));
	}

}
