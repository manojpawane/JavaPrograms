package list;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.* ;

public class HashFunction
{
	public static void main(String[] args) throws IOException 
	{   String str="";
		HashFunction hf=new HashFunction();
		HashMap<Integer,LinkedList<Integer>> Map1 = new HashMap<Integer, LinkedList<Integer>>();
		
		Scanner sc=new Scanner(System.in);
		File f=new File("/home/bridgeit/JavaPrograms/list/src/list/hash.txt");
		FileInputStream hash=new FileInputStream(f);
		
		int content=0;
		while((content=hash.read())!=-1)
        {
			str=str+(char)content;
			
		}
		
		String []a=str.split("\\s");
		int []results=new int[a.length];
			
		for(int i=0;i<a.length;i++)
		{
			 results[i] =  Integer.parseInt(a[i]);
		}
		//System.out.println("Enter number of slots:");
		//int slot=sc.nextInt();
		int slot=10;
		
		LinkedList<Integer>[] list=new LinkedList[slot];
		for(int i=0;i<10;i++)
		{
			list[i]=new LinkedList<Integer>();
			Map1.put(i, list[i]);
		}
		
		for(int i=0;i<results.length;i++)
		{
			slot=results[i]%11;
		
			
		/*	if(list[slot]==null)
			{
				list[slot]=new LinkedList<Integer>();
				Map1.put(slot, list[slot]);
			}*/
			
			list[slot].add(results[i]);
			
		}
		System.out.println("Hash Map:"+Map1);
		
		
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		
		int k=num%11;
		
		if(list[k].contains(num))
		{
			list[k].removeFirstOccurrence(num);
			
		}
		else
		{
			/*if(list[k]==null)
			{
				list[k]=new LinkedList<Integer>();
				Map1.put(k, list[k]);
			}*/
			
			
			list[k].add(num);
		}
		
		
		
		System.out.println("Hash Map:"+Map1);
		File f2=new File("/home/bridgeit/JavaPrograms/list/src/list/HashOutput.txt");
		
		FileWriter writer = new FileWriter(f2);
		for (int i = 0; i < Map1.size(); i++) 
		{
			writer.write(Map1.get(i) + " ");
			writer.flush();
		}
		 
    	
		
		//System.out.println("Hashmap2: " + Map1);
}
		
	
	
	
	
}