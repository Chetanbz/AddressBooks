import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

// look another class AddressbookList which contains all addressbooks
public class AddressBook {
	public static String directory = "D:\\eclipse-java-2020-09-R-win32-x86_64\\Workspace Eclipse\\AddressBooks\\AddressBookDetails\\Entry_Object.txt";

	static int count = 0;
	static Map<String,String> cityList = new HashMap<String,String> ();
	static Map<String,String> stateList = new HashMap<String,String> ();
	static List<Contact> contactList = new ArrayList<Contact>();
	public static void main(String[] args) {
		List<Contact> personList = new ArrayList<Contact>();      // PersonList can be added with Contacts  
		// addEntry() class will add all entry to addressbook
		AddressBook addressbook = new AddressBook();
		System.out.println(" Welcome to Address Book");
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(" What you wish to do");
			System.out.println(" Press 1 ---Add person \n Press 2 ---Edit existing entry \n Press 3 ---Delete existing entry \n Press 4 ---Display Existing entry \n Press 5 ---Store data in file \n Press 0 ---Exit ");
			int num = sc.nextInt();
			if (num == 0) { /// If 0 option from exit 
				break;   
			}
			else if(num == 1) {  /// If 1 is person details are  intended to add
				System.out.println(" Please mention details of person in order");
				personList.add(addEntry());
			}
			else if(num == 2) {  /// If 2 is person details are  intended to edit
				System.out.println(" Please mention first name of person");
				String name = sc.next();
				if (findEntry(name,personList)) { // When we invoke finEntry() we delete that object from list with first name
					System.out.println(" Please edit details of person in order");
					personList = obtainContact(name,personList);
					System.out.println("Executed ");
					
				}
				else {
					System.out.println(" Can not find the given entry");
				}
			}
			else if (num == 3){  /// If 3 is person details are  intended to delete
				System.out.println(" Please mention first name of person");
				String name = sc.next();
				if (findEntry(name,personList)) {
					System.out.println(" Entry of person ");
				}
				else {
					System.out.println(" Can not find the given entry");
				}
			}
			else if(num ==4) {
				addressbook.display(personList);
			}
			else if (num ==5){
				writeDetailsInFile();
			}
			else {
				System.out.println("Invalid entry");
			}
			
		}
		
	}
	public static void writeDetailsInFile(){
		StringBuffer addressBookBuffer = new StringBuffer();
		contactList.forEach(contact -> {
			String str = contact.toString().concat("\n").concat("\n");
			addressBookBuffer.append(str);
			try{
				Files.write(Paths.get(directory),addressBookBuffer.toString().getBytes());
			}catch (IOException e) {
				System.out.print(e.getMessage() + "Error comes");
			}
		});


	}
	
	public static Contact addEntry() {  // addEntry will add all entry to class
		Contact en = new Contact();      // Contact class is created which has details of person which needed to upload, Here just object created
		System.out.println(" First name");
		Scanner sc = new Scanner(System.in);
		en.setFirst(sc.next());   /// Set first name input taken from console
		System.out.println(" Last name");
		en.setLast(sc.next());   /// Set Last name input taken from console
		en.setAddress(sc.nextLine());
		System.out.println(" Address");
		en.setAddress(sc.nextLine());   /// Set Address input taken from console
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
		cityList.put(en.getFirst(), en.getCity());
		stateList.put(en.getFirst(), en.getState());
		contactList.add(en);
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
	
	public static List<Contact> obtainContact(String name, List<Contact> personList) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Out loop");
		for(Contact Obj :personList) {
			System.out.println("in loop ");
			Contact c =(Contact) Obj;
			String FirstName = c.getFirst();
			if(FirstName.equals(name)) {
				System.out.println("What yo want to edit ");
				System.out.println("Press 1 Address \n Press City \n Press 3 State ");
				int num = sc.nextInt();
				if (num ==1) {
					System.out.println(" Mention Updated Address ");
					c.setAddress(sc.next());
				}
				else if (num ==2) {
					System.out.println(" Mention City ");
					c.setCity(sc.next());
				}
				else if (num ==3) {
					System.out.println(" Mention State ");
					c.setState(sc.next());
				}
			}
			else {
				System.out.println(" Not Found");
			}
		}
		return personList;
	}
	
	
	public  void display( List<Contact> personList) {
		for(Object Obj :personList) {
			System.out.println(Obj);
			System.out.println();
		}
	}
	public static Contact editEntry(Contact c) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What yo want to edit ");
		System.out.println("Press 1 Address \n Press City \n Press 3 State ");
		int num = sc.nextInt();
		if (num ==1) {
			System.out.println(" Mention Updated Address ");
			c.setAddress(sc.next());
		}
		else if (num ==2) {
			System.out.println(" Mention City ");
			c.setCity(sc.next());
		}
		else if (num ==3) {
			System.out.println(" Mention State ");
			c.setState(sc.next());
		}
		return c;
	}
	/*
	public List<Contact> sortEntry(List<String> personList){
		 List<Contact> myList = personList.stream().sorted(Comparator.comparing(Contact::getFirst)).collect(Collectors.toList());
	}*/
	

}
