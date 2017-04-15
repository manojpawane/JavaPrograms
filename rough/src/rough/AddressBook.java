package rough;

import java.util.*;


import java.io.File;
public class AddressBook 
{

	HashMap<String, List<Person>> map = new HashMap<String, List<P>();
	
	
	
	 list=new LinkedList();
	Person person = new Person();


	Scanner sc = new Scanner(System.in);
	String value = "";
	String key = "friends";

	public void addperson() {

		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("Enter the First name");
		String firstname = sc.next();
		person.setFirstname(firstname);

		System.out.println("Enter the Last name");
		String lastname = sc.next();
		person.setLastname(lastname);

		System.out.println("Enter your Address");
		String address = sc.next();
		person.setAddress(address);

		System.out.println("Enter your City");
		String city = sc.next();
		person.setCity(city);

		System.out.println("Enter your State");
		String state = sc.next();
		person.setState(state);

		System.out.println("Enter your Zip Code");
		String zipcode = sc.next();
		person.setZip(zipcode);

		System.out.println("Enter your Phone Number");
		String phone = sc.next();
		person.setPhone(phone);
		list.add(person);
		map.put("key",list);
		
		System.out.println(list);

	}

	void mydisplay() {
		//for(int i=0;i<Map<K, V>)
		
		//for(int i=0;i<map.size();i++)
		//{
			System.out.println(map);
		//}

	}

	/*
	 * void search() { System.out.println("Enter Value"); value=sc.next();
	 * if(list.contains(value)) { System.out.println(person);
	 * 
	 * } }
	 */
}
