package com.perscholas.loops;

public class ForLoopMultiplicationTable {
    public static void main(String[] args) {
        int table = 12;

        for(int i = 1; i <= table; i++) {
            for(int j = 1; j <= table; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }

    }
}
