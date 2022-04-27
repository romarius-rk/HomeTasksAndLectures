package lec8.lecture.task2.vihecles;

import lec8.lecture.task2.details.Engine;
import lec8.lecture.task2.profession.Driver;

public class Car {
    private String type;
    private String carClass;
    private int carMass;
    private Driver driver;
    private Engine engine;

    public Car(String type, String carClass, int carMass, Driver driver, Engine engine) {
        this.type = type;
        this.carClass = carClass;
        this.carMass = carMass;
        this.driver = driver;
        this.engine = engine;
    }

    public void start(){
        System.out.println("wroom wroom");
    }

    public void stop(){
        System.out.println("is it white smoke?");
    }

    public void turnRight(){
        System.out.println("yep it's right");
    }

    public void turnLeft(){
        System.out.println("nope it's not right");
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getCarMass() {
        return carMass;
    }

    public void setCarMass(int carMass) {
        this.carMass = carMass;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
