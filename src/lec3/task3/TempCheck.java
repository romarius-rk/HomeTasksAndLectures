package lec3.task3;

public class TempCheck {
    public void check (int temp){
        if (temp > -5){
            System.out.println("Тепло.");
        } else if (temp > - 20) {
            System.out.println("Нормально.");
        } else {
            System.out.println("Холодно.");
        }
    }
}
