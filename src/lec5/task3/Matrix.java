package lec5.task3;

import commons.ArrayStartTools;
import commons.CmdReader;

public class Matrix {
    public static void main(String[] args) {
        ArrayStartTools arrayTools = new ArrayStartTools();
        CmdReader reader = new CmdReader();
        int i = reader.readInt("Введите высоту первой матрицы (длинну 2-ой матрицы).");
        int j = reader.readInt("Введите высоту второй матрицы (длинну 1-ой матрицы).");
        int[][] array = arrayTools.twoDemArrayInit(i,j);
        int[][] array1 = arrayTools.twoDemArrayInit(j,i);
        arrayTools.arrayPrint(array);
        System.out.println();
        arrayTools.arrayPrint(array1);
        System.out.println();

        arrayTools.arrayPrint(arrayTools.matrixUtil(array,array1));
    }
}
