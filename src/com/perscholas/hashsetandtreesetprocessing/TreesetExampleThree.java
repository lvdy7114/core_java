package com.perscholas.hashsetandtreesetprocessing;

import java.util.TreeSet;

public class TreesetExampleThree {
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(2);
        numbers.add(5);
        numbers.add(6);
        System.out.println("TreeSet: " + numbers);
// Using the first() method
        int first = numbers.first();
        System.out.println("First Number: " + first);
// Using the last() method
        int last = numbers.last();
        System.out.println("Last Number: " + last);
    }
}

//output
//TreeSet: [2, 5, 6]
//First Number: 2
//Last Number: 6
