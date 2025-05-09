package Exercise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabledemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		/*scroll window, find no.of rows and columns JavascriptExecutor
		 * js=(JavascriptExecutor)driver; js.executeScript("window.scrollBy(0,600)");
		 * System.out.println("No.of rows = "+driver.findElements(By.cssSelector("div[class='left-align'] table[id='product'] tbody tr")).size());
		 * System.out.println("No.of columns = "+driver.findElements(By.cssSelector("table[id='product'] tbody tr th")).size());
		 * System.out.println(driver.findElement(By.cssSelector("div[class='left-align'] table[id='product'] tbody tr:nth-child(3)")).getText());
		 */
		WebElement table = driver.findElement(By.id("product"));
		
		System.out.println(table.findElements(By.tagName("tr")).size());

		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());

		List<WebElement> secondrow = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));

		System.out.println(secondrow.get(0).getText());

		System.out.println(secondrow.get(1).getText());

		System.out.println(secondrow.get(2).getText());
		int sum=0;
		List<WebElement> amount=driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		for(int i=0;i<amount.size();i++)
		{
			sum=sum+Integer.parseInt(amount.get(i).getText());//to convert String to Int for addition
		}
		System.out.println("total amount is " +sum);

	}

}
