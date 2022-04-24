package lec7.task2;

public class Director implements Employee {

    String titleEmploy;

    public Director(String titleEmploy) {
        this.titleEmploy = titleEmploy;
    }

    @Override
    public void printTitleEmploy() {
        System.out.println(titleEmploy);
    }
}
