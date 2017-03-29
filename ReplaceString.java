import java.util.Scanner;
class ReplaceString
{
	public static void main(String [] args)
		{       Scanner sc=new Scanner(System.in);
                        String name="Hello <<UserName>>, How are you?";
			System.out.println("Please Enter your name:");
			String username=sc.next();

                           if(username.length()>=3)
				{ 
				  name =name.replace("<<UserName>>",username);
				  System.out.println("After String Replacement:");
				  System.out.println(name);
				}
			   else
				{
				   System.out.println("Invalid String...!");
				}
				

























			 


		}


}
