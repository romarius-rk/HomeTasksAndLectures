package lec3.task8;

/*
Необходимо, чтоб программа выводила на экран вот такую
последовательность:
7 14 21 28 35 42 49 56 63 70 77 84 91 98.
В решении используйте цикл while.
*/
public class SevenRevenge {
    public static void main(String[] args) {
        int sevens = 0;
        System.out.println("Числа кратные 7 от 0 до 100");
        while (sevens !=98){
            sevens += 7;
            System.out.print(sevens + " ");
        }
    }
}
