package testpac;

import org.testng.Assert;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class YahooNewsTest {
	
	@BeforeTest
	public void testNews()
	{ 
		System.out.println("Before Executing  Yahoon news Test");
		//throw new SkipException("Skiping the test of some reasons");
		
		System.out.println("Before Assertin Error");
		try{
		
			Assert.assertEquals("Hallo", "Hano");
			}catch(Throwable t){
				System.out.println("After Assertin Error");
			}
		
		
	}
	@Test
	public void yahooNewsTest()
	{ 
		System.out.println(" Executing  Yahoon news Test");
	}
}
