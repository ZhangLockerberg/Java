import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        ContactsManager myContactsManager = new ContactsManager();
        Contact James = new Contact();
        James.name = "James";
        James.phoneNumber = "00016";
        myContactsManager.addContact(James);
        Contact Meelord = new Contact();
        Meelord.name = "David";
        Meelord.phoneNumber = "066044553";
        myContactsManager.addContact(Meelord);
        Contact Freeman = new Contact();
        Freeman.name = "Freeman";
        Freeman.phoneNumber = "22222";
        myContactsManager.addContact(Freeman);
        Contact result = myContactsManager.searchContact("David");
        System.out.println(result.phoneNumber);
        System.out.println("Enter your address: ");
        Scanner scanner = new Scanner(System.in);
        String address = scanner.nextLine();
        System.out.println("Your address is: " + address);
    }
}

