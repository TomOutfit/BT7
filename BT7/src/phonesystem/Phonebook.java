package phonesystem;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Phonebook extends Phone {

    public Phone(String name, String phone, String newPhone) {
        super(name, phone, newPhone);
    }
    ArrayList<String> PhoneList = NewArrayList();
    @Override
    public abstract void insertPhone() {
        System.out.println("Enter name: ");
        String name = Scanner.nextLine();
        System.out.println("Enter phone: ");
        String phone = Scanner.nextLine();
        Phonebook.add(new PhoneBook(name, phone));
        System.out.println("Phone number added.");
    }

    @Override
    public abstract void removePhone(){
        System.out.println("Enter name: ");
        String name = Scanner.nextLine();
        Phonebook.removePhone(name);
        System.out.println("Phone number removed");
    }


    @Override
    public abstract void searchPhone();


    @Override
    public abstract void sortPhone(){
        Phonebook.sort();
    }

    @Override
    public abstract void updatePhone{
        System.out.println("Enter name: ");
        String name = Scanner.nextLine();
        System.out.println("Enter new phone: ");
        String newPhone = Scanner.nextLine();
        Phonebook.add(new PhoneBook(name, newPhone));
        System.out.println("Phone number updated");
    }
    
}