package lec3.task7;

import commons.CmdReader;

/*
Напишите программу, где пользователь вводит любое целое
положительное число. А программа суммирует все числа от 1 до
введенного пользователем числа.
Для ввода числа воспользуйтесь классом Scanner.
*/
public class SummOfNumbers {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        int n = reader.readInt("Enter your number.");
        int summ = 0;
        for (int i = 1; i <= n; i++) {
            summ +=  i;
        }
        System.out.println("Sum is " + summ);
    }
}
