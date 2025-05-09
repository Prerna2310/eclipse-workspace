import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Cart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\USER\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//wait for 5 sec max--implicit wait applied globally
		WebDriverWait w=new WebDriverWait(driver,5);
		String[] itemsNeeded = {"Cucumber","Brocolli","Beetroot","Carrot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise");

		Thread.sleep(3000);
		addItems(driver,itemsNeeded);
		
		//Proceed to checkout
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		
		//explicit wait--wait until promoinfo is visible
		
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	public static void addItems(WebDriver driver, String[] itemsNeeded)
	{
		int j=0;
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		// find list of all elements which have class as product-name

		for (int i=0; i<products.size(); i++) {
			
			// getting index of products and their title
			//we have Brocolli - 1 kg, we need Brocolli only,using split function 
			
			String[] name = products.get(i).getText().split("-");
			//trim the name to remove white space
			String formattedName=name[0].trim();
			
			//format the text(Cucumber-1kg) to get actual vegetable name(Cucumber)

			// convert array to arraylist for easy search
			// check whether name extracted is present in itemsNeeded arrayList

			List itemsNeededList = Arrays.asList(itemsNeeded);

			if (itemsNeededList.contains(formattedName)) 
			{
				j++;
				// click on Add to Cart, get the index value via get(i) and click 
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if(j==itemsNeeded.length)
				{
					break;
				}
			}
		}
	}

}
