package lec4.task7;

import commons.ArrayStartTools;
import commons.CmdReader;

public class NameSort {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        ArrayStartTools arrayTools = new ArrayStartTools();
        String[] nameList = new String[5];
        int direction = reader.readInt("Enter direction (1 or -1).");
        while (direction != 1 && direction != -1){
            direction = reader.readInt("Enter direction (1 or -1).");
        }
        for (int i = 0; i < nameList.length; i++) {
            String name = reader.read("Enter your name.");
            nameList[i] = name;
        }
        arrayTools.arrayPrint(arrayTools.bubbleSort(nameList,direction));
    }
}
