package com.perscholas.arrays;

import java.util.Arrays;

public class arrayTaskThree {
    public static void main(String[] args) {
        String[] colors = {"red", "green", "blue", "yellow"};

        System.out.println(colors.length);

        String[] cloneColor = colors.clone();
        System.out.println(Arrays.toString(cloneColor));

    }
}
//output
//4
//[red, green, blue, yellow]

// Task 3: Write a program that creates an array of String type and initializes it with the
//strings “red,” “green,” “blue,” and “yellow.” Print out the array length. Make a copy
//using the clone( ) method. Use the Arrays.toString( ) method on the new array to
//verify that the original array was copied.