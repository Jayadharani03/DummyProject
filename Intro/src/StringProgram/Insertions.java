package StringProgram;

public class Insertions {
	
	public static void A(){

		String orginal="Geeksgeeks";
		String orginal2="for";
		for(int i=0;i<orginal.length();i++)
		{
			
			if(i==5)
			{
				for(int j=0;j<orginal2.length();j++)
				{
					System.out.print(orginal2.charAt(j));
				}
				
			}
		System.out.print(orginal.charAt(i));
		}
				
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Input: Geeksgeeks
		A();
		
		
	
			
			
			
			
			
		}
		

	}


