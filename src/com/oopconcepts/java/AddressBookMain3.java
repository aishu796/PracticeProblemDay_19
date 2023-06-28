package com.oopconcepts.java;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBookMain3 {
    private static List<Contact> addressBook = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Program");

        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Edit an existing contact");
            System.out.println("3. Delete a contact");
            System.out.println("4. Display all contacts");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    addContact(scanner);
                    break;
                case 2:
                    editContact(scanner);
                    break;
                case 3:
                    deleteContact(scanner);
                    break;
                case 4:
                    displayContacts();
                    break;
                case 5:
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

    private static void editContact(Scanner scanner) {
        System.out.print("Enter the first name of the contact to edit: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the last name of the contact to edit: ");
        String lastName = scanner.nextLine();

        Contact contact = findContact(firstName, lastName);

        if (contact == null) {
            System.out.println("Contact not found.");
        } else {
            System.out.println("\nEnter new contact details:");
            System.out.print("First Name: ");
            String newFirstName = scanner.nextLine();
            System.out.print("Last Name: ");
            String newLastName = scanner.nextLine();
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

            // Update the contact details
            contact.setFirstName(newFirstName);
            contact.setLastName(newLastName);
            contact.setAddress(address);
            contact.setCity(city);
            contact.setState(state);
            contact.setZip(zip);
            contact.setPhoneNumber(phoneNumber);
            contact.setEmail(email);

            System.out.println("Contact updated successfully!");
        }
    }

    private static void deleteContact(Scanner scanner) {
        System.out.print("Enter the first name of the contact to delete: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter the last name of the contact to delete: ");
        String lastName = scanner.nextLine();

        Contact contact = findContact(firstName, lastName);

        if (contact == null) {
            System.out.println("Contact not found.");
        } else {
            addressBook.remove(contact);
            System.out.println("Contact deleted successfully!");
        }
    }

    private static Contact findContact(String firstName, String lastName) {
        for (Contact contact : addressBook) {
            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
                return contact;
            }
        }
        return null;
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


