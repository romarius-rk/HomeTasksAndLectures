package lec7.task2;

/*
* Создать классы "Директор", "Рабочий", "Бухгалтер".
Реализовать интерфейс с методом, который печатает название
должности и имплементировать этот метод в созданные классы.
* */

public class Runner {
    public static void main(String[] args) {
        Director director = new Director("Technical director.");
        Worker worker = new Worker("Just worker.");
        Accountant accountant = new Accountant("Support accountant.");

        director.printTitleEmploy();
        accountant.printTitleEmploy();
        worker.printTitleEmploy();
    }
}
