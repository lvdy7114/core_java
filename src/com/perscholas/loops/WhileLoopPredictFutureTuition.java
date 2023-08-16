package com.perscholas.loops;

public class WhileLoopPredictFutureTuition {
    public static void main(String[] args) {
        double initialTuition = 10000d;
        double finalTuition = 20000d;

        double tuition = initialTuition;
        int years = 0;

        while (tuition < finalTuition) {
            tuition *= 1.07;
            years++;
        }

        System.out.println("It takes " + years + " years for tuition to double.");
    }
}
