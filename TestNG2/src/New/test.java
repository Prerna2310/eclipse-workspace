package New;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class test {

	@Test(enabled=false)
	public void MobileloginHomeloan(){
		
		System.out.println("MobileloginHomeloan");
	}
	
	@Test(groups= {"Smoke"})
	public void MobileloginCarLoan()
	{
		System.out.println("MobileloginCarLoan");
	}

	
	@BeforeTest
	public void test2()
	{
		System.out.println("i will execute first");
	}
	@BeforeMethod
	public void Beforeevery()
	{
		System.out.println("i will execute before every method");
	}

	
	@AfterMethod
	public void Aftermethod()
	{
		System.out.println("i will execute after each method");
	}
	
	@Test(dependsOnMethods={"APIloginCarLoan"})
	public void MobilesigninCarLoan()
	{
		System.out.println("MobilesigninCarLoan");
	}
	@Test(groups= {"Smoke"})
	public void APIloginCarLoan()
	{
		System.out.println("LoginAPICarLoan");
	}
}
