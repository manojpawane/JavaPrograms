package collections;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeHashSet 
{
	public static void main(String[] args) 
	{
		Set s3=new TreeSet<>();
		System.out.println("Tree Hash Set");
		s3.add("java");
		s3.add("HTML");
		s3.add("Java script");
		s3.add("Android");
		System.out.println(s3);
		
											//Natural Ordering
		String s4="JavaDeveloper";
		
		Set set=new TreeSet<>();
		for(int i=0;i<s4.length();i++)
		{
			set.add(s4.charAt(i));
		}
		System.out.println(set);
		
		
	}

}
