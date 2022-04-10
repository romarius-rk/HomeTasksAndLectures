package lec3.task5_6;

/*
1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
При решении используйте операцию инкремента (++).
2. Необходимо вывести на экран числа от 5 до 1.
При решении используйте операцию декремента (--).
*/
public class Enumeration {
    public static void main(String[] args) {
        System.out.println("Cписок нечётных чисел от 1 до 99:");
        for (int i = 1; i < 100; i++) {
            if (i % 2 > 0) {
                System.out.println(i);
            }
        }
        System.out.println("Обратный отсчёт пошёл.");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
    }
}
