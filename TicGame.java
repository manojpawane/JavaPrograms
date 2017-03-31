import java.util.*;

public class TicGame
{
static int row;
static int count=0;
static int col;
static int data=0;
static int flag=0;
static int row1;
static int col1; 
static char [][] a=new char[3][3];
static boolean[][] b=new boolean[3][3];
public static void main(String [] args)
{
	System.out.println("-----------------");
	
			
	System.out.println("Player 1 is Computer and Player 2 is User");
	
        
        char m='.';
        
        for(int i=0;i<3;i++)
        {
        	for(int j=0;j<3;j++)
        	{
        	a[i][j]=m;
        	
        	}
        
        }
	
	

	
			
  	                  while((((a[0][0] !='X') && (a[1][0] !='X')&& (a[2][0]) !='X'))||
 	         		(((a[0][1] !='X') && (a[1][1] !='X')&& (a[2][1]) !='X'))||
  				(((a[0][2] !='X') && (a[1][2] !='X')&& (a[2][2]) !='X'))||
   				(((a[0][0] !='X') && (a[0][1] !='X')&& (a[0][2]) !='X'))||
    				(((a[1][0] !='X') && (a[1][1] !='X')&& (a[1][2]) !='X'))||
     				(((a[2][0] !='X') && (a[2][1] !='X')&& (a[2][2]) !='X'))||
      				(((a[0][0] !='X') && (a[1][1] !='X')&& (a[2][2]) !='X'))||
       				(((a[2][0] !='X') && (a[2][1] !='X')&& (a[0][2]) !='X'))||
       				(((a[0][0] !='O') && (a[1][0] !='O')&& (a[2][0]) !='O'))||
 	         		(((a[0][1] !='O') && (a[1][1] !='O')&& (a[2][1]) !='O'))||
  				(((a[0][2] !='O') && (a[1][2] !='O')&& (a[2][2]) !='O'))||
   				(((a[0][0] !='O') && (a[0][1] !='O')&& (a[0][2]) !='O'))||
    				(((a[1][0] !='O') && (a[1][1] !='O')&& (a[1][2]) !='O'))||
     				(((a[2][0] !='O') && (a[2][1] !='O')&& (a[2][2]) !='O'))||
      				(((a[0][0] !='O') && (a[1][1] !='O')&& (a[2][2]) !='O'))||
       				(((a[2][0] !='O') && (a[2][1] !='O')&& (a[0][2]) !='O'))|| count<10)
       				
       				
       				
      

	{	
		

		comp();
		
			
		System.out.print("Count is..."+count+"\n\n");
                       for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					System.out.print(a[i][j]+"\t");
					
				}
			 System.out.println();
			}
			
			
			
			if(count<9)
			{
			user();
			
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
			    System.out.println("><><><><>GAME OVER><><<><><");
			    if( (((a[0][0] =='X') && (a[1][0] =='X')&& (a[2][0]) =='X'))||
 	         		(((a[0][1] =='X') && (a[1][1] =='X')&& (a[2][1]) =='X'))||
  				(((a[0][2] =='X') && (a[1][2] =='X')&& (a[2][2]) =='X'))||
   				(((a[0][0] =='X') && (a[0][1] =='X')&& (a[0][2]) =='X'))||
    				(((a[1][0] =='X') && (a[1][1] =='X')&& (a[1][2]) =='X'))||
     				(((a[2][0] =='X') && (a[2][1] =='X')&& (a[2][2]) =='X'))||
      				(((a[0][0] =='X') && (a[1][1] =='X')&& (a[2][2]) =='X'))||
       				(((a[2][0] =='X') && (a[2][1] =='X')&& (a[0][2]) =='X')))
        			{
       				 System.out.println("You Win...");
      				}
        
        
      		       else if( (((a[0][0] =='O') && (a[1][0] =='O')&& (a[2][0]) =='O'))||
 	         		(((a[0][1] =='O') && (a[1][1] =='O')&& (a[2][1]) =='O'))||
  				(((a[0][2] =='O') && (a[1][2] =='O')&& (a[2][2]) =='O'))||
   				(((a[0][0] =='O') && (a[0][1] =='O')&& (a[0][2]) =='O'))||
    				(((a[1][0] =='O') && (a[1][1] =='O')&& (a[1][2]) =='O'))||
     				(((a[2][0] =='O') && (a[2][1] =='O')&& (a[2][2]) =='O'))||
      				(((a[0][0] =='O') && (a[1][1] =='O')&& (a[2][2]) =='O'))||
       				(((a[2][0] =='O') && (a[2][1] =='O')&& (a[0][2]) =='O')))
      			 	{
      			 	  System.out.println("You Loose...");
     				}
        
     				else
       				{
       
       				System.out.println("Match Drawn....");
       				}
        

			
				
			  	 for(int i=0;i<3;i++)
				{
					for(int j=0;j<3;j++)
					{
					System.out.print(a[i][j]+"\t");
					//System.out.print(b[i][j]+"\t");
					
				}
				System.out.println();
				
			}
			return;
			}

	}
	

		


	

System.out.println("End of Loop");
}




	static void user()
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the Value of ROW(0-2)");
	row=sc.nextInt();
	

	System.out.println("Enter the Value of COLOUMN(0-2)");
	col=sc.nextInt();
	flag=0;
	
		while(a[row][col]!='X'&& a[row][col]!='O')
		{
			//System.out.println("*************\n\n");
			
			a[row][col]='X';
			b[row][col]=true;
			//System.out.println("Count*********"+count);
			count++;
			flag=1;
			break;
				
		}
		
		if(flag==0)
		{
		System.out.println("Postion already occupied please Enter another Postion...");
		user();
	
		}
			
		

	}

	static void comp()
	{
	//Scanner sc=new Scanner(System.in);
	Random r1=new Random();
	row1=r1.nextInt(3);
	col1=r1.nextInt(3);
	data=0;
	
	while(a[row1][col1]!='O'&& a[row1][col1]!='X')
		{
		//System.out.println("***********");
	                a[row1][col1]='O';
	                b[row1][col1]=false;
	                //System.out.println("Count Computer*********"+count);
			
			count++;	
			data=1;
			break;
		}
			if(data==0)
			{
			
			comp();
	
			}
		

	}

}
