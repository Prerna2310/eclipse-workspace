import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpath {

public static void main(String[] args) throws InterruptedException {
// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\work\\chromedriver.exe");
WebDriver driver =new ChromeDriver();
driver.get("http://www.qaclickacademy.com/interview.php");
driver.findElement(By.xpath("//li[text()=' Selenium ']")).click();//finding element using text

driver.findElement(By.xpath("//ul[@class='responsive-tabs__list']/li[1]/following-sibling::li[2]")).click();//finding element using parent-child: absolute xpath,traversing to sibling

System.out.println(driver.findElement(By.xpath(".//*[@id='tablist1-tab2']/parent::ul")).getAttribute("role"));//traversing back to parent from child
//

}
}