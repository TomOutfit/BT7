package phonesystem;

import java.util.Scanner;

public class ManagePhoneBook extends Phone{
    
public ManagePhoneBook(String name, String phone, String newPhone) {
        super(name, phone, newPhone);
        //TODO Auto-generated constructor stub
    }

public static void main(String[] args) {
    int choice;
    //Menu
    do { 
        System.out.println("PHONEBOOK MANAGEMENT SYSTEM");
        System.out.println("1. Insert Phone");
        System.out.println("2. Remove Phone");
        System.out.println("3. Update Phone");
        System.out.println("4. Search Phone");
        System.out.println("5. Sort");
        System.out.println("6. Exit");
        System.out.println("Moi chon so");
        choice = Integer.parseInt(sc.nextLine());

        switch (choice) {
            case 1:
                insertPhone();
                break;
            case 2:
                removePhone();
                break;
            case 3:
                updatePhone();
                break;
            case 4:
                searchPhone();
                break;
            case 5:
                sortPhone();
                break;
            case 6:
                System.out.println("Exit.......");s
                break;
            default:
                System.out.println("Khong co dieu nay, chon lai di: ");
        }
    } while (choice !=6);
    }
}