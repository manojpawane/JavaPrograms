package stack;

import java.util.*;

public class Palindrome 
{
	public static void main(String[] args) 
	{   
		
		Scanner sc=new Scanner(System.in);
		LinkedList lst=new LinkedList();
		System.out.println("Enter the String: to check whether it is palindrome?");
		String str=sc.next();
		String str2="";

		   for(int i=0;i<str.length();i++)
		   {
			   char ch=str.charAt(i);
			   lst.add(ch);
			
		   }
		     Collections.reverse(lst);
		      
		      //System.out.println(lst);
		      
		for(int j=0;j<lst.size();j++)
		{
			 str2=str2+lst.get(j);
		}
		      
		//System.out.println(str);
//	System.out.println(str2);
	

	if(str.compareTo(str2)==0)
	{
		System.out.println("String is Palindrome...");
	}
	else
	{
		System.out.println("String is Not Palindrome...");
	}
}
}