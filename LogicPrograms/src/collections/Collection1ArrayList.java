package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class Collection1ArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList list=new ArrayList();
	
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of data you want in array list");
		int n=scanner.nextInt();
		System.out.println("Enter the data");
		
		for(int i=0;i<n;i++)
		{
	 		int data=scanner.nextInt();
			list.add(data);
		}
		System.out.println(list);
		
		System.out.println("Enter the Data at a specified location");
		int data=scanner.nextInt();
		System.out.println("Enter the specified location for an element");
		int index=scanner.nextInt();
		list.add(index, data);
		
		System.out.println(list);
		int last=list.lastIndexOf(list);
		System.out.println("firstlast : "+last);
		
		LinkedList llist=new LinkedList<>();
		llist.add("kangaroo");
		llist.add("zebra");
		llist.add("Eagle");
		llist.add("Ballon");
		
		list.addAll(llist);
		
		System.out.println(list);
		
		int lastindex=list.lastIndexOf(list);
		System.out.println("last : "+lastindex);
		
		HashSet hashset=new HashSet<>(list);
		Iterator itr=  hashset.iterator();
		while(itr.hasNext())
		{	
			System.out.println("via hash "+itr.next());
		}
		//hashset.HashSet();
		
		
		
	}

}
