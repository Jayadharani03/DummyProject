package Inheritance;

import org.testng.annotations.Test;

public class A1 {
	
	int a;
	public A1(int a) {
		this.a=a;
	}

	@Test
	public int Add()
	{
		 this.a=a+1;		
		return a;
	}
	
	@Test
	public int Sub()
	{
		this.a=a-1;		
		return a;
	}
	
	
	


}
