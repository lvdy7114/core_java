package com.perscholas.arrays;

import java.util.Scanner;

public class arrayTaskEleven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many favorite things do you have? ");
        int numberOfThings = scanner.nextInt();;

        scanner.nextLine();

        String[] favoriteThings = new String[numberOfThings];

        for(int i = 0; i < numberOfThings; i++) {
            System.out.println("Enter your favorite thing: ");
            favoriteThings[i] = scanner.nextLine();
        }

        for (String thing: favoriteThings) {
            System.out.println(thing);
        }
    scanner.close();
    }
}
