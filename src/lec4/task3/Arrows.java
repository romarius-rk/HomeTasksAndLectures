package lec4.task3;

/*
Создайте и заполните массив случайным числами и выведете
максимальное, минимальное и среднее значение.
Для генерации случайного числа используйте метод Math.random().
Пусть будет возможность создавать массив произвольного размера.
Пусть размер массива вводится с консоли.
*/

import commons.ArrayStartTools;
import commons.CmdReader;

public class Arrows {
    public static void main(String[] args) {
        ArrayStartTools array = new ArrayStartTools();
        CmdReader reader = new CmdReader();
        int[] oneDemArray = array.generateRandomArray(reader.readInt("Введите длинну массива: "));
        array.arrayPrint(oneDemArray);
        System.out.printf("Минимальный элемент массива равен %d%n", array.arrayMin(oneDemArray));
        System.out.printf("Максимальный элемент массива равен %d%n", array.arrayMax(oneDemArray));
        System.out.printf("Среднее значение массива равно %f%n", array.arrayMid(oneDemArray));
    }
}
