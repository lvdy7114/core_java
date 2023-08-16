package com.perscholas.arrays;

import java.util.Arrays;

public class arrayTaskEight {
    public static void main(String[] args) {

        String[] array = {"one", "two", "three", "four", "five"};

        System.out.println(Arrays.toString(array));

        int middleIndex = array.length / 2;
        String swap = array[0];
        array[0] = array[middleIndex];
        array[middleIndex] = swap;

        System.out.println(Arrays.toString(array));



    }
}
//output
//[one, two, three, four, five]
//[three, two, one, four, five]
//Task 8: Write a program that creates a String array of 5 elements and swaps the first
//element with the middle element without creating a new array.