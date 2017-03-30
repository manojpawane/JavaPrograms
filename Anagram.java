import java.util.*;

class Anagram
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Please Enter first string:");

		String str1=sc.next();

		System.out.println("Please Enter Second string:");

		String str2=sc.next();

		 
    
                 
                 char[] chars = str1.toCharArray();
                 Arrays.sort(chars);
                 String str3 = new String(chars);
                 
		 char[] chars2 = str2.toCharArray();
                 Arrays.sort(chars2);
                 String str4 = new String(chars2);

		

		if(str3.equals(str4))
		{	
			System.out.println("Strings are Anagram");
		}
		else
		{
			
			System.out.println("Strings are not Anagram");
		}
    



		
	}



}
