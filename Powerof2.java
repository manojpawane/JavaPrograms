import java.util.Scanner;
public class Powerof2
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		int k=1;
		
		System.out.println("Please Enter the Nth Number:");
		int n=sc.nextInt();

		if(n>=0&&n<31)
		{
			System.out.println("Value of N"+"      Power of 2");
			for(int i=0;i<=n;i++)
			{
				
				System.out.print(i);
				for(int j=1;j<=i;j++)
				{
					k=k*2;

				}
					

					
				System.out.println("\t\t"+k);
				
		
				k=1;

			}

		}
		else
		{
		
			System.out.println("Invalid Nth Value...");	
		}		
	}
		


}
