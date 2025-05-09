package New;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Testing {

	
	@Test
	@Parameters({"URL","APIkey/username"})
	public void parameterisation(String URL, String key)
	{
		System.out.println("adding parameter");
		System.out.println(URL);
		System.out.println(key);
	}
	
	@Test(dataProvider="getData")
	public void Mobilelogin(String username,String password)
	{
		System.out.println("Mobilelogin");
		System.out.println(username);
		System.out.println(password);
	}
	@DataProvider
	public Object[][] getData()
	{
		//comb1=username and password-good credit history
		//comb2=username and password-no credit history
		//comb3=username and password-fraud credit history
		
		Object[][] data=new Object[3][2];
		//1st test data 
		data[0][0]="user1";
		data[0][1]="pswd1";
		
		//2nd test data
		data[1][0]="user2";
		data[1][1]="pswd2";
		
		//3rd test data
		data[2][0]="user3";
		data[2][1]="pswd";
			return data;	
	}
}
