package com.perscholas.arrays;

public class arrayTaskSeven {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};

        for(int i = 0; i < array.length; i++) {
            if(i != 2) {
                System.out.println(array[i]);
            }
        }
    }
}

//output
//1
//2
//4
//5
//Task 7: Write a program where you create an array of 5 elements. Loop through the
//array and print the value of each element, except for the middle (index 2) element.