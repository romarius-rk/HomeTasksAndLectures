package lec3.task9;

/*
Вывести 10 первых чисел последовательности 0, -5,-10,-15..
*/
public class OneHundredStepBack {
    public static void main(String[] args) {
        int n = 0;
        for (int i = 1;i != 11; i++){
            System.out.print(n + " ");
            n -= 5;
        }
    }
}
