import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(withTagName("label").above(nameEditBox)).getText());
		WebElement dateofbirth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(withTagName("input").below(dateofbirth)).sendKeys("12/11/2021");
		WebElement checkbox=driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(withTagName("input").toLeftOf(checkbox)).click();
		
		//get me label of first radio button
		WebElement radiobutton=driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(withTagName("label").toRightOf(radiobutton)).getText());
	}

}