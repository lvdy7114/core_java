package com.perscholas.operators_and_nums;

public class OpsAndNumsSeven {
    public static void main(String[] args) {
        int x = 5;
        int y = 8;

        int sumPrefix = ++x + y;
        System.out.println("Sum with prefix increment: " + sumPrefix);

        // Reset x to 5
        x = 5;
        // Calculate the sum using the postfix increment operator (y is added to the original value of x)
        int sumPostfix = x++ + y;
        System.out.println("Sum with postfix increment: " + sumPostfix);

    }
}

//output
//Sum with prefix increment: 14
//Sum with postfix increment: 13
//Write a program that declares two integer variables: x, and y, and then assigns 5 to x
//and 8 to y. Create another variable sum and assign the value of ++x added to y, and
//print the result. Notice the value of the sum (should be 14). Now change the
//increment operator to postfix (x++) and re-run the program. Notice what the value of
//2
//the sum is. The first configuration incremented x, and then calculated the sum, while
//the second configuration calculated the sum, and then incremented x.