import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class AddressBookList {
	static Map<String,AddressBook> addressBookList = new HashMap<String,AddressBook> (); /// key -- String, value Addressbook
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(" Do you wish to add addressbook");
			System.out.println(" Press 1 Add new Addressbook\n Press 2 Display Addressbooks\n Press 3 Existing Addressbooks \n Press 0 Exit ");
			int num = sc.nextInt();
			AddressBook addressBook = new AddressBook();
			if (num ==0) {
				addressBook = null;
				break;
			}
			else if(num==1) {
				System.out.println(" Unique name of addressbook");
				String name = sc.next();
				if (findUniqueName( name)) {
					System.out.println(" Give details of addressbook");
					addressBook.main(null);
					addressBookList.put(name,addressBook);
				}
			}
			else if(num ==3) {
				System.out.println("Name of addressbook");
				String name = sc.next();
				AddressBook addressBookExist = addressBookList.get(name);
				addressBookExist.main(null);
			}
			else {
				display();
			}
			
		}
		//System.out.println(addressBookList);
		sc.close();

	}
	public static boolean findUniqueName(String name) {
		for ( String key : addressBookList.keySet() ) {
		    if (key.equals(name)) {
		    	System.out.println("Addressbook with given name already existed");
		    	return false;
		    }
		}
		return true;
	}
	public static void display() {
		for ( String key : addressBookList.keySet() ) {
			 System.out.println( "Address book "+ key );
		}
	}
}