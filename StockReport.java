import java.util.*;
class Report
{
	String stock_name;
	double no_of_shares;
	double share_price;
	double total_val_of_each_stock;
	double [] a=new double[10];
	
	
	Report(String sname, double nshares, double sprice)
	{
	stock_name=sname;
	no_of_shares=nshares;
	share_price=sprice;
	total_val_of_each_stock=nshares*sprice;	
	
	}
	
	

	public String toString()
	{
	return stock_name+"\t\t"+no_of_shares+"\t\t"+share_price+"\t\t"+total_val_of_each_stock;
	
	}
	
}


public class StockReport
{
	public static void main(String [] args)
	{
	
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the No. of Records:");
	int n=sc.nextInt();
	Report [] sr=new Report[10];
	double [] a=new double[10];
	
	
	
	for(int i=0;i<n;i++)
	{
	        System.out.println("Enter the Name of Share:");
		String ssname=sc.next();
		
		System.out.println("Enter the Number of Share:");
		double nnshare=sc.nextDouble();
		
		System.out.print("Enter the price of Shares");
		double ppshare=sc.nextDouble();
		
		sr[i]=new Report(ssname,nnshare,ppshare);
		
		a[i]=nnshare*ppshare;
	
	
	
	}
	
	System.out.println("Share Name   "+"No. of Share   "+"Cost of Share   "+"Tot Amt Share   ");
	
	for(int i=0;i<n;i++)
	{
	
	System.out.println(sr[i]);
	}
	
	for(int i=0;i<=n;i++)
	{
	
	a[i+1]=a[i]+a[i+1];
	
	}
	System.out.println("Total Value of All Stock is:"+a[n]);
	
	
	
	
	
	}


} 
