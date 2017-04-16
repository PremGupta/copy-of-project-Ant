package testngFiles;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Annotations {
	
	@BeforeMethod
	public void UseridGeneration()
	{
		System.out.println("BeforeMethod - Userid Generation");
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
	
//@Test
	@Parameters({"adminuserid"})
	public void FlightBooking(String Userid)
	{
		System.out.println(Userid);
		System.out.println("Test2 - OpeningBrowser");
	}
	
}
