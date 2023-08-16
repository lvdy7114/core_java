package com.perscholas.loops;

import java.util.Scanner;

public class ForLoopFindGCD {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first positive integer: ");
        int n1 = scanner.nextInt();

        System.out.println("Enter the second positive integer: ");
        int n2 = scanner.nextInt();

        int gcd = findGCD(n1, n2);
        System.out.println("The greatest common divisor is: " + gcd);

        scanner.close();
    }

    public static int findGCD(int n1, int n2) {
        int gcd = 1;

        for(int k = 2; k <= n1 && k <= n2; k++) {
            if(n1 % k == 0 && n2 % k == 0) {
                gcd = k;
            }
        }
       return gcd;
    }
}
