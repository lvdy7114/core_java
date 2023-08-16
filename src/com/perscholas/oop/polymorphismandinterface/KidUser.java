package com.perscholas.oop.polymorphismandinterface;

public class KidUser implements LibraryUser {
    private int age;
    private String bookType;

    public KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if(age <=11) {
            System.out.println("You have successfully registered a Kids Account");
        } else {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook(String bookType) {
        if (bookType.equals("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days.");
        } else {
            System.out.println("“Oops, you are allowed to take only kids books.");
        }
    }
}
