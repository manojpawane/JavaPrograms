package collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkhashset 
{
	public static void main(String[] args) {
		
	
	System.out.println("Linkedhash set");
	Set<String> s2= new LinkedHashSet<String>();
	
	s2.add("java");
	s2.add("HTML");
	s2.add("Java script");			//insertion order
	s2.add("Android");
	System.out.println(s2);
	
	

	String s4="JavaDeveloper";
	
	Set set=new LinkedHashSet<>();
	for(int i=0;i<s4.length();i++)
	{
		set.add(s4.charAt(i));
	}
	System.out.println(set);
	
	}
}
