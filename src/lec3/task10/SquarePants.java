package lec3.task10;

/*
Составьте программу, выводящую на экран квадраты чисел от 10 до 20
включительно.
*/
public class SquarePants {
    public static void main(String[] args) {
        for (int i = 10; i != 21; i++) {
            System.out.println("Квадрат числа " + i + " равен " + (int) Math.pow(i, 2));
        }
    }
}
