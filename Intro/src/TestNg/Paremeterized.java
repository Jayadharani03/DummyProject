package TestNg;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paremeterized {
	
	@Parameters({"URL"})
	@Test
	public void M(String nsme)
	{
		System.out.println("M method will be print here");
		System.out.println(nsme);
	}

	
	public void N()
	{
		System.out.println("M method will be print here");
	}
	
	public void O()
	{
		System.out.println("M method will be print here");
	}
}
