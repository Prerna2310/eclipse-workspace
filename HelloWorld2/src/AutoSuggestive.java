import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive {//Autosuggestive dropdowns

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("autosuggest")).sendKeys("ind");//sending input as ind to be put in space under Country
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		//all options under ind are extracted through css selector,options store all the three locators in list
		for(WebElement option :options)//for(return type variable= variable used in previous step)
		{
			if(option.getText().equalsIgnoreCase("India"))//go in options list,if text is India then click.
			{
				option.click();
				break;//for loop ends automatically
			}
		}
	}
}
