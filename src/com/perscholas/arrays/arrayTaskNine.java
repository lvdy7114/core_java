package com.perscholas.arrays;

import java.util.Arrays;

public class arrayTaskNine {
    public static void main(String[] args) {
        int[] array = {4,2,9,13,1,0};

        Arrays.sort(array);

       for(int number: array) {
           System.out.println(number);
       }
    }
}

//output
//0
//1
//2
//4
//9
//13

//Task 9:
//Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1,
//0}. Print the array in ascending order, and print the smallest and the largest
//element of the array. The output will look like the following:
//Array in ascending order: 0, 1, 2, 4, 9, 13
//The smallest number is 0
//The biggest number is 13