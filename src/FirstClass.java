import java.util.Scanner;

public class FirstClass {

    public static void main(String[] args) {
        int counterofMatches = 0;
        int sumofMatches = 0;

        for(int loopNumber = 1; loopNumber <= 100; loopNumber++) {
            if((loopNumber % 3 == 0) && (loopNumber % 5 == 0)) {
                sumofMatches += loopNumber;
                System.out.println("Found a match = " + loopNumber);
            }

            if (counterofMatches == 5) {
                break;
            }
        }

        System.out.println("Sum = " + sumofMatches);


        }
    }


