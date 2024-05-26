package Webdriverintro;

import java.util.Arrays;
import java.util.List;

public class Stringfunction {
	public static void main(String[] args) {
	
		
//This is a Java Language
		
		String s=new String("This is a java Language");
		String[] n=s.split(" ");
		String word="";
		for(int i=0;i<n.length;i++)
		{
			
		if((n[i].length())%2==0)
		{
			 word=n[i];
			 System.out.print(word+" ");
			 
		}
		
		
		
		
	//output: This is java Language
		
		}		
			
		
		
	}
}
	


