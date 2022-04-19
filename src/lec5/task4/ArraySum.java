package lec5.task4;

import commons.ArrayStartTools;
import commons.CmdReader;

public class ArraySum {
    public static void main(String[] args) {
        ArrayStartTools arrayTools = new ArrayStartTools();
        CmdReader reader = new CmdReader();
        int i = reader.readInt("Введите длинну массива.");
        int j = reader.readInt("Введите ширину массива.");
        int[][] array = arrayTools.twoDemArrayInit(i,j);
        arrayTools.arrayPrint(array);
        System.out.println();

        System.out.println(arrayTools.sumElemArray(array));
    }
}
