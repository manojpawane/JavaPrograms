package stack;
import java.util.*;
public class VendingMachine 
{
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
	int []arr={1000, 500, 100, 50, 10, 5, 2, 1};
		System.out.println("Enter the Change Amount");
		
		int change=sc.nextInt();
		VendingMachine vm=new VendingMachine();
		int k=vm.note1000(arr);
		
	}
	
	int note1000(int []a)
	{ for(int i=0;i<a.length;i++)
	   {
		if(a[i])
	   }
	   return 0;
	}

}
