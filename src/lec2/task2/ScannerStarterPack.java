package lec2.task2;

import java.util.Scanner;

public class ScannerStarterPack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Sir, how do I address you? ");

        String str = scan.nextLine();

        System.out.println("Hello, " + str + ". It's nice to see you in good spirits.");
    }
}

