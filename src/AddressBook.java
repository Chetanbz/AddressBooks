import java.util.Scanner;

public class AddressBook {
	public static void main(String[] args) {
		System.out.println(" Welcome to Address Book");
		Scanner sc = new Scanner(System.in);
		System.out.println(" Please mention details of person in order");

		
		while(true) {
			Contact en = new Contact();      // Contact class is created which has details of person which needed to upload, Here just object created
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
		
			// Edit entry step
			System.out.println(" Do you want to edit existing person detail");
			System.out.println(" Press 0 to not edit, Press 1 to edit");
			int num = sc.nextInt();
			if (num ==0) {   /// If 0 -- Edit is not required
				break;
			}
			else if (num == 1) {   /// If 1 -- Edit is required check for first name
				while(true) {
					System.out.println(" Mention First name of person whose entry want to edit");
					String personName = sc.next();
					if (en.getFirst().equals(personName)) {
						en = null ;    /// assigning object to null will delete person entry
					    break;
					}
					else {
						System.out.println(" Name not found in addressbook ");
					}
				}
			}
		}
	}

}
