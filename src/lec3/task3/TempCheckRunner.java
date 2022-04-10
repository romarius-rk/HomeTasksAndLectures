package lec3.task3;

import commons.CmdReader;

/*
Для введенного числа t (температура на улице) вывести
Если t>–5, то вывести «Тепло».
Если –5>= t > –20, то вывести «Нормально».
Если –20>= t, то вывести «Холодно».
*/
public class TempCheckRunner {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        int temp = reader.readInt("Какая сейчас температура за бортом? ");

        TempCheck tempCheck = new TempCheck();
        tempCheck.check(temp);
    }
}
