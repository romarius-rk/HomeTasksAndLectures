package lec7.task2;

public class Worker implements Employee {

    String titleEmploy;

    public Worker(String titleEmploy) {
        this.titleEmploy = titleEmploy;
    }

    @Override
    public void printTitleEmploy() {
        System.out.println(titleEmploy);
    }
}
