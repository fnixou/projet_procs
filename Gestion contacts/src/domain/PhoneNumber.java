package domain;

public class PhoneNumber {
	
	private int id;
	private String phoneKind;
	private String phoneNumber;
	
	public PhoneNumber() {
		super();
	}
	
	public PhoneNumber(int id, String phoneKind, String phoneNumber) {
		super();
		this.id = id;
		this.phoneKind = phoneKind;
		this.phoneNumber = phoneNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhoneKind() {
		return phoneKind;
	}

	public void setPhoneKind(String phoneKind) {
		this.phoneKind = phoneKind;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	

}