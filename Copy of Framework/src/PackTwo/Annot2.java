package PackTwo;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class Annot2 {

	@BeforeSuite
	public void installSoftware()
	{
		System.out.println("BeforeSuite -  installSoftware");
	}
	
	@AfterSuite
	public void deinstallSoftware()
	{
		System.out.println("AfterSuite -  deinstallSoftware");
	}
}
