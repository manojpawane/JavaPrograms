import java.util.Scanner;
class Primefactors
{
	public static void main(String [] args)
        {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to find prime factors:\n");
		int n=sc.nextInt();
		
		
	
		for(int i=2;i<n;i++)
		{
			//System.out.println("i: "+i);
			if(n%i==0)
				{
				int flag=0;
				for(int j=2;j<i;j++)
					{
                               // System.out.println("j: "+j);
						if(i%j==0)
						{
						flag=1;
						break;
						}
					//break;
					}
                            if(flag==0)
		            {
		          	 System.out.println(i);
		            }

			}
		}
	}
}
