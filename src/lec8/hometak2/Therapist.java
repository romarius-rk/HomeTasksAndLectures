package lec8.hometak2;

public class Therapist extends Medic {

    public Therapist(int age, String typeMedicine, int experience) {
        super(age, typeMedicine, experience);
    }

    @Override
    public void healing() {
        double luck = Math.random() * 10;
        if (luck < 3) {
            System.out.println("Patient is dead. He's unlucky.");
        } else {
            System.out.println("The patient's disease was successfully treated");
        }
    }

}
