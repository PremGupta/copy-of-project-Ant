package testngFiles2;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

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
	
	@Test
	public void NewTestForJenkin()
	{
		System.out.println("New Test For Jenkin");
	}
	
	@Test
	public void CodechangecheckJenkin()
	{
		System.out.println("Code change check in Jenkin");
	}
}
