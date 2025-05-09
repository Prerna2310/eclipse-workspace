import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://login.salesforce.com");
	driver.findElement(By.cssSelector("input[type='email']")).sendKeys("abcd");
	driver.findElement(By.cssSelector("#password")).sendKeys("1234");//tagname[attribute='value']
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(3000);//giving delay
	driver.close();
	}
}


