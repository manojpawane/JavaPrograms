package stack;


import java.util.LinkedList;
import java.util.Scanner;

public class pali {

	/**
	* @param args
	*/
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any string.");
		String userInput = scan.next();
		
		for(int i=0;i<userInput.length(); i++){
			char ch = userInput.charAt(i);
			
			list.add(ch);
//			list.get(0);
		}

	}

}