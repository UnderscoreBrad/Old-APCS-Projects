
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Contacts c1 = new Contacts(), c2 = new Contacts(), c3 = new Contacts();
        while (true) {
            System.out.println("Enter a 1-3 to edit, enter a 4 to display.");
            int userChoice = sc.nextInt();
            if (userChoice == 1) {
                System.out.println("Edit the contact name.");
                sc.skip("\n");
                String userIn = sc.nextLine();
                c1.setName(userIn);
                System.out.println("Edit the contact phone number.");
                userIn = sc.nextLine();
                c1.setPhone(userIn);
            } else if (userChoice == 2) {
                System.out.println("Edit the contact name.");
                sc.skip("\n");
                String userIn = sc.nextLine();
                c2.setName(userIn);
                System.out.println("Edit the contact phone number.");
                userIn = sc.nextLine();
                c2.setPhone(userIn);
            } else if (userChoice == 3) {
                System.out.println("Edit the contact name.");
                sc.skip("\n");
                String userIn = sc.nextLine();
                c3.setName(userIn);
                System.out.println("Edit the contact phone number.");
                userIn = sc.nextLine();
                c3.setPhone(userIn);
            } else if (userChoice == 4) {
                System.out.println("Contact 1 ======================");
                System.out.println("Name:  " + c1.getName());
                System.out.println("Phone# " + c1.getPhone());
                System.out.println("Contact 2: ======================");
                System.out.println("Name:  " + c2.getName());
                System.out.println("Phone# " + c2.getPhone());
                System.out.println("Contact 3: ======================");
                System.out.println("Name: " + c3.getName());
                System.out.println("Phone# " + c3.getPhone());
            } else {
                System.exit(0);
            }
        }
    }
}
