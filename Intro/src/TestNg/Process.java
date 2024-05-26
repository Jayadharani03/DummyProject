package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Process {
	
	@BeforeSuite
	public void suite()
	{
		System.out.println("I will be execute for both test and i will be first");
	}
	
	
	
	@Test
	public void  Transfer()
	{
		System.out.println("Transfer");
	}
	
	@BeforeTest
	public void first()
	{
		System.out.println("I will be exute first");
	}
	
	
	@AfterSuite
	public void suite1()
	{
		System.out.println("I will be execute for both test and i will be last");
	}
	
	
	@Test(groups= {"Smoke"})
	public void reg1()
	{
		System.out.println("This is from Process class");
	}
	

}
