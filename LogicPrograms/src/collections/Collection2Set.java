package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Collection2Set 
{
	public static void main(String[] args) 
	{
		Set s1=new HashSet();
		
		System.out.println("Hash Set");
		s1.add("java");
		s1.add("HTML");
		s1.add("Java script");
		s1.add("Android");				//Any Order
		System.out.println(s1);
		

		

		
		
		String s4="JavaDeveloper";
		
		Set set=new HashSet<>();
		for(int i=0;i<s4.length();i++)
		{
			set.add(s4.charAt(i));
		}
		System.out.println(set);
		
	}

}
