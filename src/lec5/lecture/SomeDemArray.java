package lec5.lecture;

import commons.ArrayStartTools;
import commons.CmdReader;

import java.util.ArrayList;
import java.util.Arrays;

public class SomeDemArray {
    public static void main(String[] args) {

        CmdReader reader = new CmdReader();
        ArrayStartTools arrayRandom = new ArrayStartTools();

        int length = reader.readInt("Введите количествво строк массива. ");
        int higth = reader.readInt("Введите количествво строк массива. ");

        int[][] twoDemArray = arrayRandom.twoDemArrayInit(length,higth);

        arrayRandom.twoDemArrayPrint(twoDemArray);

        System.out.println(Arrays.toString(arrayRandom.arrayMultipler(twoDemArray)));

        System.out.println(arrayRandom.arrayMaxIntChecker(arrayRandom.arrayMultipler(twoDemArray)));


    }
}
