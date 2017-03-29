import java.util.Scanner;
class LeapYear
{
	public static void main(String [] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the Year");
			int year=sc.nextInt();
			if(year>=1000&&year<=9999)
			{
				
                            if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
				{
				System.out.println(year+" is a Leap Year..!");
				
				}
				else
				{
					System.out.println(year+" Not a Leap Year...!");
				}
				


			}
				
			else
			{

				System.out.println("Enter Four digit Year");
			}

		}



}
