package utility;

import java.util.*;


public class Utility {
	public static void main(String[] args) {
		int ch = 0;
		char choice;
		// BubbleSort bs=new BubbleSort();
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1.Binary Search Method for Integer:");
			System.out.println("2.Binary Search Method for String");
			System.out.println("3.insertionSort method for integer");
			System.out.println("4.insertionSort method for String");
			System.out.println("5.bubbleSort method for integer");
			System.out.println("6.bubbleSort method for String");
			System.out.println("Please Enter your choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				binaryint();
				//System.out.println("The Element found at Postion:"+mid);
				break;

			case 2:
				System.out.println("Enter the size of Array:");
				int i = sc.nextInt();
				String[] binsr = new String[i];
				System.out.println("Enter the Words in Array");
				for (int s = 0; s < i; s++) {
					binsr[s] = sc.next();
				}
				binarystr(binsr,i);
				break;
			 case 3:Scanner p=new Scanner(System.in);
				 	System.out.println("Enter the Size of Array");
			 		int o=p.nextInt();
			 		int []y=new int[o];
			 		System.out.println("Enter The Numbers in array");
			 		for(int u=0;u<o;u++)
			 		{
			 			y[u]=p.nextInt();
			 		}
		            insertionint(y,o);
		            System.out.println("Array After Sorting");
			   	    for(int w=0;w<o;w++)
			   	   {		 
			   		 System.out.println(y[w]);
			   	   }
			         break;
			  case 4:Scanner in=new Scanner(System.in);
			  			
				     System.out.println("Please Enter The Size of Array");
			         int r=in.nextInt();
			         String []a=new String[r];
			         System.out.println("Enter the Elements of Array");
			         for(int e=0;e<r;e++)
			         {
			        	 a[e]=in.next();
			        	 
			         }
			         
				  
				        insertionstr(a,r);
				        System.out.println("Array After Sorting");
				   	    for(int w=0;w<r;w++)
				   	   {		 
				   		 System.out.println(a[w]);
				   	   }
			             break;
			case 5:
				System.out.println("Enter the Size of Array:");
				// Scanner sc=new Scanner(System.in);
				int n = sc.nextInt();
				int[] z = new int[n];
				System.out.println("Enter the Elements in Array:");
				for (int d = 0; d < n; d++) {
					z[d] = sc.nextInt();

				}

				bubbleint(z, n);
				System.out.println("After Sorting....");
				for (int f = 0; f < n; f++) {

					System.out.println(z[f]);
				}
				break;
			case 6:
				System.out.println("Enter the Size of Array:");
				int size = sc.nextInt();
				String[] arr2 = new String[size];
				System.out.println("Enter the Words in array");
				for (int g = 0; g < size; g++) {
					arr2[g] = sc.next();

				}
				bubblestr(arr2, size);

				for (int h = 0; h < size; h++) {
					System.out.println(arr2[h]);

				}
				break;

			}
			System.out.println("Do You want to continue...");
			 choice=sc.next().charAt(0);
			
		}
    while(choice!='N'|| choice!='n');
		sc.close();
	}

	static void binaryint() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int n = sc.nextInt();
		int[] arr = new int[10];
		System.out.println("Enter the Elements in Array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();

		}
		bubbleint(arr, n);
		int low = 0;
		int high = n;
		int mid = (low + high) / 2;
		for (int j = 0; j < n; j++)
			System.out.println(arr[j]);

		System.out.println("Enter the Number you need to search:");
		int m = sc.nextInt();

		while (low<=high) 
		{
			mid = (low + high) / 2;
			if(m==arr[mid])
			{
				System.out.println("The Number  is found at postion:" + (mid));
				return;
			}
			
			
			

		else if (m < arr[mid]) 
			{
				high = mid-1;
				
			}

			else 
			{

				low = mid+1;
				
			}

		}
		//sc.close();
		//return mid;
		//sc.close();
	System.out.println("No. Not present");
		return;

	}

	static void bubbleint(int[] arr1, int l) {

		BubbleSort b1 = new BubbleSort();
		b1.bubble(arr1, l);

	}

	static void bubblestr(String[] arrb2, int j) {
		for (int i = 0; i < j - 1; i++) {
			for (int k = 0; k < j - i - 1; k++) {
				if (arrb2[k].compareTo(arrb2[k + 1]) > 0) {
					String temp = arrb2[k];
					arrb2[k] = arrb2[k + 1];
					arrb2[k + 1] = temp;
				}

			}

		}

	}

	static void binarystr(String[] k, int j) {
		bubblestr(k, j);
		for (int w = 0; w < j; w++) {
			System.out.println(k[w]);
		}
		int low = 0;
		int high = k.length-1;
		int mid = (low + high) / 2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Word you want to Search:");
		String m = sc.next();
		// System.out.println(k[mid]);
		while (low <= high) {
			mid = (low + high) / 2;
			if (m.compareTo(k[mid]) == 0) {
				System.out.println("Word Found at Postion " + mid);
				return;

			} else if (m.compareTo(k[mid]) < 0) {
				high = mid-1;

			} else {
				low = mid+1;
				
			}
		}
		System.out.println("Word Not Found ");
		//sc.close();

	}
	
	
	
	static void insertionstr(String x[], int c)
	{
		InsertionSort ob=new InsertionSort();
		ob.sort( x,  c);
		
		
	}
	static void insertionint(int []a,int p)
	{
		for(int i=1;i<p;i++)
		 {		 
			 int data = a[i];
			 int hole = i;
			 while((hole>0) && data<a[hole-1])
			 {
				 a[hole]=a[hole-1];
				 hole--;			 
			 }
			 a[hole]=data;
			 
		 }
	}
	

}
