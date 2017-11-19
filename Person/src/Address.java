public class Address {

	String street;
	String houseNumber;
	String city;
	String zipCode;
	String state;

	public Address(String street, String houseNumber, String city,
			String zipCode, String state) {
		this.street = street;
		this.houseNumber = houseNumber;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}

	public String toString() {
		return "Address [street =" + street + ", houseNumber =" + houseNumber
				+ ", city =" + city + ", zipCode =" + zipCode + ", state ="
				+ state + "]";
	}

}
