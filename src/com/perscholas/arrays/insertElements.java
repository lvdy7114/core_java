package com.perscholas.arrays;

import java.util.Scanner;

public class insertElements {
    public static void main(String[] args) {
        int i, element;
        int[] arr = new int[11];
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter 10 Elements: ");
        for(i=0; i<10; i++)
            arr[i] = scan.nextInt();
        System.out.print("Enter an Element to Insert: ");
        element = scan.nextInt();
        arr[i] = element;
        System.out.println("\nNow the new array is: ");
        for(i=0; i<11; i++)
            System.out.print(arr[i]+ " ");

    }
}
//output
//Enter 10 Elements: 10
//20
//30
//40
//50
//60
//70
//80
//90
//100
//Enter an Element to Insert: 500
//
//Now the new array is:
//10 20 30 40 50 60 70 80 90 100 500