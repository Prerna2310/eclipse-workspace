import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Selenium code
		//invoke browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\OneDrive\\Documents\\Automation Testing\\chromedriver.exe");
		//Create Driver object
		WebDriver driver= new ChromeDriver(); 
		driver.get("http://google.com");//hit url on browser 
		System.out.println(driver.getTitle());//get title of the webpage or validate if ur page title is correct
		
		System.out.println(driver.getCurrentUrl());//validate if u r landed on correct url
		//System.out.println(driver.getPageSource());//print page source
		driver.get("http://yahoo.com");
		driver.navigate().back();//navigate back from web page
		//driver.navigate().forward();//navigate to next page
		driver.close();//it closes current browser
		//driver.quit();//it closes all the browsers opened by selenium script (used for closing parent and child windows i.e. when opening a link any tab opens then it is child window)
	}

}
