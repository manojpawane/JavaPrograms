import java.util.*;
class Coupon
{
	public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of Coupons need to be generated:");
			int n=sc.nextInt();
			int j=0;
			int i=0;
			int k;			
			
			int [] arr=new int[n];

		for(k=0;j<n;k++)
		{
			int flag=0;
			Random cn=new Random();
			int x=cn.nextInt(n);

			for(i=0;i<j;i++)
			{
			
			    if(arr[i]==x)
				{
					flag=1;
					break;					

				}			     
							
			}	
		               if(flag==0)
				{     				
					arr[j]=x;
					j++;
				
				}
				
	}
	System.out.println("No. of Random Call:"+k);
	System.out.println("No. of code stored:"+j);
        for(int l=0;l<j;l++)
	{

		System.out.println(arr[l]);
	}
			
			
			 
		}


}
