package lec8.lecture.task2.common;

public class Person {
    protected String secName = "";
    protected String firName = "";
    protected String fatherName = "";

    public Person(){

    }

    public Person (String familia, String name, String otchestvo){
        this.secName = familia;
        this.firName = name;
        this.fatherName = otchestvo;

        printFIO(familia, name, otchestvo);
    }

    public void printFIO (String secName, String firName, String fatherName){
        System.out.printf("ФИО пользователя: %s %s %s.", secName, firName, fatherName);
    }
}
