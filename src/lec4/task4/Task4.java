package lec4.task4;

import commons.ArrayStartTools;
import commons.CmdReader;

/*Создайте 2 массива из 5 чисел.
Выведите массивы на консоль в двух отдельных строках.
Посчитайте среднее арифметическое элементов каждого массива и
сообщите, для какого из массивов это значение оказалось больше (либо
сообщите, что их средние арифметические равны).
Дополнительное задание*/
public class Task4 {
    public static void main(String[] args) {
        ArrayStartTools arrayTools = new ArrayStartTools();
        CmdReader reader = new CmdReader();
        int length = reader.readInt("Enter arrays length. ");
        int[] arrayOne = arrayTools.generateRandomArray(length);
        int[] arrayTwo = arrayTools.generateRandomArray(length);
        arrayTools.arrayPrint(arrayOne);
        arrayTools.arrayPrint(arrayTwo);
        calculator(arrayOne,arrayTwo);
    }

    public static void calculator(int[] arrayOne, int[] arrayTwo) {
        int arithmeticMeanOne = 0;
        int arithmeticMeanTwo = 0;
        for (int i : arrayOne) {
            arithmeticMeanOne += i;
        }
        arithmeticMeanOne = arithmeticMeanOne / arrayOne.length;
        for (int i : arrayTwo) {
            arithmeticMeanTwo += i;
        }
        arithmeticMeanTwo = arithmeticMeanTwo / arrayOne.length;
        if (arithmeticMeanOne > arithmeticMeanTwo) {
            System.out.println("Еhe arithmetic mean of the first array is greater. ");
        } else {
            System.out.println("Еhe arithmetic mean of the second array is greater. ");
        }
    }


}
