package lec4.task5;

/*
Создайте массив из n случайных целых чисел и выведите его на экран.
Размер массива пусть задается с консоли и размер массива может быть
больше 5 и меньше или равно 10.
Если n не удовлетворяет условию - выведите сообщение об этом.
Если пользователь ввёл не подходящее число, то программа должна
просить пользователя повторить ввод.
Создайте второй массив только из чётных элементов первого массива,
если они там есть, и вывести его на экран.
 */

import commons.ArrayStartTools;
import commons.CmdReader;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        ArrayStartTools arrayTools = new ArrayStartTools();
        int number = reader.readInt("Enter array length. ");
        while (number <= 5 || number > 10){
            System.out.println("Entered number is wrong. number <= 5 or number > 10 ");
            number = reader.readInt("Enter array length. ");
        }
        int[] array = arrayTools.generateRandomArray(number);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(arrayTools.removeOddFrom(array)));
    }
}
