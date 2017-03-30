import java.util.*;
import java.io.*;
class Array2d
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
                PrintWriter pw=new PrintWriter(System.out);
		

		System.out.println("Enter the size of row:");
		int row=sc.nextInt();
	
		System.out.println("Enter the size of column:");
		int column=sc.nextInt();

		Object [][] arr=new Object[row][column];

		System.out.println("Enter the elements:");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					arr[i][j]=sc.next();	
				}
				
			}
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					
					pw.print(arr[i][j]+" ");
					
				}
			pw.println();
				
			}
		pw.flush();
		pw.close();

		
	}

}
