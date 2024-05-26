package TestNg;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Verification {
	
	
	@Test
	public void Idchecl()
	{
		System.out.println("Id Check");
	}
	
	@BeforeTest
	public void test2()
	{
		System.out.println("This will exute first for test 2");
	}
	
	@Test(groups= {"Smoke"})
	public void reg2()
	{
		System.out.println("This is from Verification class");
	}

}
