package com.perscholas.control_flow;

public class PracticeAssignmentTwo {
    public static void main(String[] args) {
        int x = 7;

        if (x < 10) {
            System.out.println("Less than 10");  //prints this statement
        } else if (x > 10) {
            System.out.println("Greater than 10");  //doesn't
        }
        x = 15;
        System.out.println("Greater than 10");  //prints

    }

}

//2. Write a program that declares 1 integer variable x, and then
//assigns 7 to it. Write an if-else statement that prints out “Less than 10”
//if x is less than 10, and “Greater than 10” if x is greater than 10.
//Change x to 15 and notice the result.