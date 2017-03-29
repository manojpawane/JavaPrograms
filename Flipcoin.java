import java.util.Scanner;
public class Flipcoin
{
	public static void main(String [] args)
		{
			//double count=0;
			double head=0;
			double tail=0;
			double tailper=0;
			double headper=0;
 
		        Scanner sc=new Scanner(System.in);
			
			System.out.println("How many time do you want to flip a coin?");
			int coin=sc.nextInt();
			
			if(coin>0)
			{
			for(int i=0;i<coin;i++)
			{
			   double randomvalue=Math.random();
			   if(randomvalue<0.5)
				{
					System.out.println("You Tossed a Tails!");
					tail++;
					//count++;
					
				}
			   else
				{
					System.out.println("You Tossed a Head!");
					head++;
					//count++;				
				}
			


			}
			tailper=(tail/coin)*100;
			headper=(head/coin)*100;

			System.out.println("Percentage of Tails:"+(int)tailper+"%");
			System.out.println("Percentage of Heads:"+(int)headper+"%");
			

			}
			else
			{
				System.out.println("please Enter postive value...");


			}
		 

		}
}
