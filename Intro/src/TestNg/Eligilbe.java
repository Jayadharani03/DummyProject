package TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Eligilbe {
	@BeforeMethod
	public void method()
	{
		System.out.println("This is will excure only for test 1");
	}
	@Test
	public void salary()
	{
		System.out.println("salary");
	}

	
	@Test
	public void Exp()
	{
		System.out.println("experenice");
	}
	
	@AfterTest
	public void Test1()
	{
		System.out.println("This will exute last for test1");
	}

	
	@Test(groups= {"Smoke"})
	public void reg()
	{
		System.out.println("This is from Eligible class");
	}
	

}
