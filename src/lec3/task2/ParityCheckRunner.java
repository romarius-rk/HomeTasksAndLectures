package lec3.task2;

import commons.CmdReader;

/*
Напишите программу, которая будет принимать на вход число и на
выход будет выводить сообщение четное число или нет.
Для определения четности числа используйте операцию получения
остатка от деления - операция выглядит так: '% 2').
*/
public class ParityCheckRunner {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        String msg = reader.read("Введите число");
        int num = Integer.parseInt(msg);

        ParityCheck parityCheckCalculator = new ParityCheck();
        parityCheckCalculator.parityCheckCalculator(num);

    }
}
