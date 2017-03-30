import java.util.Scanner;
class Gambler
{
	public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			double win=0;
			double loss=0;
			double count=0;
			int prize=0;

			System.out.println("Enter the Stake:");
			int stake=sc.nextInt();
			
			System.out.println("Enter the No. of Times you want to Bet:");
			int bet=sc.nextInt();

			System.out.println("Enter the Goal Amount:");
			int goal=sc.nextInt();
			
			while(count<bet && stake<goal && stake!=0)
			{

				double gamble=Math.random();

				if(gamble>0.5)
				{
					win++;
					stake=stake+2;
					count++;


				}
				else
				{
					loss++;
					stake=stake-1;
					count++;

				}

                         			
			}
			double winpercent=(win/count)*100;
			double losspercent=(loss/count*100);

			System.out.println("No of Times Gambler Won:"+win);
			System.out.println("No of Times Gambler loss:"+loss);
			System.out.println("Percentage of Winning:"+winpercent);
			System.out.println("Percentage of Lossing:"+losspercent);
			System.out.println("Stake:"+stake);
			
			System.out.println("Goal:"+goal);
		}
	
		

}
