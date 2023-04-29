package com.zipcodewilmington.phonebok;

import java.util.*;
//import java.util.HashMap;


/**
 * Created by leon on 1/23/18.
 * Made WAY better by kristofer 6/16/20
 */
public class PhoneBook {


    private Map<String, List<String>> phonebook;

    public PhoneBook(Map<String, List<String>> map) {

        this.phonebook = new LinkedHashMap<>(map) ;
    }

    public PhoneBook() {
        this(new LinkedHashMap<>());

    }

    public void add(String name, String phoneNumber) {  //here its asking me to add name and phone number to the phonebook

        List<String> phoneNumbers = new ArrayList<>();// I created  a new list to store the phone numbers for this name

        phoneNumbers.add(phoneNumber); // here I added the phoneNumber varaible to set

        phonebook.put(name, phoneNumbers);   //.put puts  it into map
    }
//map = phonebook



    public void addAll(String name, String[] phoneNumbers) { //unlike the add method one of the arguments is a String array

        List<String> contacts = new ArrayList<>();   // Create a new ArrayList to hold the phone numbers

        for (String phoneNumber : phoneNumbers) {     // Loop through each  phone number in the array so i can add each number

            contacts.add(phoneNumber);// here I added the number to the contacts by using .add
        }
        phonebook.put(name, contacts); // and finally by using the .put i finalized it by Adding the name and associated phone number list to the phonebook

    }


    public void remove(String name) { // this method is asking me t remove something looked inside the container and it was the name

        List<String> names = new ArrayList<>(); // same as always create an array list this time of names

        names.remove(name);       // here i used a .remove to remove the name from name list

        phonebook.remove(name);  // this one i used .remove in order to remove it from the map
    }

    public Boolean hasEntry(String name) {
        return phonebook.containsKey(name);   //if has the key then has entry,
    }

    public List<String> lookup(String name) {
        return phonebook.get(name); // here i used a .get method to get the name,
    }

    public String reverseLookup(String phoneNumber)  {  //1
        for (Map.Entry<String, List<String>> entry : phonebook.entrySet()) {  // Loop through each entry in the phonebook

            if (entry.getValue().contains(phoneNumber)) { // Check if the current entry's list of phone numbers contains the given phone number

                return entry.getKey();  // If it does, return the name associated with this entry
            }
        }

        //if entry has a value with a phone number it will return the key
        return null;        // if phone number not found number not found it will return null
    }

    public List<String> getAllContactNames() {

        List<String> names = new ArrayList<>();    // here i Created a new ArrayList to store the contact names

        for (String name : phonebook.keySet()) { // then Looped through each key in the phonebook (which is the list of contact names)

            names.add(name); // then  Added the current name to the list of names
        }
        return names;     // returns the List here
    }
    public Map<String, List<String>> getMap() {
        return phonebook;     // had to return the entire phone book for the tests to run succesfully
    }
}
           // any issues send me message through slack Mohammed Amine Ztait.