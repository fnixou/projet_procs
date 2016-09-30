package domain;

public class Address {
	
	private int id;
	private String street;
	private String city;
	private String country;
	private String postalCode;
	
	
	public Address() {
		super();
	}

	public Address(String street, String city, String country, String postalCode) {
		super();
		this.street = street;
		this.city = city;
		this.country = country;
		this.postalCode = postalCode;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getPostalCode() {
		return postalCode;
	}


	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	

}
