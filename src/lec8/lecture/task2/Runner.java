package lec8.lecture.task2;

import lec8.lecture.task2.details.Engine;
import lec8.lecture.task2.profession.Driver;
import lec8.lecture.task2.vihecles.Car;

import java.util.Date;

public class Runner {
    public static void main(String[] args) {

        Driver driver = new Driver("Иванов", "Иван", "Иванович", 4.5);
        Driver driver1 = new Driver("Иванов", "Иван", "Иванович", 40.1);

        Car gruzovic = new Car("volvo","A",15000, driver, new Engine(457, 9000));
        Car sportCar = new Car("Mazerati","SSS",1800, driver1, new Engine(500, 6078));


    }
}
