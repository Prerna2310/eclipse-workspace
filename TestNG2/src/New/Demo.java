package New;
import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Demo {

	@Test(groups= {"Smoke"})
	public void test1()
	{
		System.out.println("good");
		Assert.assertTrue(false);
	}
	@Parameters("URL")
	@AfterSuite
	public void AfSuite(String urlname)
	{
		System.out.println("last");
		System.out.println(urlname);
	}
}
