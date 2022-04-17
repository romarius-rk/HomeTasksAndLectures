package lec5.task6;

import commons.ArrayStartTools;
import commons.CmdReader;

/*Создайте двумерный массив целых чисел. Отсортируйте элементы в
строках двумерного массива по возрастанию.*/
public class TwoDemArraySort {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        ArrayStartTools arrayTools = new ArrayStartTools();
        int length = reader.readInt("Enter array length and high.");
        int high = reader.readInt("");
        int direction = reader.readInt("Enter sort direction");
        while (direction != 1 && direction != -1) {
            direction = reader.readInt("Enter direction (1 or -1).");
        }
        int[][] array = arrayTools.twoDemArrayInit(length, high);
        twoDemArraySort(array, direction);
    }

    public static void twoDemArraySort(int[][] array, int direction) {
        ArrayStartTools startTools = new ArrayStartTools();
        for (int i = 0; i < array.length; i++) {
            startTools.bubbleSort(array[i], direction);
        }
        startTools.arrayPrint(array);
    }
}

