package collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Linkedlist 
{
	public static void main(String[] args) 
	{
		Scanner scanner=new Scanner(System.in);
		LinkedList list=new LinkedList();
		
		list.add("bheem");
		list.add("raju");
		list.add("chutki");
		list.add("nobita");
		list.add("doraemon");
		
		list.add("sezuka");
		list.addFirst("kenichi");
		list.addLast("senjo");
		
		Iterator itr5=list.iterator();
		while(itr5.hasNext())
		{
			
			System.out.println(itr5.next());
		}
		System.out.println();
		int a=list.size();
		System.out.println("The size of the List is "+a);
		
		System.out.println();
		Iterator itr3=list.iterator();
		while(itr3.hasNext())
		{
			
			System.out.println(itr3.next());
		}
		
		System.out.println("Enter the elements you need to search");
		String present=scanner.next();
		
		boolean b=list.contains(present);
		
		if(b==true)
		{
			System.out.println();
			System.out.println("Element present");
		}
		else
		{
			System.out.println();
			System.out.println("Element not present");
		}
		System.out.println();
		Iterator itr1=list.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		System.out.println();
		System.out.println("Enter the element you want to delete");
		String delete=scanner.next();
		
		if(list.contains(delete))
		{
			list.remove(delete);
		}
		else
		{
			System.out.println();
			System.out.println("Element not present");
		}
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println();
			System.out.println(itr.next());
		}
		
		Object firstelement=list.getFirst();
		System.out.println();
		System.out.println("The first element present in the list is:"+firstelement);
		
		Object lastelement=list.getLast();
		System.out.println();
		System.out.println("The last element present in the list is:"+lastelement);
		System.out.println();
		System.out.println("Enter the string to find the location:");
		String firstlocation=scanner.next();
		
		int firstindex=list.indexOf(firstlocation);
		
		System.out.println("The location of the "+firstlocation+"is"+firstindex);
		
		
		Iterator itr2=list.iterator();
		while(itr2.hasNext())
		{
			
			System.out.println(itr2.next());
		}
		System.out.println("Enter the string to find the last location:");
		String lastlocation=scanner.next();
		
		int lastindex=list.indexOf(lastlocation);
		
		System.out.println("The location of the "+lastlocation+"is"+lastindex);
		
		System.out.println();
System.out.println("Thank you done with Linked list");		
	}

}
