package com.perscholas.operators_and_nums;

//answers to five and six below

public class OpsAndNumsFive {
    public static void main(String[] args) {
        int number = 5;
        System.out.println(number);

        number++;

        System.out.println(number);

        //output 5, after postfix increment is 6

        //postfix
        number++;
        System.out.println(number);

        //prefix
        ++number;
        System.out.println(number);

        //addition assignment operator
        number += 1;
        System.out.println(number);

        //output 7,8,9

    }
}

//5. Write a program that declares an integer variable, assigns a number, and uses a
//postfix increment operator to increase the value. Print the value before and after the
//increment operator.

//6. Write a program that demonstrates at least three ways to increment a variable by 1
//and does this multiple times. Assign a value to an integer variable, print it, increment
//by 1, print it again, increment by 1, and then print it again.