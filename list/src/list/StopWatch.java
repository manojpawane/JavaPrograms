package list;
import java.util.*;
public class StopWatch 
{
	long starttime, stoptime, elapsedtime;
	public long start()
	{
		starttime=System.currentTimeMillis();
		return starttime;
	}
	
	
	public long stop()
	{
		stoptime=System.currentTimeMillis();
		return stoptime;
	}
	
	public void elapsedtime() 
	{
		elapsedtime=stoptime-starttime;
		System.out.println(+elapsedtime/1000+" seconds");
		//return elapsedtime;
		
	}
	public static void main(String[] args) 
	{
		Date date=new Date();
		StopWatch stopwatch=new StopWatch();
		Scanner sc=new Scanner(System.in);
		System.out.println("Press 1 for start");
		int start=sc.nextInt();
		
		
	//	int stop=sc.nextInt();
		
		if(start==1)
		{
			stopwatch.start();
			
			
		}
		System.out.println("Press 2 for stop");
		int stop=sc.nextInt();
		if(stop==2)
		{
			stopwatch.stop();
			stopwatch.elapsedtime();
			
		}
		
		
		
	}
	

}
