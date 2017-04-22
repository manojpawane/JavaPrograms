
package com.bridgelabz.tester;

import java.util.Scanner;

import com.bridgelabz.controller.Controller;

public class Application {
	public static void main(String[] args) {
		int ch = 0;
		Controller controller = new Controller();
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Create Address Book");
			System.out.println("2.Add Person");
			System.out.println("3.Display");
			System.out.println("4.Search");
			System.out.println("5.Remove Contact");
			System.out.println("6.Update Contact");
			System.out.println("7.Sort by name");
			System.out.println("8.Sort by Zip");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				controller.createaddressbook();
				break;
			case 2:
				controller.addperson();
				break;
			case 3:
				controller.display();
				break;
			case 4:
				controller.search();
				break;
			case 5:
				controller.delete();
				break;
			case 6:
				controller.update();
				break;
			case 7:
				controller.sortbyname();
				break;
			case 8:
				controller.sortbyzip();
				break;

			}

		} while (ch != 9);

		// controller.addperson();

	}

}
