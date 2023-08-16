package com.perscholas.java_basics;

//instructions are below class

import java.text.DecimalFormat;

public class JavaBasics {
    public static void main(String[] args) {
        //1.
        int varOne = 2;
        int varTwo = 2;
        int varTotal = varOne + varTwo;
        System.out.println(varTotal);

        //2.
        double varThree = 2.0d;
        double varFour = 2.5d;
        double varDouble = varThree + varFour;
        System.out.println(varDouble);

        //3.
        int varFive = 5;
        double varSix = 5.5;
        double sumVariable = varFive + varSix;
        System.out.println(sumVariable);

        //4.
        int varSeven = 7;
        int varEight = 28;
        int varDivSum = varEight / varSeven;
        System.out.println(varDivSum);

        double varEightDec = 28.5d;
        double varSumDiv = varEightDec / varSeven;
        System.out.println(varSumDiv);

        //5.
        double varNine = 12.5d;
        double varTen = 2.5d;
        double doubleSum = varNine / varTen;
        System.out.println(doubleSum);

        //6.
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println(q);

        q = (int) (double) y;
        System.out.println("q after casting to double: " + q);

        //7.
        final int CONSTANT_VALUE = 10;
        int result = CONSTANT_VALUE * 5;
        System.out.println("Named constant in a calculation: " + result);

        //8.
        double coffee = 3.00d;
        double greenTea = 2.50d;
        double coldBrew = 2.75d;

        int coffeeQty = 3;
        int greenTeaQty = 4;
        int coldBrewQty = 2;

        double subTotal = (coffee * coffeeQty) + (greenTea * greenTeaQty) + (coldBrew * coldBrewQty);

        final double SALES_TAX = 0.08;

        double totalSale = subTotal * (1 + SALES_TAX);

        DecimalFormat df = new DecimalFormat("#.00");

        System.out.println("Total sale including tax for products: " + df.format(totalSale));









    }
}

//output: 1. 4, 2. 4.5, 3. 10.5, 4. 4 / when changed to a decimal, you have to change
//the data type to double, otherwise you get an error. 4.07,
//5. 5.0, 6.

//1. Write a program that declares two integer variables, assigns an integer to each, and
//adds them together. Assign the sum to a variable. Print out the result.

//2. Write a program that declares two double variables, assigns a number to each, and
//adds them together. Assign the sum to a variable. Print out the result.

//3. Write a program that declares an integer variable and a double variable, assigns
//numbers to each, and adds them together. Assign the sum to a variable. Print out the
//result. What variable type must the sum be?  It is a double.

//4. Write a program that declares two integer variables, assigns an integer to each, and
//divides the larger number by the smaller number. Assign the result to a variable. Print
//out the result. Now change the larger number to a decimal. What happens? What
//corrections are needed?

//5. Write a program that declares two double variables, assigns a number to each, and
//divides the larger by the smaller number. Assign the result to a variable. Print out the
//result. Now, cast the result to an integer. Print out the result again.

//6. Write a program that declares two integer variables, x and y, and assigns the number 5
//to x and the number 6 to y. Declare a variable q and assign y/x to it and print q. Now,
//cast y to a double and assign it to q. Print q again.

//7. Write a program that declares a named constant and uses it in a calculation. Print the
//result.

//8. Write a program where you create three variables that represent products at a cafe.
//The products could be beverages like coffee, cappuccino, espresso, green tea, etc.
//Assign prices to each product. Create two more variables called subtotal and totalSale
//and complete an “order” for three items of the first product, four items of the second
//product, and two items of the third product. Add them all together to calculate the
//subtotal. Create a constant called SALES_TAX and add sales tax to the subtotal to
//obtain the totalSale amount. Be sure to format the results to two decimal places.