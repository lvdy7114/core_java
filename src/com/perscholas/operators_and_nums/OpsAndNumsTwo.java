package com.perscholas.operators_and_nums;

public class OpsAndNumsTwo {
    public static void main(String[] args) {
        int x = 150;
        System.out.println( Integer.toBinaryString(x)); //10010110

        x = x >> 2;
        //decimal value of 2 and binary value of 100
        System.out.println("Initial value of x: " + x + ". Binary value of x: " + Integer.toBinaryString(x));
        //output Initial value of x: 37 Binary value of x: 100101

        x = 225;
        System.out.println(Integer.toBinaryString(x)); //11100001
        x = x >> 2;
        //Predict 227, binary: 111000
        System.out.println("Initial value of x: " + x + ". Binary value of x: " + Integer.toBinaryString(x));
        //output Initial value of x: 56. Binary value of x: 111000

        x = 1555;
        System.out.println(Integer.toBinaryString(x)); //11000010011
        x = x >> 2;
        //Predict 155, binary: 1100001
        System.out.println("Initial value of x: " + x + ". Binary value of x: " + Integer.toBinaryString(x));
        //output Initial value of x: 388. Binary value of x: 110000100

        x = 32456;
        System.out.println(Integer.toBinaryString(x)); //111111011001000
        x = x >> 2;
        //Predict 400, binary: 1111110110
        System.out.println("Initial value of x: " + x + ". Binary value of x: " + Integer.toBinaryString(x));
        //output Initial value of x: 8114. Binary value of x: 1111110110010

    }
}

//2. Write a program that declares a variable x, and assigns 150 to it, and prints out the
//binary string version of the number. Now use the right shift operator (>>) to shift by 2
//and assign the result to x. Write a comment indicating what you anticipate the
//decimal and binary values to be. Now print the value of x and the binary string.
//Perform the preceding exercise with the following values:
//a. 225  b. 1555  c. 32456