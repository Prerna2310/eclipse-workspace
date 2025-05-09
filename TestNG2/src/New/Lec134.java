package New;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class Lec134 {
	
	@AfterTest
	public void sample()
	{
		System.out.println("execute last");
	}
	
	@Test
	public void sample1() {
		// TODO Auto-generated method stub
		System.out.println("hello");
		
	}

	@Test(groups= {"Smoke"})
	public void sample2()
	{
		System.out.println("Bye");
	}
	
	
	@BeforeSuite
	public void BfSuite()
	{
		System.out.println("run first");
	}
	
	@BeforeClass
	public void BFClass()
	{
		System.out.println("Before class");
	}
	
	@AfterClass
	public void AFClass()
	{
		System.out.println("After class");
	}
}
