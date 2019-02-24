package com.KhangMai;
import java.util.Scanner;
public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("4084776888");

    public static void main(String[] args) {
	// write your code here


        boolean quit = false;
        startPhone();
        printAction();
        while(!quit){
            System.out.println("Enter option: ");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch(action){
                case 0:
                    System.out.println("Shutting down");
                    quit = true;
                    break;

                case 1:
                    printContact();
                    break;

                case 2:
                    addNewContact();
                    break;

                case 3:
                    updateContact();
                    break;

                case 4:
                    removeContact();
                    break;

                case 5:
                    queryContact();
                    break;

                case 6:
                    printAction();
                    break;
            }

        }

    }

    private static void addNewContact(){
        System.out.println("Enter new contact name: ");
        String name = scanner.nextLine();
        System.out.println("Enter phone number: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println(name + " with phone number: " + phone + "was added to the contact list.");
        }
        else {
            System.out.println("CANNOT ADD\n" + "\t" +name + " is already in the list.");
        }
    }

    private static void updateContact(){
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null){
            System.out.println("Contact cannot be found.");
            return;
        }

        System.out.println("Enter new contact name: ");
        String newName = scanner.nextLine();
        System.out.println("Enter new phone number: ");
        String newPhone = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newPhone);
        if(mobilePhone.updateContact(existingContactRecord,newContact)){
            System.out.println("Successfully update record.");
        }
        else {
            System.out.println("Error updating record.");
        }
    }

    private static void removeContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact cannot be found.");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully remove record.");
        }
        else {
            System.out.println("Error removing record.");
        }
    }

    private static void queryContact() {
        System.out.println("Enter existing contact name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Contact cannot be found.");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() + " and phone number is: " +
                            existingContactRecord.getPhoneNumber());
    }

    private static void printContact(){
        mobilePhone.printContact();
    }

    private static void startPhone(){
        System.out.println("Starting phone ...");
    }

    private static void printAction(){
        System.out.println("\nAvailable options: \nPress");
        System.out.println("0 - to shutdown\n" +
                           "1 - to print contacts\n" +
                           "2 - to add a new contact\n" +
                           "3 - to update an existing contact\n" +
                           "4 - to remove contact from the list\n" +
                           "5 - to search contact name\n" +
                           "6 - to print a list of available options\n");
        System.out.println("Choose your options: ");
    }

}
