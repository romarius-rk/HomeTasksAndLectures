package lec3.dopTask1;

/*
Выведите на экран первые 11 членов последовательности Фибоначчи.
*/
public class FibonachiCounterRunner {
    public static void main(String[] args) {
        int [] fibanachi = new int [11];
        fibanachi [0] = 0;
        fibanachi [1] = 1;
        for (int i = 2; i < fibanachi.length; i++) {
            fibanachi [i] = fibanachi [i-1] + fibanachi [i-2];
        }
        System.out.print("Первые 11 чисел фибаначи: ");
        for (int i = 0; i < 11; i++) System.out.print(fibanachi[i] + " ");
    }
}
