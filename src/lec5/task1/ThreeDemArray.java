package lec5.task1;

import commons.ArrayStartTools;
import commons.CmdReader;

import java.util.Arrays;

public class ThreeDemArray {
    public static void main(String[] args) {
        ArrayStartTools arrayTools = new ArrayStartTools();
        CmdReader reader = new CmdReader();
        int length = reader.readInt("Enter length, high and deeps array.");
        int high = reader.readInt("");
        int deeps = reader.readInt("");

        int[][][] array = arrayTools.threeDemArrayInit(length,high,deeps);
        System.out.println(Arrays.deepToString(array));
        int number = reader.readInt("Enter some number.");
        System.out.println(Arrays.deepToString(arrayTools.plusSomeNumberToElemArray(array,number)));
    }
}
