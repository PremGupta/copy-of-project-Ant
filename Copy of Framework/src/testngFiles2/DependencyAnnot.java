package testngFiles2;

import org.testng.annotations.Test;

public class DependencyAnnot {
	@Test
	public void OpeningBrowser()
	{
		System.out.println("Test1 - OpeningBrowser");
	}
	
	@Test(dependsOnMethods={"OpeningBrowser"})
	public void FlightBooking()
	{
		System.out.println("Test2 - FlightBooking");
	}
	
	@Test(enabled=false)
	public void PaymentPage()
	{
		System.out.println("PaymentPage");
	}
	
	@Test(timeOut=5000)
	public void CreditCardPayment()
	{
		System.out.println("CreditCardPayment");
	}
	
	@Test(priority=1)
	public void HomePage()
	{
		System.out.println("HomePage");
		System.out.println("         ");
	}
	
	@Test(priority=0)
	public void LogiPage()
	{
		System.out.println("LogiPage");
	}
	
}
