
public class Contact {
	private String first;
	private String last;
	private String address;
	private String city;
	private String State;
	private int zip;
	private long mobile;
	private String email;


	public Contact(String first, String last, String address, String city, String state, int zip, long mobile, String email) {
		this.first = first;
		this.last = last;
		this.address = address;
		this.city = city;
		State = state;
		this.zip = zip;
		this.mobile = mobile;
		this.email = email;
	}

	public Contact() {
		// TODO Auto-generated constructor stub
	}
	public String getFirst() {
		return first;
	}

	public void setFirst(String first) {
		this.first = first;
	}

	public String getLast() {
		return last;
	}

	public void setLast(String last) {
		this.last = last;
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
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String toString() {  // This way Entry will be printed
		return "First: "+first+", Last: "+last+", Address: "+address+", City: "+city+", State: "+State+", Email: "+email+", Mobile: "+mobile+", Email: "+email;
	}
	

}
