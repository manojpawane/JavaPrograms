package com.bridgelabz.implementation;

import java.util.*;
import java.io.*;
import java.util.Map.Entry;
import java.util.concurrent.ExecutionException;

import javax.tools.FileObject;

import com.bridgelabz.model.Person;
import com.bridgelabz.service.Service;

public class AddressBook implements Service {
	/*
	 * In this class we actual provide a implementation or logic of all the
	 * interface presents in the service interface, this class can also said to
	 * be concrete class
	 */

	int numberofaddressbook = 0;
	List<Person> list = new LinkedList<Person>();
	Map<String, List<Person>> map = new HashMap<String, List<Person>>();

	String[] addressbook = new String[10];

	Person person;
	Scanner scanner = new Scanner(System.in);
	String value = "";
	// LinkedList key=new LinkedList();

	String key = "";

	@Override

	public void addperson() {

		/*
		 * this method is implementation of interface declared in service this
		 * class is used to add person before adding contact address book must
		 * be present if not present it will pop up to create new address book
		 * after creating new address book it will add person by details
		 * provided by users and add to specified address book
		 */
		fileReader();
		if (numberofaddressbook == 0) {
			System.out.println("There is No Address Book Present, Do you want to create than press 1...! ");
			int press = scanner.nextInt();

			if (press == 1) {
				createaddressbook();

			} else {
				return;
			}

		}

		for (int select = 0; select < numberofaddressbook; select++) {
			System.out.println(select + " " + addressbook[select]);
		} /*
			 * if(map.get(key)==null) { System.out.
			 * println("There is No Address Book Present, Do you want to create than press 1...! "
			 * ); int press = scanner.nextInt();
			 * 
			 * if (press == 1) { createaddressbook();
			 * 
			 * 
			 * } else { return; }
			 * 
			 * }
			 */
		System.out.println("Please Select Your address book");
		int select = scanner.nextInt();
		key = addressbook[select];

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

		a.add(person);
		map.put(key, a);
		fileWriter();

	}

	public void fileWriter() {
		FileOutputStream fos;
		try {
			fos = new FileOutputStream("/home/bridgeit/Desktop/store.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(map);
			oos.writeObject(addressbook);
			oos.writeInt(numberofaddressbook);
			oos.writeObject(key);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void fileReader() {
		try {
			FileInputStream fileInputStream = new FileInputStream("/home/bridgeit/Desktop/store.ser");
			ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
			map = (HashMap) objectInputStream.readObject();

			addressbook = (String[]) objectInputStream.readObject();
			numberofaddressbook = objectInputStream.readInt();
			key = (String) objectInputStream.readObject();
			objectInputStream.close();
			fileInputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void display()

	{
		fileReader();
		/*
		 * this method is used to define a interface in which we can display the
		 * contacts of specified address book
		 */

		System.out.println("Enter the key");
		String keys = scanner.next();
		List<Person> a = map.get(keys);

		System.out.println("Firstname \tLastname \tAddress \tCity \t\tState \t\tZIP \t\tPhone \n");
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

	}

	public void search() {
		/*
		 * this method is used to search specified contact from specified
		 * address book and print it details on console
		 */

		System.out.println("Enter the key");
		String j = scanner.next();
		fileReader();
		List<Person> a = map.get(j);

		System.out.println("Enter the First name you want to search");
		String name = scanner.next();

		for (int i = 0; i < a.size(); i++) {
			String str = map.get(j).get(i).getFirstname();
			if (str.equalsIgnoreCase(name)) {
				System.out.println(map.get(j).get(i));
				return;
			}
			System.out.println("Contact Not Found");
		}
	}

	public void delete() {
		/*
		 * this method is used to define a delete function in which a specific
		 * contact can be deleted from the specific address book
		 */

		String keys;

		System.out.println("Enter the key");
		keys = scanner.next();
		fileReader();
		list = map.get(keys);

		System.out.println("Enter the number you need to delete");
		String number = scanner.next();
		for (int i = 0; i < list.size(); i++) {
			if (number.equals(list.get(i).getPhone())) {
				list.remove(i);
			}
		}

		fileWriter();

	}

	public void update() {
		/*
		 * this method is used to to update the details of the specified contact
		 * from specified address book
		 */
		int ch = 0;
		char choice;

		System.out.println("LastnameEnter the Key");
		String keys = scanner.next();
		fileReader();
		List<Person> a = map.get(keys);
		System.out.println(a);
		System.out.println("Enter the phone number for updation");
		String phone = scanner.next();
		for (int i = 0; i < a.size(); i++) {
			String str = map.get(keys).get(i).getPhone();
			if (str.equalsIgnoreCase(phone)) {
				Person obj = map.get(keys).get(i);
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
						fileWriter();
						System.out.println("Address Updated");
						break;
					case 2:
						System.out.println("Enter your City ");
						String city = scanner.next();
						obj.setCity(city);
						fileWriter();
						System.out.println("City Updated");
						break;
					case 3:
						System.out.println("Enter your State");
						String state = scanner.next();
						obj.setState(state);
						fileWriter();
						System.out.println("State Updated");
						break;
					case 4:
						System.out.println("Enter Your Zipcode");
						String zipcode = scanner.next();
						obj.setZip(zipcode);
						fileWriter();
						System.out.println("Zipcode Updated");
						break;
					case 5:
						System.out.println("Enter Phone Number");
						String phone1 = scanner.next();
						obj.setPhone(phone1);
						fileWriter();
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
		fileReader();
		/* this method is used to sort the specified address book by name */
		for (int select = 0; select < numberofaddressbook; select++) {
			System.out.println(select + " " + addressbook[select]);
		}

		System.out.println("Please Select Your address book");
		int select = scanner.nextInt();
		Object keys = addressbook[select];

		List<Person> arraylist = map.get(keys);
		Collections.sort(arraylist, Person.sortbyname);
		fileWriter();
		for (Person str : arraylist)

		{
			System.out.println(str);
		}

	}

	public void sortbyzip() {
		fileReader();
		/*
		 * This method is used to sort the specified address book by zipcode
		 * given by user
		 */
		{
			for (int select = 0; select < numberofaddressbook; select++) {
				System.out.println(select + " " + addressbook[select]);
			}

			System.out.println("Please Select Your address book");
			int select = scanner.nextInt();
			Object keys = addressbook[select];

			// List<Person> a = map.get(j);
			List<Person> arraylist = map.get(keys);
			Collections.sort(arraylist, Person.sortbyname);
			fileWriter();
			for (Person str : arraylist)

			{
				System.out.println(str);
			}

		}

	}

	public void createaddressbook() {
		/* This method is used to create a address book with specified name */

		System.out.println("Enter the Name of Address Book you need to create");
		addressbook[numberofaddressbook] = scanner.next();

		map.put(addressbook[numberofaddressbook], new LinkedList<Person>());

		numberofaddressbook++;
		fileWriter();
		System.out.println("Address Book Created");

	}

}
