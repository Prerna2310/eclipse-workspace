import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("http://facebook.com"); //URL in the browser
		/*driver.findElement(By.id("email")).sendKeys("mail2sharmaprerna@gmail.com"); //find element and put info
		driver.findElement(By.name("pass")).sendKeys("Prerna@23");
		driver.findElement(By.name("login")).click();
		//driver.findElement(By.linkText("Forgotten password?")).click();//forgot password is a click activity so we dont need to use sendkeys
  
		//driver.findElement(By.className("inputtext")).sendKeys("mail2sharma@gmail.com");//enters text into the email
		*/
		driver.findElement(By.cssSelector("#email")).sendKeys("mail2sharmaprerna@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Prerna@23");
		driver.findElement(By.linkText("Forgotten password?")).click();
}
	
 }
