package lec4.task1;

import commons.ArrayStartTools;
import commons.CmdReader;

import java.util.Arrays;

public class ArrayCheck {
    public static void main(String[] args) {
        ArrayStartTools arrayInit = new ArrayStartTools();
        CmdReader reader = new CmdReader();
        int[] array = arrayInit.arrayInit(reader.readInt("Какова длинна нашего массива, Милорд?"));
        int enteredNumber = reader.readInt("Какое число ищем, Милорд? ");
        boolean status = arrayInit.arrayChecker(enteredNumber, array);
        if (status) {
            System.out.println("Какое счастье, Милорд, мы нашли это число. ");
        } else {
            System.out.println("Милорд, в нашем распоряжении нет таких чисел. ");
        }
        System.out.println("А вот и наш массив " + Arrays.toString(array));
    }
}
