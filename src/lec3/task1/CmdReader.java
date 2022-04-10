package lec3.task1;

import java.util.Scanner;

public class CmdReader {
    public String read(String msg) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(msg);
        return scanner.nextLine();
    }
}
