package commons;

import java.util.Scanner;

public class CmdReader {
    public String read(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }

    public int readInt(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return Integer.parseInt(scanner.nextLine());
    }
    public float readFlot(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return Float.parseFloat(scanner.nextLine());
    }
}

