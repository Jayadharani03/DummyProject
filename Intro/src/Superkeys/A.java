package Superkeys;

import org.testng.annotations.Test;

public class A {
	
	@Test
	public void  execute()
	{
		B b=new B(3);
		
		System.out.println(b.multiple());
		System.out.println(b.add());
		
	}

}
