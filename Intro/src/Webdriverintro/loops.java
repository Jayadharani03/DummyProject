package Webdriverintro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class loops {

	public static void main(String[] args) {
		String s="Learning Skills";
		System.out.println(s);
		
		int[] arr1= {1,2,3,4,5};
		
		
		int[] arr2=new int[8];
		arr2[0]=7;
		arr2[1]=8;
		arr2[2]=4;
		arr2[4]=9;
		
		
		for (int i=0;i<arr2.length;i++)
		{
			//System.out.println(arr2[i]);
		}
		
		for(int a:arr2)
		{
			//System.out.println(a);
		}
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Jaya");
		a.add("studies inprogress");
		for(int j=0;j<a.size();j++)
		{
		//System.out.println(a.get(j));
		//System.out.println(a.contains("Studies"));
				}
		
		for(String val:a)
		{
			//System.out.println(val);
		}
		
		
		String[] b= {"Jaya", "Learning","Selenium","Udemy"};
		List Convert=Arrays.asList(b);
		//System.out.println(Convert.get(1));
		
		String c="Jaya learning skills in Progress";
		String[] splittedarray=c.split(" ");
		System.out.println(splittedarray[0]);
		System.out.println(splittedarray[1].trim());
		System.out.println(splittedarray[2]);
		
		for(int k=0;k<c.length();k++)
		{
			System.out.println(c.charAt(k));
			
		}
		
		
		
		
	}

}
