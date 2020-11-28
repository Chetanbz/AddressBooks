import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class AddressBook {
	
	 List<Contact> personList = new ArrayList<Contact>();     
	public static void main(String[] args) {
		addressbookOperation();
		
	}
	public static void addressbookOperation() {
		AddressBook addressbook = new AddressBook();
		System.out.println(" Welcome to Address Book");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(" What you wish to do");
			System.out.println(" Press 1 ---Add person \n Press 2 ---Edit existing entry \n Press 3 ---Delete existing entry \n Press 4 ---Display Existing entry \n Press 0 ---Exit ");
			int num = sc.nextInt();
			if (num == 0) { /// If 0 option from exit 
				break;   
			}
			else if(num == 1) {  /// If 1 is person details are  intended to add
				System.out.println(" Please mention details of person in order");
				addressbook.personList.add(addEntry());
			}
			else if(num == 2) {  /// If 2 is person details are  intended to edit
				System.out.println(" Please mention first name of person");
				String name = sc.next();
				if (findEntry(name,addressbook.personList)) { // When we invoke finEntry() we delete that object from list with first name
					System.out.println(" Please edit details of person in order");
					addressbook.personList.add(addEntry());    // addEntry call agains and again entry got added
				}
				else {
					System.out.println(" Can not find the given entry");
				}
			}
			else if (num == 3){  /// If 3 is person details are  intended to delete
				System.out.println(" Please mention first name of person");
				String name = sc.next();
				if (findEntry(name,addressbook.personList)) {
					System.out.println(" Entry of person ");
				}
				else {
					System.out.println(" Can not find the given entry");
				}
			}
			else if(num ==4) {
				for(Object Obj :addressbook.personList) {
					System.out.println(Obj);
					System.out.println();
				}
			}
			else {
				System.out.println("Invalid entry");
			}
		}
		System.out.println(addressbook);
	}
	
	public static Contact addEntry() {  // addEntry will add all entry to class
		Contact en = new Contact();      // Contact class is created which has details of person which needed to upload, Here just object created
		System.out.println(" First name");
		Scanner sc = new Scanner(System.in);
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
		return en;
	}
	
	public static boolean findEntry(String name, List<Contact> personList) {
		for(Object Obj :personList) {
			String FirstName = ((Contact) Obj).getFirst();
			if(FirstName.equals(name)) {
				personList.remove(Obj);
				return true;
			}
		}
		return false;
	}
	public String display() {
		AddressBook addressbook = new AddressBook();
		String str = "";
		for(Object Obj :addressbook.personList) {
			str += Obj;
		}
		return str;
	}
	public String toString() {
		AddressBook addressbook = new AddressBook();
		String str = "";
		for(Object Obj :addressbook.personList) {
			str += (String)Obj;
		}
		return str;
	}


}
