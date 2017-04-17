import java.util.*;
public class FrogJump 
{
	
	public static void main(String[] args)
	{
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Height of Well");
		int heightofwell=scanner.nextInt();
		
		int steps=frogjump(heightofwell);
		System.out.println("No. of Steps frog take to reach to its destination:"+steps);
	}
	
	public static int frogjump(int heightofwell)
	{	int i=0;
		int step=0;
		for(i=0;i<heightofwell;i=i+5)
		{
			i--;
			step++;
			
		}
		return step;
		
	}

}
