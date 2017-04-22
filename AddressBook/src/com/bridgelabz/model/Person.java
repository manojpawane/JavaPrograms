package com.bridgelabz.model;

import java.io.Serializable;
import java.util.Comparator;

public class Person implements Serializable{

	@Override
	public String toString() {
		return firstname + "\t\t" + lastname + "\t\t" + address + "\t\t" + city + "\t\t" + state + "\t\t" + zip + "\t\t"
				+ phone;
	}

	private String firstname;
	private String lastname;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phone;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public static Comparator<Person> sortbyname = new Comparator<Person>() {

		public int compare(Person s1, Person s2) {
			String FirstName1 = (String)s1.getLastname();
			String FirstName2 = (String)s2.getLastname();

			// ascending order
			return FirstName1.compareTo(FirstName2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};

	public static Comparator<Person> sortbyzip = new Comparator<Person>() {
		public int compare(Person s1, Person s2) {
			String Zip1 = s1.getZip();
			String Zip2 = s2.getZip();

			// ascending order
			return Zip1.compareTo(Zip2);

			// descending order
			// return StudentName2.compareTo(StudentName1);
		}
	};

}
