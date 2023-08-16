package com.perscholas.operators_and_nums;

//questions below

public class OperatorsAndNumbersOne {
    public static void main(String[] args) {
        //1.
        int x = 2;
        System.out.println("Initial value of x: " + x + " binary version: " + Integer.toBinaryString(x));

        // Left shift by 1 and assign the result to x
        x = x << 1;
        // Predicted decimal value after left shift: 4
        // Predicted binary string after left shift: "100"
        // Print
        System.out.println("Value of x after left shift (decimal): " + x + ", (binary): " + Integer.toBinaryString(x));
        System.out.println(); // Add a newline for better readability

        x = 9;
        System.out.println("Initial value of x (decimal): " + x + ", (binary): " + Integer.toBinaryString(x));
        // Left shift by 1 and assign the result to x
        x = x << 1;
        // Predicted decimal value after left shift: 18
        // Predicted binary string after left shift: "10010"
        // Print the result after left shift
        System.out.println("Value of x after left shift (decimal): " + x + ", (binary): " + Integer.toBinaryString(x));
        System.out.println(); // Add a newline for better readability

        x = 17;
        System.out.println("Initial value of x (decimal): " + x + ", (binary): " + Integer.toBinaryString(x));
        // Left shift by 1 and assign the result to x
        x = x << 1;
        // Predicted decimal value after left shift: 34
        // Predicted binary string after left shift: "100010"
        // Print the result after left shift
        System.out.println("Value of x after left shift (decimal): " + x + ", (binary): " + Integer.toBinaryString(x));
        System.out.println(); // Add a newline for better readability

        x = 88;
        System.out.println("Initial value of x (decimal): " + x + ", (binary): " + Integer.toBinaryString(x));
        // Left shift by 1 and assign the result to x
        x = x << 1;
        // Predicted decimal value after left shift: 176
        // Predicted binary string after left shift: "10110000"
        // Print the result after left shift
        System.out.println("Value of x after left shift (decimal): " + x + ", (binary): " + Integer.toBinaryString(x));

    }
}
//1. Write a program that declares an integer a variable x, assigns the value 2 to it, and
//prints out the binary string version of the number ( Integer.toBinaryString(x) ). Now,
//use the left shift operator (<<) to shift by 1 and assign the result to x. Before printing
//the results, write a comment with the predicted decimal value and binary string. Now,
//print out x in decimal form and in binary notation.
//Perform the preceding exercise with the following values:
//a. 9
//b. 17
//c. 88
//output
//Initial value of x: 2 binary version: 10
//Value of x after left shift (decimal): 4, (binary): 100
//
//Initial value of x (decimal): 9, (binary): 1001
//Value of x after left shift (decimal): 18, (binary): 10010
//
//Initial value of x (decimal): 17, (binary): 10001
//Value of x after left shift (decimal): 34, (binary): 100010
//
//Initial value of x (decimal): 88, (binary): 1011000
//Value of x after left shift (decimal): 176, (binary): 10110000

