public class LogicalOperatorsDemo {
    public static void main(String[] args)
    {
        boolean x = true;
        boolean y = false;
        System.out.println("x & y : " + (x & y));
        System.out.println("x && y : " + (x && y));
        System.out.println("x | y : " + (x | y));
        System.out.println("x || y: " + (x || y));
        System.out.println("x ^ y : " + (x ^ y));
        System.out.println("!x : " + (!x));
    }
}

//output
//x & y : false
//x && y : false
//x | y : true
//x || y: true
//x ^ y : true
//!x : false
