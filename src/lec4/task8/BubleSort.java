package lec4.task8;

import commons.ArrayStartTools;
import commons.CmdReader;

public class BubleSort {
    public static void main(String[] args) {
        ArrayStartTools arrayTools = new ArrayStartTools();
        CmdReader reader = new CmdReader();
        int[] array = arrayTools.generateRandomArray(reader.readInt("Enter array length. "));
        int direction = reader.readInt("Enter direction (1 or -1).");
        while (direction != 1 && direction != -1){
            direction = reader.readInt("Enter direction (1 or -1).");
        }
        arrayTools.arrayPrint(array);
        arrayTools.arrayPrint(arrayTools.bubbleSort(array,direction));
    }
}
