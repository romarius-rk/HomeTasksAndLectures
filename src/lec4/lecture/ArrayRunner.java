package lec4.lecture;

import commons.CmdReader;

import java.util.Arrays;

public class ArrayRunner {
    public static void main(String[] args) {
        int n = 10;
        int[] arrCaptan = new int[n];
        for (int i = 0; i < n; i++){
            arrCaptan[i] = (int) (Math.random()*10);
        }
        System.out.println(Arrays.toString(arrCaptan));
        System.out.println(" ");
        CmdReader reader = new CmdReader();
        int someNumber = reader.readInt("Enter number");
        arrChecker(someNumber, arrCaptan);
        shift(arrCaptan,someNumber);
        System.out.println(Arrays.toString(arrCaptan));
    }

    public static void arrChecker(int someNumber, int[] arrCaptan) {
        boolean found = false;

        for (int i = 0; i < arrCaptan.length; i++) {
            if (someNumber == arrCaptan[i]) {
                System.out.println(" Index " + i);
                found = true;
            }
        }
        if (!found) {
            System.out.println("404 not found");
        }
    }

    public static void shift (int[] array, int num){
        int counter = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] == num) {
                counter++;
                for (int n = i;n <array.length; n++){
                    if (n + 1 >= array.length) continue;
                    array[n] = array[n+1];
                }
            }
        }
        for (int i = array.length - 1; i >= array.length - counter; i--){
            array[i] = 0;
        }
    }

}