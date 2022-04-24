package lec7.task2;

public class Accountant implements Employee {

    String titleEmploy;

    public Accountant(String titleEmploy) {
        this.titleEmploy = titleEmploy;
    }

    @Override
    public void printTitleEmploy() {
        System.out.println(titleEmploy);
    }
}
