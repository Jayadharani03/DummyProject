package TestNg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderMethod {
	
	@Test(dataProvider="storedata")
	public void getvalue(String a,String d)
	{
		System.out.println(""+a +" "+d);
	}
	
	@DataProvider
	public Object[][] storedata()
	{
		Object [][]data= new Object [3][2];
		data[0][0]="jaya@eam360.com";
		data[0][1]="123";
		data[1][0]="jaya07081998.com";
		data[1][1]="231";
		data[2][0]="jaya07081997.com";
		data[2][1]="231";
		return data;
		
	}
	

}
