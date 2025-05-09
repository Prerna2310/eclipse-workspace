import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com/");
		//Dropdown
		
		WebElement Adult=driver.findElement(By.xpath("//div[@class='mb-4'] //select[@class='bc-neutral-100 bg-transparent']"));
		Select s=new Select(Adult);
		s.selectByIndex(4);
		System.out.println(s.getFirstSelectedOption().getText());
		
		/*WebElement child=driver.findElement(By.xpath(""));
		Select s1=new Select(child);
		s1.selectByValue("3");
		driver.findElement(By.cssSelector(".t-all.ml-2")).click();*/
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@href='javascript:void(0);']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Airline name']")).sendKeys("Indigo");
		driver.findElement(By.xpath("//button[@class='px-7 bg-primary-500 hover:bg-primary-600 c-white bc-transparent c-pointer w-100p py-2 px-5 h-10 fs-4 fw-600 t-all button bs-solid tp-color td-500 bw-1 br-4 lh-solid box-border']")).click();
		System.out.println(driver.findElement(By.xpath("//span[@class='to-ellipsis o-hidden ws-nowrap fs-3 c-white']")).getText());
		
	}

}
