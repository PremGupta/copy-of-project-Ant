package dataDriven;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations {

// new 
	@BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("BeforeMethod - Userid Generation");
	} 
 
	@Test(dataProvider="getData")
	public void userid(String username, String password)
	{
		System.out.println(username);
		System.out.println(password);
	
	}
	
	@BeforeTest
	public void Cookies()
	{
		System.out.println("BeforeTest - Cookies deletion");
	}

	
	@AfterMethod
	public void BrowserClose()
	{
		System.out.println("AfterMethod - BrowserClose");
	}

	@AfterTest
	public void CookiesClose()
	{
		System.out.println("AfterTest - Cookies Close");
		//System.out.println("                   ");
	}
	
	@Test
	public void AOpeningBrowser()
	{
		System.out.println("Test1 - OpeningBrowser");
	}
	
	@Test
	public void FlightBooking()
	{
		System.out.println("Test2 - FlightBooking");
	}
	
	@DataProvider
	public Object[][] getData()
	{
		Object[][] data=new Object[2][2];
		data[0][0]="premusername";
		data[0][1]="premassword";
		
		data[1][0]="premusername1";
		data[1][1]="premassword1";
		
		return data;
	}
}
