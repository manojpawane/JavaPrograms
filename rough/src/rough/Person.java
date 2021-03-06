package rough;

public class Person {
	
	@Override
	public String toString() {
		return "Person [firstname=" + firstname + ", lastname=" + lastname + ", address=" + address + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", phone=" + phone;
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

	/*public Person() {
		Scanner sc = new Scanner(System.in);

		// TODO Auto-generated method stub
		System.out.println("Enter the First name");
		String firstname = sc.next();
		setFirstname(firstname);

		System.out.println("Enter the Last name");
		String lastname = sc.next();
		setLastname(lastname);

		System.out.println("Enter your Address");
		String address = sc.next();
		setAddress(address);

		System.out.println("Enter your City");
		String city = sc.next();
		setCity(city);

		System.out.println("Enter your State");
		String state = sc.next();
		setState(state);

		System.out.println("Enter your Zip Code");
		String zipcode = sc.next();
		setZip(zipcode);

		System.out.println("Enter your Phone Number");
		String phone = sc.next();
		setPhone(phone);
	}*/

	/*static Person getPerson() {
		Person c = new Person();
		return c;

	}
*/
}
