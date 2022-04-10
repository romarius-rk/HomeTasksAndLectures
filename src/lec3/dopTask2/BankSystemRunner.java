package lec3.dopTask2;

/*
За каждый месяц банк начисляет к сумме вклада 7% от суммы.
Напишите программу, в которую пользователь вводит сумму вклада и
количество месяцев. А банк вычисляет конечную сумму вклада с учетом
начисления процентов за каждый месяц.
Для вычисления суммы с учетом процентов используйте цикл for. Пусть сумма вклада будет представлять тип float.
*/

import commons.CmdReader;

public class BankSystemRunner {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        float bankDeposit = reader.readFlot("Введите текущую сумму вклада.");
        float bankPersent = reader.readFlot("Введите процент по вашему вкладу.");
        int bankDurationDeposit = reader.readInt("Введите срок на который сделан вклад (в месяцах).");

        MagicBankCalculation endDeposit = new MagicBankCalculation();
        endDeposit.bankCalculator(bankDeposit,bankPersent,bankDurationDeposit);
    }
}
