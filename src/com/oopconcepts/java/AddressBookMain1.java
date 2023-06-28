package com.oopconcepts.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain1 {
    private static List<Contact> addressBook = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Display all contacts");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    private static void addContact(Scanner scanner) {
        System.out.println("\nEnter contact details:");
        System.out.print("First Name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last Name: ");
        String lastName = scanner.nextLine();
        System.out.print("Address: ");
        String address = scanner.nextLine();
        System.out.print("City: ");
        String city = scanner.nextLine();
        System.out.print("State: ");
        String state = scanner.nextLine();
        System.out.print("ZIP: ");
        String zip = scanner.nextLine();
        System.out.print("Phone Number: ");
        String phoneNumber = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
        addressBook.add(contact);

        System.out.println("Contact added successfully!");
    }

    private static void displayContacts() {
        if (addressBook.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            System.out.println("\nAddress Book Contacts:");
            for (Contact contact : addressBook) {
                System.out.println(contact);
            }
        }
    }
}