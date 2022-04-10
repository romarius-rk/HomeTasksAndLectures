package lec3.task2;

import lec3.task1.CmdReader;

public class ParityCheckRunner {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        String msg = reader.read("Введите число");
        int num = Integer.parseInt(msg);

        ParityCheck parityCheckCalculator = new ParityCheck();
        parityCheckCalculator.parityCheckCalculator(num);

    }
}
