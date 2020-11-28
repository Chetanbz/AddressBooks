
public class Contact {
	private String first;
	private String last;
	private String address;
	private String city;
	private String State;
	private int zip;
	private long mobile;
	private String email;
	static int count;
	
	
	
	public Contact() {
		count++;
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
		return  " First Name :" +  first + " || Last Name :" + last + " \n" + "Address :" +  address + " ||City :" + city + " || State :" + State + " || Zip :" + zip+ " || Mobile :" + mobile + " || Email :" + email; 
	}
	

}
