package lec8.hometask2;

public abstract class Medic implements Healing {
    private int age;
    private String typeMedicine;
    private int experience;

    public Medic (int age, String typeMedicine, int experience){
        this.age = age;
        this.typeMedicine = typeMedicine;
        this.experience = experience;
    }

    @Override
    public abstract void healing();
}
