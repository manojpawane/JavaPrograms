package stack;
import  java.util.*;
public class Expression 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		Stack s=new Stack();
		
		System.out.println("Enter the Expression:");
		
		String expression=sc.next();
		
		int size=expression.length();
		
		for(int i=0;i<size;i++)
		{
			char ch=expression.charAt(i);
			if(ch=='(')
			{
				s.push('(');
			}
			else if(ch==')')
			{
				s.pop();
			}
		}
		if(s.isEmpty())
		{
			System.out.println("Expression Balanced");
		}
		else
		{
			System.out.println("Expression Not Balanced");
		}
	}

}
