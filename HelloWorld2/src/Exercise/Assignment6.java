package Exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\USER\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//int i=driver.findElements(By.id("checkbox-example")).size();
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String opt=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
	
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select drop=new Select(dropdown);
		drop.selectByVisibleText(opt);
		
		driver.findElement(By.id("name")).sendKeys(opt);
		driver.findElement(By.id("alertbtn")).click();
		String text=driver.switchTo().alert().getText();
		
		if(text.contains(opt))
		{
			System.out.println("Successful");
		}
		else
			System.out.println("Not successful");
	}

}
