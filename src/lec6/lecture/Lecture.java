package lec6.lecture;

import java.util.Arrays;

public class Lecture {
    public static void main(String[] args) {
        VectorCalculator vectorCalculator = new VectorCalculator();
        System.out.printf("Vector length = %f", vectorCalculator.vectorLength(10,5,3));
        System.out.println();

        VectorCalculator vectorCalculator1 = new VectorCalculator(1.5,2.3,4.32);
        System.out.printf("Vector length = %f", vectorCalculator1.vectorLength());
        System.out.println();

        System.out.printf("Vector scolyarProizved = %f", vectorCalculator.scolyarProizved(vectorCalculator1));
        System.out.println();

        double[] xyz = vectorCalculator.vectorProizved(vectorCalculator1);
        for (double i : xyz) {
            System.out.printf("Vector proizved = %f ", i);
        }
        System.out.println();


    }
}
