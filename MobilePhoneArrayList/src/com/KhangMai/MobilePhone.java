package com.KhangMai;

import java.util.ArrayList;

public class MobilePhone {

    private String myPhoneNumber;
    private ArrayList<Contact> myContactList;


    public MobilePhone(String myPhoneNumber){
        this.myPhoneNumber = myPhoneNumber;
        this.myContactList = new ArrayList<Contact>();
    }

    public boolean addNewContact(Contact contact){
       if(findContact(contact.getName()) >= 0){
           System.out.println("The contact name is already existed.");
           return false;
       }

       myContactList.add(contact);
       return true;
    }



    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
        if(foundPosition < 0){
            System.out.println(oldContact.getName() + " was not found.");
            return false;
        }
        else if(findContact(newContact.getName()) != -1){
            System.out.println("Name: " + newContact.getName() +
                                " already existed. Update was not successful");
            return false;
        }

        this.myContactList.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " was replaced with " + newContact.getName());
        return true;
    }

    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() + " was not found.");
            return false;
        }

        this.myContactList.remove(contact);
        System.out.println(contact.getName() + " was removed from the list.");
        return true;
    }

    private int findContact(String contactName){
        for(int i =0; i < myContactList.size(); i++){
            Contact contact = this.myContactList.get(i);
            if(contact.getName().equals(contactName)){
                return i;
            }
        }
        return -1;
    }

    private int findContact(Contact contact){
        return myContactList.indexOf(contact);
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContactList.get(position);
        }
        return null;
    }

    public void printContact(){
        System.out.println("Contact List:");
        for(int i = 0; i < myContactList.size(); i++){
            System.out.println((i+1) + ". " +
                            this.myContactList.get(i).getName() + " --> " +
                            this.myContactList.get(i).getPhoneNumber());
        }
    }
}
