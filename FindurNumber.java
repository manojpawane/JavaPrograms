import java.util.Scanner;
public class FindurNumber
{
int [] arr={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
int low=0;
int high=15;
//void binary(int  , int );


public static void main(String [] args)
	{	
	 //int n=Integer.parseInt(args[0]);
	 	 
	 binary(0,15);
	
	}
	static void binary(int low,int high)
	{
	
	int mid=(low+high)/2;
	Scanner sc=new Scanner(System.in);
	while(low<high)
	{
		if(high==low+1)
		{
		System.out.println("Your Number is:"+(low));
		return;	
		
		}
		
		System.out.println("Do Number is Less than  "+mid);
		boolean ans=sc.nextBoolean();
		
	



			if(ans==true)
			{
		 	  binary(low, mid-1);
			}
		
			else
			{
		 
		 	binary(mid+1, high);
			}	
		
	
	}
	}




}

