package lec3.task4;

import commons.CmdReader;

/*
По введенному номеру определить цвет радуги (1 –
красный, 4 – зеленый и т. д.).
*/
public class RainbowColorRunner {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        int color = reader.readInt("Введи цифру и будет радужная магия))))");
        RainbowColor rainbowColor = new RainbowColor();
        rainbowColor.check(color);
    }
}
