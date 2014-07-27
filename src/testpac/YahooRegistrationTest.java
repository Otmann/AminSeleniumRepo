package testpac;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class YahooRegistrationTest {
	
	@Test(dataProvider="registerDate")
		
	public void testRegister(String name , String pwd ,String Email , String City)
	{
		System.out.println(name +"----"+ pwd + "---" +Email +"---" + City );
	}
	
	@DataProvider
	
	public Object [] [] registerDate()
	{
		
		Object [] [] data = new Object [3][4];
		// 3= Rownumber times test has tio be repeated
		// 4= Column parameter in data: name,email.city...
		
		// First Row
		data[0][0] = "user1";
		data[0][1] = "pass1";
		data[0][2] = "email1";
		data[0][3] = "city1";	
		
		// Second Row
		data[1][0] = "user2";
		data[1][1] = "pass2";
		data[1][2] = "email2";
		data[1][3] = "city2";	
					
		// Third Row
		data[2][0] = "user3";
		data[2][1] = "pass3";
		data[2][2] = "email3";
		data[2][3] = "city3";	
		
		return data;
		
	}

}
