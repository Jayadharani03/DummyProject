package Inheritance;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class B1 {
	


	

	@Test
	public void Result()
	{
		int a=5;
		A1 p=new A1(a);
		System.out.println(	p.Add());
		System.out.println(p.Sub());
		
	}
	
	
	

	
	

}
