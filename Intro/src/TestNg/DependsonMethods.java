package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DependsonMethods {
	
	@Test
	public void Z()
	{
	
		System.out.println("It printing the Z method");
	}

	@Test(dependsOnMethods= {"Z","Y"})
	public void A()
	{
	
		System.out.println("It printing the A method");
	}
	
	@Test(enabled=true)
	public void B()
	{
	
		System.out.println("It printing the B method");
	}
	@Test
	public void Y()
	{
	
		System.out.println("It printing the Y method");
	}
	
	@Parameters({"URL"})
	@Test
	public void C(String nsme)
	{
		System.out.println("C method will be print here");
		System.out.println(nsme);
	}
}

