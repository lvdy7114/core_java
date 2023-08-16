public class ExplicitTest {
    public static void main(String[] args) {
        double d = 100.04;
// explicit type casting
        long l = (long) d;
        int i = (int) l;
        System.out.println("Double value " + d); // fractional part lost.
        System.out.println("Long value " + l); // fractional part lost.
        System.out.println("Int value " + i);
        byte b;
        int z = 257;
        double dou = 323.142;
        System.out.println("Conversion of int to byte.");
        b = (byte) z;
        System.out.println("i = " + z + " b = " + b);
        System.out.println("Conversion of double to int.");
        z = (int) dou;
        System.out.println("d = " + dou + " b = " + z);
        System.out.println("Conversion of double to byte.");
        b = (byte) dou;
        System.out.println("d = " + dou + " b = " + b);
    }
}

//output
//Double value 100.04
//Long value 100
//Int value 100
//Conversion of int to byte.
//i = 257 b = 1
//Conversion of double to int.
//d = 323.142 b = 323
//Conversion of double to byte.
//d = 323.142 b = 67

//Explanation
//In this example program, when the value 257 is cast into a byte variable. The output is
//1, which is the remainder of the division of 257 by 256 (the range of a byte). When d is
//converted into an int, its fractional part is lost.
//When d is converted into a byte, its fractional part is also lost, and the value is reduced
//to module 256, which is 67 in this case.

//Disadvantages of using type casting in Java:
//● You can lose some information or data.
//● Accuracy can be lost while using type casting.
//● When a double is cast to an int, the fractional part of a double is discarded, which
//causes the loss of the fractional part of data.