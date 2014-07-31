package testpac;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class YahooTest {
	
	@BeforeSuite

	public void initilizeSelenium()
	{
		System.out.println("In the Very Beginging inizilize Selenium");
	}
	
	@AfterSuite

	public void shutDownSelenium()
	{
		System.out.println("In the End shuting Down Selenium");
	}
	
  @Test
  public void testRecievEmail() {
	  
	  System.out.println("test recieving  Email");
	  System.out.println("test recieving  Email 31.07.2014 Amin war dabei!!");
  }
  
  @Test
  public void testSendEmail() {
	  
	  System.out.println("test Sending  Email");
  }
  @BeforeMethod
  public void openBrowser() {
	  System.out.println("open Browser");
  }
 @AfterMethod
 public void closBrowser() {
	  System.out.println("close Browser");
 }
  @BeforeTest
  public void openConnection() {
	  System.out.println("Connecting to DB");
  }
  @AfterTest
  public void closeConnection() {
	  System.out.println("Closing Connecting");
  }
  
}
