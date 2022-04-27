package lec8.lecture.task2.profession;

import lec8.lecture.task2.common.Person;

public class Driver extends Person {
    double drivingExperience;

    public Driver(String secName, String firName, String fathName, double drivingExperience){
        super.secName = secName;
        super.firName = firName;
        super.fatherName = fathName;
        this.drivingExperience = drivingExperience;
    }

    @Override
    public void printFIO(String secName, String firName, String fatherName) {
        super.printFIO(secName, firName, fatherName);
    }
}
