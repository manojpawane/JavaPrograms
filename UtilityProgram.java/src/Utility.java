import package InsertionSort;
import java.util.*;
public class Utility 
{
	public static void main(String[] args) 
	{
		int ch;
		char choice;
		BubbleSort bs=new BubbleSort();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("1.Binary Search Method for Integer:");
			System.out.println("2.Binary Search Method for String");
			System.out.println("3.insertionSort method for integer");
			System.out.println("4.insertionSort method for String");
			System.out.println("5.bubbleSort method for integer");
			System.out.println("6.bubbleSort method for String");
			System.out.println("Please Enter your choice");
			
			switch(ch)
			{
			case 1:binaryint();
				   break;
			
			case 2:binarystr();
				   break;
			case 3:insertionint();
					break;
			case 4:insertionstr();
					break;
			case 5:bubbleint();
					break;
			case 6:bubblestr();
					break;
			
			
			
			
			}
			
			System.out.println("Do you want to Continue:Y or N");
			choice =sc.next().charAt(0);
		}
		while(choice=='Y' || choice =='y');
		
	}
	
	static void binaryint()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n=sc.nextInt();
		int []arr=new int[10];
		System.out.println("Enter the Elements in Array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			
			
		}
		bubble(arr,n);
		int low=0;
		int high=n-1;
		int mid=(low+high)/2;
		
		System.out.println("Enter the Number you need to search:");
		int m=sc.nextInt();
		
		while(m!=arr[mid])
		{
			
			if(m<arr[mid])
			{
			high=mid;
			mid=(low+high)/2;
			}
			
			else
			{
				
				low=mid;
				mid=(low+high)/2;
			}
		
		}
		System.out.println("The Number  is found at postion:"+mid);
		
		
		
	}
	
	static void bubbleint(int arr1, int l)
	{
		
		
		
	}

}
