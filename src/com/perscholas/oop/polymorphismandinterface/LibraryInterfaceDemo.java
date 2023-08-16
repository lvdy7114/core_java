package com.perscholas.oop.polymorphismandinterface;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        // Test case #1
        LibraryUser kidUser1 = new KidUser(10, "Kids");
        kidUser1.registerAccount();
        kidUser1.requestBook("Kids");
        LibraryUser kidUser2 = new KidUser(18, "Fiction");
        kidUser2.registerAccount();
        kidUser2.requestBook("Fiction");
        // Test case #2
        LibraryUser adultUser1 = new AdultUser(5, "Kids");
        adultUser1.registerAccount();
        adultUser1.requestBook("Kids");
        LibraryUser adultUser2 = new AdultUser(23, "Fiction");
        adultUser2.registerAccount();
        adultUser2.requestBook("Fiction");
    }
}

//output
//You have successfully registered a Kids Account
//Book issued successfully, please return the book within 10 days.
//Sorry, age must be greater than 12 to register as an adult.
//“Oops, you are allowed to take only kids books.
//Sorry, age must be greater than 12 to register as an adult.
//Oops, you are allowed to take only adult Fiction books.
//You have successfully registered under an Adult Account.
//Book Issued successfully, please return the book within 7 days.