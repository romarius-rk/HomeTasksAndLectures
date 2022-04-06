package lec3.study;

public class Factorial {
    public static void main(String[] args) {
        int num = 1;
        int cnt = 1;
        for ( ; cnt <= 10; cnt++){
            num = num * cnt;
            System.out.println(cnt + " значение факториала равно " + num);
        }
        cnt = 1;
        while (cnt <=10){
            num = num * cnt;
            System.out.println(cnt + " значение факториала равно " + num);
            cnt++;
        }
        cnt = 1;
        do {
            num = num * cnt;
            System.out.println(cnt + " значение факториала равно " + num);
            cnt++;
        } while (cnt <= 10);
    }
}
