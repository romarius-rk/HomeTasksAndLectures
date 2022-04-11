package lec3.dopTask3;

/*
Напишите программу, которая выводит на консоль таблицу умножения.
 */
public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++){
            for (int n = 1; n <= 10; n++) {
                System.out.print( i + "*" + n + "=" + (i*n) + " ");
            }
            System.out.println(" ");
        }
    }
}
