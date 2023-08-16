package com.perscholas.genericmethodandclass;

public class myRunner {
    public static void main(String[] args) {
// initialize the class with Integer data
        DemoClass dObj = new DemoClass();
        dObj.genericsMethod(25); // passing int
        dObj.genericsMethod("Per Scholas"); // passing String
        dObj.genericsMethod(2563.5); // passing float
        dObj.genericsMethod('H'); // passing Char

        // initialize generic class
// with String and Integer data
        GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Per Scholas", 11025);
        System.out.println(mobj.getValueOne());
        System.out.println(mobj.getValueTwo());
// initialize generic class
// with String and String data
        GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype("Per Scholas", "Non profit");
        System.out.println(mobj2.getValueOne());
        System.out.println(mobj2.getValueTwo());
    }
}

//output
//Generics Method:
//Data Passed: 25
//Generics Method:
//Data Passed: Per Scholas
//Generics Method:
//Data Passed: 2563.5
//Generics Method:
//Data Passed: H

//GMultipleDatatype output
//Per Scholas
//11025
//Per Scholas
//Non profit

//In the above example, we have created a generic method
//named genericsMethod.
//public <T> void genericMethod(T data) {...}
//Here, the type parameter <T> is inserted after the public
//modifier and before the return type void.
//We can call the generics method by placing the actual type
//<String> and <Integer> inside the bracket before the method
//name.