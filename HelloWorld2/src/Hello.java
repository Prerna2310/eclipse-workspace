import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello{
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver path");//provide chromedriver path
		WebDriver driver=new ChromeDriver();
		driver.get("https://topgeek.io/");
		WebElement a=driver.findElement(By.className("button.chakra-button.css-1w9gwcb"));
		a.click();
		String title=driver.getTitle();
		
	}
	
}