package list;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Ordered 
{
	public static void main(String[] args) throws IOException 
	{
		String num="";
		LinkedList<String> al=new LinkedList<String>();
		Scanner sc=new Scanner(System.in);
		File f=new File("/home/bridgeit/JavaPrograms/list/src/list/data.txt");
		FileInputStream f1=new FileInputStream(f);
		
		int content;
		while((content=f1.read())!=-1)
		{
			
			num=num+(char)content;
			
		}
		
		  String []a =num.split("\\s");
	
	     for(int i=0;i<a.length;i++)
	     {
		   al.add(a[i]);
		   
		 }
	     
	     Iterator<String> itr1=al.iterator();
		   while (itr1.hasNext()) 
		   {
			   System.out.println(itr1.next());
			
		   }
		   System.out.println("\n\n");
		   
	 
		   
	     System.out.println("Enter the number");
	     String k=sc.next();
	     FileWriter f2=new FileWriter(f); 
	     if(al.contains(k))
	     {
	    	 
	    	 al.remove(k);
	    	 for(int i=0;i<al.size();i++)
	    	 {
	    	 f2.write(al.get(i)+" ");
	    	 f2.flush();
	    	 }
	    	 
	     }
	     else
	     {
	    	 
	    	 al.add(k);
	    	 Collections.sort(al);
	    	 for(int i=0;i<al.size();i++)
	    	 {
	    	 f2.write(al.get(i)+" ");
	    	 f2.flush();
	    	 }
	    	 
	     }
	     System.out.println(al);
	     System.out.println("\n\n");
	     Iterator<String> itr=al.iterator();
		 while (itr.hasNext()) 
		 {
			   System.out.println(itr.next());
			
		 }
	}

}
