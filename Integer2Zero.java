import java.util.Scanner;
class Integer2Zero
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter The size of Array:");
		int n=sc.nextInt();
		
		int [] arr=new int[n];
                int count=0;

		System.out.println("Enter the elements in array:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}

	


		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				for(int l=0;l<n;l++)
				{
					if(arr[j]+arr[k]+arr[l]==0)
					{
						System.out.println("Sum of "+arr[j]+" "+arr[k]+" "+arr[l]+"is Equal to Zero" );
						count++;
					}
				}
			}

		}
		System.out.println("The no of distinct varaible:"+count);
	}
}
