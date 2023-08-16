package com.perscholas.operators_and_nums;

//answers to questions 3 and 4

public class OperAndNumbersThree {
    public static void main(String[] args) {
        int x = 7;
        int y = 17;
        //bitwise and operation prediction: 0001

        int z = x & y;

        System.out.println("Result of bitwise and operation on x and y: " + z);
        System.out.println("Binary representation of z: " + Integer.toBinaryString(z));

        //output
        // Result of bitwise and operation on x and y: 1
        //Binary representation of z: 1

        z = x | y;
        System.out.println("Result of bitwise OR operation on x and y: " + z);
        System.out.println("Binary representation of z: " + Integer.toBinaryString(z));

        //Output: Result of bitwise OR operation on x and y: 23
        //Binary representation of z: 10111

    }
}
//output
// Result of bitwise and operation on x and y: 1
//Binary representation of z: 1

//3. Write a program that declares three int variables: x, y, and z. Assign 7 to x and 17 to
//y. Write a comment that indicates what you predict will be the result of the bitwise
//and operation on x and y. Now use the bitwise and operator to derive the decimal
//and binary values, and assign the result to z.

//4. Now, with the preceding values, use the bitwise and operator to calculate the “or”
//value between x and y. As before, write a comment that indicates what you predict
//the values to be before printing them out.