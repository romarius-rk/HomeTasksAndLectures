package commons;

import java.util.Arrays;

public class ArrayStartTools {
    public int[] arrayInit (int length) {
        int[] arrayRandom = new int[length];
        for (int i = 0; i < length; i++) {
            arrayRandom[i] = randomNumber(0,10);
        }
        return arrayRandom;
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

    public int[][] twoDemArrayInit (int length, int higth){
        int[][] twoDemArrayRandom = new int[length][higth];
        for (int i = 0; i < length; i++){
            for (int j = 0; j < higth; j++){
                twoDemArrayRandom[i][j] = randomNumber(1,10);
            }
        }
        return twoDemArrayRandom;
    }

    public void twoDemArrayPrint (int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int[][] arrayConverter (int[][] array) {
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                if (i % 2 == 1 || j % 2 == 1){
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    public int[] arrayMultipler (int[][] array){
        int[] oneDemArray =new int[array.length];
        for (int i = 0; i < array.length; i++){
            int result = 1;
            for (int j = 0; j < array[i].length; j++){
                result *= Math.abs(array[i][j]);
            }
            oneDemArray[i]  = result;
        }
        return oneDemArray;
    }

    public int arrayMaxIntChecker (int[] oneDemArray){
        int maxIntCell = 1;
        for (int i = 0; i < oneDemArray.length; i++){
            if (maxIntCell < oneDemArray[i]){
                maxIntCell = oneDemArray[i];
            }
        }
        return maxIntCell;
    }
    private int randomNumber (int min, int max){
        return (int) (Math.random()*(max - min) + min);
    }
}
