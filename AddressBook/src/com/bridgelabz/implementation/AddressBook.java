package com.bridgelabz.implementation;

import java.util.*;
import java.util.Map.Entry;

import com.bridgelabz.model.Person;
import com.bridgelabz.service.Service;

import java.io.File;

public class AddressBook implements Service {
	int i = 0;
	List<Person> list = new LinkedList<Person>();
	Map<String, List<Person>> map = new HashMap<String, List<Person>>();

	String[] addressbook = new String[10];

	Person person;
	Scanner scanner = new Scanner(System.in);
	String value = "";
	// LinkedList key=new LinkedList();
	static String key = "";

	@Override

	public void addperson() {
		if (i == 0) {
			System.out.println("There is No Address Book Present, Do you want to create than press 1...! ");
			int press = scanner.nextInt();

			if (press == 1) {
				createaddressbook();

			} else {
				return;
			}

		} else {

			for (int select = 0; select < i; select++) {
				System.out.println(select + " " + addressbook[select]);
			}
			System.out.println("Please Select Your address book");
			int select = scanner.nextInt();
			key = addressbook[select];
		}

		person = new Person();

		// TODO Auto-generated method stub
		System.out.println("Enter the First name");
		String firstname = scanner.next();
		person.setFirstname(firstname);

		System.out.println("Enter the Last name");
		String lastname = scanner.next();
		person.setLastname(lastname);

		System.out.println("Enter your Address");
		String address = scanner.next();
		person.setAddress(address);

		System.out.println("Enter your City");
		String city = scanner.next();
		person.setCity(city);

		System.out.println("Enter your State");
		String state = scanner.next();
		person.setState(state);

		System.out.println("Enter your Zip Code");
		String zipcode = scanner.next();
		person.setZip(zipcode);

		System.out.println("Enter your Phone Number");
		String phone = scanner.next();
		person.setPhone(phone);

		List<Person> a = map.get(key);

		// System.out.println(person.toString());
		a.add(person);
		map.put(key, a);

		// Map1.put(slot, list[slot]);
		// list[slot].add(results[i]);

		// System.out.println(map.get(key));

	}

	public void display() {

		for (int select_key = 0; select_key < i; select_key++) {
			System.out.println(select_key + " " + addressbook[select_key]);
		}

		System.out.println("Please Select the Key");
		int selected_key = scanner.nextInt();
		String j = addressbook[selected_key];

		List<Person> a = map.get(j);
		System.out.println(a);

		/*
		 * for (Entry<String, List<Person>> entry : map.entrySet()) {
		 * 
		 * String key = entry.getKey();
		 * 
		 * List<Person> value = entry.getValue();
		 * 
		 * System.out.
		 * println("Firstname \tLastname \tAddress \tCity \t\tState \t\tZIP \t\tPhone \n"
		 * );
		 * 
		 * for(Person aString : value)
		 * 
		 * { System.out.println(aString); } }
		 */

	}

	public void search() {
		System.out.println("Enter the First name you want to search");
		String name = scanner.next();

		for (int i = 0; i < list.size(); i++) {
			String str = map.get(key).get(i).getFirstname();
			if (str.equalsIgnoreCase(name)) {
				System.out.println(map.get(key).get(i));
				return;
			}
			System.out.println("Contact Not Found");
		}
	}

	public void delete() {
		System.out.println("Enter the number you need to delete");
		String name = scanner.nextLine();
		// int size=map.size();
		for (int i = 0; i < list.size(); i++) {
			String str = map.get(key).get(i).getPhone();

			if (str.equals(name)) {
				list.remove(map.get(key).get(i));
				System.out.println(map.get(key));
				return;

			}

		}

		System.out.println("Not Present");

	}

	public void update() {
		int ch = 0;
		char choice;
		System.out.println("Enter the phone number for updation");
		String phone = scanner.next();
		for (int i = 0; i < list.size(); i++) {
			String str = map.get(key).get(i).getPhone();
			if (str.equalsIgnoreCase(phone)) {
				Person obj = map.get(key).get(i);
				System.out.println("Hi User, Please select field you need to edit..!");
				do {
					System.out.println("1. Change Address");
					System.out.println("2. Change City");
					System.out.println("3. Change State");
					System.out.println("4. Change Zipcode");
					System.out.println("5. change Phone Number");

					ch = scanner.nextInt();

					switch (ch) {
					case 1:
						System.out.println("Enter your Address");
						String address = scanner.next();
						obj.setAddress(address);
						System.out.println("Address Updated");
						break;
					case 2:
						System.out.println("Enter your City ");
						String city = scanner.next();
						obj.setCity(city);
						System.out.println("City Updated");
						break;
					case 3:
						System.out.println("Enter your State");
						String state = scanner.next();
						obj.setState(state);
						System.out.println("State Updated");
						break;
					case 4:
						System.out.println("Enter Your Zipcode");
						String zipcode = scanner.next();
						obj.setZip(zipcode);
						System.out.println("Zipcode Updated");
						break;
					case 5:
						System.out.println("Enter Phone Number");
						String phone1 = scanner.next();
						obj.setPhone(phone1);
						System.out.println("Phone Number Updated");
						break;

					}

					System.out.println("Do You want to continue");
					choice = scanner.next().charAt(0);

				} while (choice == 'Y' || choice == 'y');
			} else {
				System.out.println("Contact doesn't exist");
			}

		}
	}

	public void sortbyname() {
		List<Person> arraylist = map.get(key);
		Collections.sort(arraylist, Person.sortbyname);

		for (Person str : arraylist)

		{
			System.out.println(str);
		}

	}

	public void sortbyzip() {
		{
			List<Person> arraylist = map.get(key);
			Collections.sort(arraylist, Person.sortbyzip);

			for (Person str : arraylist)

			{
				System.out.println(str);
			}

		}

	}

	public void createaddressbook() {

		System.out.println("Enter the Name of Address Book you need to create");
		addressbook[i] = scanner.next();

		map.put(addressbook[i], new LinkedList<Person>());
		i++;
		System.out.println("Address Book Created");

	}

}
