package lec8.hometask2.medics;

import lec8.hometask2.Medic;

public class Surgeon extends Medic {

    public Surgeon(int age, String typeMedicine, int experience) {
        super(age, typeMedicine, experience);
    }

    @Override
    public void healing() {
        double luck = Math.random() * 10;
        if (luck < 3) {
            System.out.println("Patient is dead. He's unlucky.");
        } else {
            System.out.println("The patient's heart was treated successfully");
        }
    }
}