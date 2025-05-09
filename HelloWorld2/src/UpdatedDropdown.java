import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();//locate Passengers dropdown
		Thread.sleep(2000L);
		
		/*int i=1;
		while(i<5)//using loop to add more adults required to avoid repetition of step
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;//till i=4, the loop will run and add 4 adults.
		}*/System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();//Click on Done after selection of adults
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");//compares actual result and expected result
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
