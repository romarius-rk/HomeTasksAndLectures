package lec3.task2;

public class ParityCheck {
    public void parityCheckCalculator(int num) {
        int parityCheck = num % 2;
        if (parityCheck != 0) {
            System.out.println("Ваше число нечётное.");
        } else {
            System.out.println("Ваше число чётное.");
        }
    }
}
