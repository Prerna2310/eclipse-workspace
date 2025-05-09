import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentchildXpath {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (3)\\Chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://google.com");
		//driver.findElement(By.xpath("//div[@class='gb_8d gb_h gb_mg gb_dg']/div[2]/a")).click(); //opens google images
		driver.findElement(By.xpath("//ntp-realbox[@id=\"realbox\"]/#shadow-root (open)/div/input")).sendKeys("Hello");
				}
}
