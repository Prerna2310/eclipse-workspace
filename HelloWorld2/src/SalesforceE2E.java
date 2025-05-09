import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesforceE2E {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://www.rediff.com/");
		driver.findElement(By.cssSelector("a[title*='Sign in']")).click();//using regular exp for css
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hello@gmail.com");
		//driver.findElement(By.xpath("//input[contains(@name,'login')]")).sendKeys("hello");//regular exp for xpath
		driver.findElement(By.cssSelector("input[type*='password']")).sendKeys("12345");//using css syntax:(tagname#id)
		driver.findElement(By.cssSelector("input[type*='submit']")).click();
		//driver.findElement(By.xpath("//input[contains(@type,'submi')]")).click();//regular exp for xpath
	}

}
