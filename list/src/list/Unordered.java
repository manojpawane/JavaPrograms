package list;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Unordered 
{
	public static void main(String[] args) throws IOException 
	{
		String str="";
	//	int flag=0;
		 LinkedList<String> al=new LinkedList<String>(); 
		
		Scanner sc=new Scanner(System.in);
		File f=new File("/home/bridgeit/JavaPrograms/list/src/list/text.txt");
		FileInputStream f1=new FileInputStream(f);
		int content;
		while((content=f1.read())!=-1)
		{
			 str=str+(char)content;
			 
		}
		String []a=str.split("\\s");
		for(int i=0;i<a.length;i++)
		{
			al.add(a[i]);
			
		}		  
		
		   Iterator<String> itr1=al.iterator();  
		   while(itr1.hasNext())
		   {  
		   System.out.println(itr1.next());
		   }
		   System.out.println("\n");
		   System.out.println("Enter the Word");
		   String str1=sc.next();
		   FileWriter f2=new FileWriter(f);
		   if(al.contains(str1))
		   {
			   al.remove(str1);
			   for(int j=0;j<al.size();j++)
			   {
				   f2.write(al.get(j)+"");
				   f2.flush();
			   }
//			   System.out.println(al);
			   //return;
		   }
		   else
		   {
			   al.add(str1);
			  // System.out.println(al);
			   //return;
                for(int j=0;j<al.size();j++)
                {
				   f2.write(al.get(j)+" ");
				   f2.flush();
                }
		   }
		   
		   System.out.println(al);
		   System.out.println("\n\n");
	       Iterator<String> itr2 = al.iterator();
		   while (itr2.hasNext()) {
			   System.out.println(itr2.next());
			
		}
		   
		   
		   
	}
	
}