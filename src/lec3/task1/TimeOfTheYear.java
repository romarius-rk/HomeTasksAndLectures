package lec3.task1;

import commons.CmdReader;

/*
1. Написать программу для вывода названия поры года по номеру
месяца.
При решении используйте оператор switch-case.
2. Написать программу для вывода названия поры года по номеру
месяца.
При решении используйте оператор if-else-if.
*/
public class TimeOfTheYear {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        int choice = reader.readInt("Выберите метод ветвления Switch(1) или If Else(2). ");
        int num = reader.readInt("Введите номер месяца.");

        SeasonCalculator seasonCalculator = new SeasonCalculator();
        if (choice == 1) {
            seasonCalculator.seasonSwitch(num);
        } else if (choice == 2) {
            seasonCalculator.seasonIfElseIf(num);
        }
    }
}
