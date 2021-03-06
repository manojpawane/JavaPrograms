import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;


public class BinaryWord {
	public static void main(String[] args) throws IOException 
	 {  
	   Scanner sc = new Scanner(System.in); 	
	  
	    File f = new File("/home/bridgeit/JavaPrograms/text.txt");		
		FileInputStream fis = new FileInputStream(f);
		
		String str = "";        
        int content;
        while ((content = fis.read()) != -1)
        {
        	//System.out.println(content);
               // convert to char and display it
               str += (char) content;
        }
	   
	   System.out.println(str);
	   System.out.println("..............Creation of Array..............");

	   String[] strArray = str.split(",");
	   for(String s :strArray)
	   {
		   System.out.println(s);
	   }
	   System.out.println("............After Sorting...............");
	   
	   Arrays.sort(strArray);
	   for(String s:strArray)
	   {
		   System.out.println(s);
	   }

	   System.out.println("Which word you have to search.");
	   String word = sc.next();

	  	int result = binarySearch(strArray, word);
		if(result==-1)
			System.out.println("Not found");
		else
			System.out.println("Your searched word is at index "+result);
		fis.close();
		sc.close();
	 }

	  public static int binarySearch(String array[], String value)
	  {
	      int first = 0;
	      int last = array.length - 1;
	  	
			while(first < last)
			{
				int mid = first + (last - first)/2;
				if(value.compareTo(array[mid])==0)
					return mid;
				
			        if(value.compareTo(array[mid])<0)
					last = mid-1; 
			        else
			          first = mid+1;
			 }
		     return -1;
			
	   }

}