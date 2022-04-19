package lec5.task5;

import commons.ArrayStartTools;
import commons.CmdReader;

public class Diagonal {
    public static void main(String[] args) {
        ArrayStartTools arrayTools = new ArrayStartTools();
        CmdReader reader = new CmdReader();
        int i = reader.readInt("Введите длинну стороны квадратного массива.");
        int j = i;
        int[][] array = arrayTools.twoDemArrayInit(i,j);
        arrayTools.arrayPrint(array);
        System.out.println();

        arrayTools.printArrayDiagonal(array);
    }
}
