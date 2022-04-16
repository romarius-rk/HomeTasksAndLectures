package lec4.task6;

import commons.ArrayStartTools;
import commons.CmdReader;

import java.util.Arrays;

/*Создайте массив и заполните массив.
Выведите массив на экран в строку.
Замените каждый элемент с нечётным индексом на ноль.
Снова выведете массив на экран на отдельной строке.
*/
public class Task6 {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        ArrayStartTools arrayTools = new ArrayStartTools();
        int number = reader.readInt("Enter an array length. ");
        int[] array = arrayTools.generateRandomArray(number);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayTools.replaceWithZeroOnEvenIndex(array)));
    }
}
