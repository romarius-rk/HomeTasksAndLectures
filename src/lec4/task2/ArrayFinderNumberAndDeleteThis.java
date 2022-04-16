package lec4.task2;

import commons.ArrayStartTools;
import commons.CmdReader;

import java.util.Arrays;

public class ArrayFinderNumberAndDeleteThis {

    /*
      Создайте массив целых чисел. Удалите все вхождения заданного
числа из массива.
Пусть число задается с консоли (класс Scanner). Если такого числа нет -
выведите сообщения об этом.
В результате должен быть новый массив без указанного числа.
    */

    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        ArrayStartTools oneDemArray = new ArrayStartTools();
        int[] array = oneDemArray.generateRandomArray(reader.readInt("Enter length array pls: "));
        oneDemArray.arrayPrint(array);
        int number = reader.readInt("Enter the number we are looking for: ");
        if (oneDemArray.arrayChecker(number, array)) {
            System.out.println(Arrays.toString(oneDemArray.removeAllFrom(number, array)));
        } else {
            System.out.println("Entered number not found");
        }
    }
}
