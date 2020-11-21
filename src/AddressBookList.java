import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBookList {

	public static void main(String[] args) {
		Map<String,AddressBook> addressBookList = new HashMap<String,AddressBook> (); /// key -- String, value Addressbook
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println(" Do you wish to add addressbook");
			System.out.println(" Press 0 to not add, Press 1 to add");
			int num = sc.nextInt();
			
			if (num ==0) {
				break;
			}
			System.out.println(" Unique name of addressbook");
			String name = sc.next();
			System.out.println(" Give details of addressbook");
			AddressBook addressBook = new AddressBook();
			addressBook.main(null);
			
			addressBookList.put(name,addressBook);
			
		}
		System.out.println(addressBookList);
		sc.close();

	}

}
