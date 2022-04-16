package commons;

import java.util.Arrays;

public class ArrayStartTools {
    public int[] arrayInit(int length) {
        int[] arrayRandom = new int[length];
        for (int i = 0; i < length; i++) {
            arrayRandom[i] = randomNumber(-20, 20);
        }
        return arrayRandom;
    }

    public void arrayPrint(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public boolean arrayChecker(int enteredNumber, int[] array) {
        boolean found = false;

        for (int i = 0; i < array.length; i++) {
            if (enteredNumber == array[i]) {
                found = true;
            }
        }
        return found;
    }

    public int[] arrayNumberDelete(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                array[i] = 0;
            }
        }
        return array;
    }

    public int[] copyIntArray(int[] array) {
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public int[] removeAllFrom(int number, int[] array) {
        int removeCount = 0;
        for (int i : array) {
            if (i == number) {
                removeCount++;
            }
        }
        int[] arrayConverted = new int[array.length - removeCount];
        int g = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                arrayConverted[g] = array[i];
                g++;
            }
        }
        return arrayConverted;
    }

    public int arrayMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= min) {
                continue;
            }
            min = array[i];
        }
        return min;
    }

    public int arrayMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max >= array[i]) {
                continue;
            }
            max = array[i];
        }
        return max;
    }

    public double arrayMid(int[] array) {
        int sum = 0;
        for (int j : array) {
            sum += j;
        }
        return (double) sum / array.length;
    }

    public int[][] twoDemArrayInit(int length, int higth) {
        int[][] twoDemArrayRandom = new int[length][higth];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < higth; j++) {
                twoDemArrayRandom[i][j] = randomNumber(-10, 10);
            }
        }
        return twoDemArrayRandom;
    }

    public void twoDemArrayPrint(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] arrayConverter(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (i % 2 == 1 || j % 2 == 1) {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    public int[] arrayMultipler(int[][] array) {
        int[] oneDemArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            int result = 1;
            for (int j = 0; j < array[i].length; j++) {
                result *= Math.abs(array[i][j]);
            }
            oneDemArray[i] = result;
        }
        return oneDemArray;
    }

    public int arrayMaxIntChecker(int[] oneDemArray) {
        int maxIntCell = 1;
        for (int i = 0; i < oneDemArray.length; i++) {
            if (maxIntCell < oneDemArray[i]) {
                maxIntCell = oneDemArray[i];
            }
        }
        return maxIntCell;
    }

    private int randomNumber(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }
}
