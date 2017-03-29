import java.util.Scanner;
public class HarmonicNumber
{
	public static void main(String [] args)
		{	Scanner sc=new Scanner(System.in);
			int k=1;
			double value=0;	
			System.out.println("Please Enter Nth Value:");
		
			int n=sc.nextInt();
			if(n!=0)
			{
				for(double i=1;i<=n;i++)
				{
					value=value+(1/i);
					System.out.println("h"+k+"\t"+value);
					k++;
				}
			

			}
			else
			{
			System.out.println("Entered Value is Invalid...!");

			}

		}


}
