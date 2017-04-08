package stack;
import java.util.*;
public class VendingMachine 
{
	int n1000=0;
	int n500=0;
	int n100=0;
	int n50=0;
	int n10=0;
	int n5=0;
	int n2=0;
	int n1=0;
	
	public static void main(String[] args) 
	{	Scanner sc=new Scanner(System.in);
       
		System.out.println("Enter the Change Amount");
		
		int change=sc.nextInt();
		VendingMachine vm=new VendingMachine();
		if(change>1000)
		{
		vm.note1000(change);
		}
			else if(change>500)
			{
				vm.note500(change);
			}
		
			else if(change>100)
			{
				vm.note100(change);
			}
			
			else if(change>50)
			{
				vm.note50(change);
			}
			else if(change>10)
			{
				vm.note10(change);
			}
			else if(change>5)
			{
				vm.note5(change);
			}
			else if(change>2)
			{
				vm.note2(change);
			}
			else
			{
				vm.note1(change);
			}
		
		
        
		System.out.println("Rs. 1000 notes required:"+vm.n1000);
		System.out.println("Rs. 500 notes required:"+vm.n500);
		System.out.println("Rs. 100 notes required:"+vm.n100);
		System.out.println("Rs. 50 notes required:"+vm.n50);
		System.out.println("Rs. 10 notes required:"+vm.n10);
		System.out.println("Rs. 5  coin required:"+vm.n5);
		System.out.println("Rs. 2  coinrequired:"+vm.n2);
		System.out.println("Rs. 1 coin required:"+vm.n1);
		System.out.println();
		int n=vm.n1000+vm.n500+vm.n100+vm.n50+vm.n10+vm.n5+vm.n2+vm.n1;
		System.out.println("The Minimum Notes Required are:"+n);
	}
	
	
	void note1000(int chang)
	{
		n1000=chang/1000;
		chang=chang%1000;
		note500(chang);
	}
	
	void note500(int chang)
	{
		n500=chang/500;
		chang=chang%500;
		note100(chang);
	}
	
	void note100(int chang)
	{
		n100=chang/100;
		chang=chang%100;
		note50(chang);
	}
	
	void note50(int chang)
	{
		n50=chang/50;
		chang=chang%50;
		note10(chang);
	}
	
	void note10(int chang)
	{
		n10=chang/10;
		chang=chang%10;
		note5(chang);
	}
	
	void note5(int chang)
	{
		n5=chang/5;
		chang=chang%5;
		note2(chang);
	}
	
	void note2(int chang)
	{
		n2=chang/2;
		chang=chang%2;
		
	}
	
	void note1(int chang)
	{
		n1=chang/1;
		
		
	}
	
	
}
