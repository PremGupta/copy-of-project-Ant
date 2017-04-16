package PackTwo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestBaseClass {

	public WebDriver driver=null;
	
	@Test
	public void Login() throws IOException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Prem\\UFramework\\Framework\\src\\PackTwo\\datadriven.properties");
		prop.load(fis);
		
	
		//driver.findElement(By.xpath("")).sendKeys("");
		
	if (prop.getProperty("browser").contains("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Prem\\Downloads\\Study\\Selenium Files\\geckodriver.exe");

		driver=new FirefoxDriver();
	}
	
	else if (prop.getProperty("browser").contains("chrome"))
	{
		//System.setProperty("webdriver.chrome.driver", "");
		driver=new ChromeDriver();
	}
	
	else
	{
		//System.setProperty("webdriver.ie.driver", "");
		driver=new InternetExplorerDriver();
	}
	
	driver.get(prop.getProperty("url"));
	
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
	}
	
	@AfterSuite
	public void deinstallSoftware()
	{
		System.out.println("AfterSuite -  deinstallSoftware");
	}
}
