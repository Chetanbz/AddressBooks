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
			System.out.println("Press 1 New Addressbook\nPress 2 Go to Existing Addressbooks\nPress 3 Delete Existing Addressbooks \nPress 4 Display all addressbooks \nPress 0 Exit ");
			int num = sc.nextInt();
			if (num ==0) {
				break;
			}
			else if(num==1) {
				System.out.println(" Unique name of addressbook");
				String name = sc.next();
				if (findUniqueName( name)) {
					AddressBook addressBook = new AddressBook();
					System.out.println(" Give details of addressbook");
					addressBook.addressbookOperation();
					addressBookList.put(name,addressBook);
					
				}
			}
			else if(num ==2) {
				System.out.println("Name of addressbook");
				String name = sc.next();
				AddressBook addressBookExist = addressBookList.get(name);
				addressBookExist.addressbookOperation();
			}
			else if(num ==3) {
				System.out.println("Name of addressbook");
				String name = sc.next();
				addressBookList.remove(name);
			}
			else if(num ==4) {
				for (Map.Entry<String,AddressBook> entry : addressBookList.entrySet())  {
					String nameAddressbook = entry.getKey();
					System.out.println(nameAddressbook);   
					AddressBook addressBookExist = addressBookList.get(nameAddressbook);
					for(Object Obj :addressBookExist.personList) {
						System.out.println(Obj);
						System.out.println();
					}
			}
			
			
		}
		//System.out.println(addressBookList);
		
	}
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

	
}