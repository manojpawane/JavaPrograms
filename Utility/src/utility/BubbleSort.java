package utility;
import java.util.*;

public class BubbleSort

{
	
	public static void main(String[] args) 
	{
		System.out.println("Enter the Size of Array:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int []a=new int[n];
		System.out.println("Enter the Elements in Array:");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		bubble(a,n);
		System.out.println("After Sorting....");
		for(int i=0;i<n;i++)
		{
			
			System.out.println(a[i]);
		}
		
	}
public  static void bubble(int []k ,int l)
	{
	int temp;
	for(int i=0;i<l-1;i++)
	{
		
		for(int j=0;j<l-i-1;j++)
		{
			if(k[j]>k[j+1])
			{
				temp=k[j];
				k[j]=k[j+1];
				k[j+1]=temp;
				
			}
			 
			
			
		}
	}
		
		
		
	}

}
