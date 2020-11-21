import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println(" Welcome to Address Book");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please mention details of person in order");
		Contact en = new Contact();      // Contact class is created which has details of person which needed to upload, Here just object created
		/// Entry started to take from console
		System.out.println(" First name");
		en.setFirst(sc.next());   /// Set first name input taken from console
		System.out.println(" Last name");
		en.setLast(sc.next());   /// Set Last name input taken from console
		System.out.println(" Address");
		en.setAddress(sc.next());   /// Set Address input taken from console
		System.out.println(" City");
		en.setCity(sc.next());   /// Set City input taken from console
		System.out.println(" State");
		en.setState(sc.next());   /// Set State input taken from console
		System.out.println(" Zip");
		en.setZip(sc.nextInt());   /// Set zip input taken from console
		System.out.println(" Mobile");
		en.setMobile(sc.nextLong());   /// Set Mobile input taken from console
		System.out.println(" Email");
		en.setEmail(sc.next());   /// Set Email input taken from console
		sc.close();
	}

}
