import java.util.*;

public class TicTacToe
{
static int row;
static int col;
static int row1;
static int col1; 
static char [][] a=new char[3][3];
public static void main(String [] args)
{
	System.out.println("-----------------");
	
			
	System.out.println("Player 1 is Computer and Player 2 is User");
	
        int count=0;
        char m='.';
        
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        	a[i][j]=m;
        	
        	}
        
        }
	
	

	
			
	do
	{	
		user();

		if(a[row][col]=='.')
		{
			a[row][col]='X';
			count++;
			
			
		
		}
		else
		{
			System.out.println("Postion is already occupied, Please Choose New Postion");
			user();
		}

		comp();
	
		if(a[row1][col1]=='.')
		{
			a[row1][col1]='O';
			count++;
			
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+"\t");
				}
			 System.out.println();
			}

		}
		else
		{
			comp();
		}

	

	}
while(	/*a[0][0]!=a[1][0]!=a[2][0] ||
 	a[0][1]!=a[1][1]!=a[2][1] ||
  	a[0][2]!=a[1][2]!=a[2][2] ||
   	a[0][0]!=a[0][1]!=a[0][2] ||
    	a[1][0]!=a[1][1]!=a[1][2] ||
     	a[2][0]!=a[2][1]!=a[2][2] ||
      	a[0][0]!=a[1][1]!=a[2][2] ||
       	a[2][0]!=a[2][1]!=a[0][2] ||*/
        count<9);

        if(count==8)
        {
	System.out.println("Match Drawn...");
        }

   /*   else if(a[0][0]==a[1][0]==a[2][0] ||
	a[0][1]==a[1][1]==a[2][1] ||
	a[0][2]==a[1][2]==a[2][2] ||
	a[0][0]==a[0][1]==a[0][2] ||
	a[1][0]==a[1][1]==a[1][2] ||
   	a[2][0]==a[2][1]==a[2][2] ||
   	a[0][0]==a[1][1]==a[2][2] ||
       	a[2][0]==a[2][1]==a[0][2] )
	{
		System.out.println("You Won");
	
	}*/

	
	else
	{
		System.out.println("You Lost");
		
	}
}





	static void user()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value of ROW(0-2)");
	row=sc.nextInt();

	System.out.println("Enter the Value of COLOUMN(0-2)");
	col=sc.nextInt();
	

	}

	static void comp()
	{
	Scanner sc=new Scanner(System.in);
	Random r1=new Random();
	row1=r1.nextInt(3);
	col1=r1.nextInt(3);


	}

}
