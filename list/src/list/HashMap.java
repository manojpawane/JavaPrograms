package list;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.* ;
import java.util.Map ;

public class HashFunction
{
	public static void main(String[] args) throws IOException 
	{   String str="";
		int []arr=new int[10];
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
		System.out.println("Enter number of slots:");
		
	}
}