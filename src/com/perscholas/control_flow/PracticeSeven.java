package com.perscholas.control_flow;

import java.util.Scanner;

public class PracticeSeven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter filing status (Single, Married Filing Jointly, Married Filing Separately, Head): ");
        String filingStatus = scanner.nextLine();

        System.out.println("Enter income: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(filingStatus, income);
        System.out.println("Tax amount: $ " + tax);

        scanner.close();
    }

    public static double calculateTax(String filingStatus, double income) {
        double tax = 0;

        if (filingStatus.equalsIgnoreCase("Single")) {
            if (income <= 8350) {
                tax = income * 0.10d;
            } else if (income <= 33950 && income >= 8351) {
                tax = income * 0.15d;
            } else if (income <= 82250 && income >= 33951) {
                tax = income * .25d;
            } else if (income <= 171550 && income >= 82251) {
                tax = income * .28d;
            } else if (income <= 372950 && income >= 171551) {
                tax = income * .33d;
            } else if (income <= 372951) {
                tax = income * .35d;
            }
        } else if (filingStatus.equalsIgnoreCase("Head")) {
            if (income <= 11950) {
                tax = income * .10d;
            } else if (income <= 45500 && income >= 11951) {
                tax = income * 0.15d;
            } else if (income <= 117450 && income >= 45501) {
                tax = income * .25d;
            } else if (income <= 190200 && income >= 117451) {
                tax = income * .28d;
            } else if (income <= 372950 && income >= 190201) {
                tax = income * .33d;
            } else if (income <= 372951) {
                tax = income * .35d;
            }
            return tax;
        } else if (filingStatus.equalsIgnoreCase("Married Filing Jointly")) {
            if (income <= 16700) {
                tax = income * .10d;
            } else if (income <= 67900 && income >= 16701) {
                tax = income * 0.15d;
            } else if (income <= 137050 && income >= 61907) {
                tax = income * .25d;
            } else if (income <= 208850 && income >= 137051) {
                tax = income * .28d;
            } else if (income <= 372950 && income >= 208851) {
                tax = income * .33d;
            } else if (income <= 372951) {
                tax = income * .35d;
            }
            return tax;
        } else if (filingStatus.equalsIgnoreCase("Married Filing Separately")) {
            if (income <= 8350) {
                tax = income * .10d;
            } else if (income <= 33950 && income >= 8351) {
                tax = income * 0.15d;
            } else if (income <= 68525 && income >= 33951) {
                tax = income * .25d;
            } else if (income <= 104425 && income >= 68526) {
                tax = income * .28d;
            } else if (income <= 186475 && income >= 104426) {
                tax = income * .33d;
            } else if (income <= 186476) {
                tax = income * .35d;
            }
            return tax;
        }
        return tax;
    }
}
