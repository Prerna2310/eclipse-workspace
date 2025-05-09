import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Endtoend {//combination of all programs

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		/*driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();//from city
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();//to city
		*/
		// OriginStation

	    driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();

	    driver.findElement(By.cssSelector("a[value='DEL']")).click();     

	// Destination

	driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();

	  driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();//select date from calendar
		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))//check return date is disabled
		{	System.out.println("it's enabled");
			Assert.assertTrue(false);}
		else {
			Assert.assertTrue(true);}
		driver.findElement(By.id("divpaxinfo")).click();//locate Passengers dropdown
		Thread.sleep(2000L);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		driver.findElement(By.id("btnclosepaxoption")).click();//Click on Done after selection of adults
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"5 Adult");//compares actual result and expected result
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		driver.findElement(By.cssSelector("input[id*='friendsandfamily']")).click();//checkbox
		WebElement staticDropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));//locating currency dropdown
		Select dropdown=new Select(staticDropdown);//passed variable inside select statement
		dropdown.selectByIndex(3);//selecting a value through index number i.e USD in this case
		System.out.println(dropdown.getFirstSelectedOption().getText());
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("#ctl00_mainContent_btn_FindFlights")).click();//click on Search using css syntax--#idvalue
	}

}
