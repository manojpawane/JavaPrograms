package stack;

import java.util.*;

public class BankingCashCounter {
	String name = "";
	int acc_no = 0;
	double salary ;
	int i = 0;
	Queue q = new LinkedList();
	Bank s[] = new Bank[10];
	double Bank_balance = 100000;

	public static void main(String[] args) {
		
		BankingCashCounter b1=new BankingCashCounter();
		b1.utility();
		// Bank b1=new Bank();


	}

	 void deposit() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		name = sc.next();

		System.out.println("Enter your Account No.");
		acc_no = sc.nextInt();

		System.out.println("Enter your Balance");
		salary = sc.nextDouble();

		System.out.println("Enter the Amount you have to deposit:");
		double sal = sc.nextDouble();
		salary = sal + salary;
		Bank_balance = sal + Bank_balance;

		s[i] = new Bank(acc_no, name, salary);

		q.add(s[i]);
		i++;


	}

	 void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		name = sc.next();

		System.out.println("Enter your Account No.");
		acc_no = sc.nextInt();

		System.out.println("Enter your Balance");
		salary = sc.nextDouble();
		System.out.println("Enter the Amount you have to withdraw:");
		double sal = sc.nextDouble();
		if(sal<salary && sal<Bank_balance)
		{
		
			salary = salary - sal;
			Bank_balance =Bank_balance - sal;

		s[i] = new Bank(acc_no, name, salary);

		q.add(s[i]);
		i++;

		}
		
		//	System.out.println("No sufficient balance");

		

	}

	 void remove() {
		q.remove();
	}
void utility()
{

	int ch = 0;
 Scanner sc=new Scanner(System.in);
	System.out.println();
	do {

		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");

		System.out.println("3. Remove");

		System.out.println("4. Check Balance with Bank");
		System.out.println("5. Display");
		ch = sc.nextInt();

		switch (ch) {
		case 1:
			deposit();

			break;
		case 2:
			withdraw();

			break;
		case 3:
			remove();
			break;

		case 4:
			System.out.println("Total Cash:" + Bank_balance);
			break;
		case 5:
			System.out.println("Account No.   " + " Name   " + "\t\tBalance ");

				System.out.println(q);
			/*// {
			// System.out.println(acc_no+" "+name+" "+balance);
			// }
*/			break;
		default:return;
				
		}

	} while (ch != 6);	



}
}

class Bank 
{
	 int acc_no;
	 String name;
	 double balance;
     double salary;
	 Bank(int Acc_no, String Name, double Balance) 
	 {
		acc_no = Acc_no;
		name = Name;
		balance = Balance;
		
     }

	public String toString() 
	{
		return acc_no + "\t\t" + name + "\t\t" + balance;

	}

}
