package lec3.task1;

public class SeasonCalculator {
    public void seasonSwitch(Integer num) {
        switch (num) {
            case 12:
            case 1:
            case 2:
                System.out.println("На дворе зима, Милорд. Одевайтесь теплее.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("За окном весна, Милорд. Готовте ваших крестьян к посевной.");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето, Милорд. Ваш летний дворец приведён в подобающий вид и ждёт вас.");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Крестьяне собирают осенний урожай, Милорд. Натуральный оброк уже доставили на вашу усадьбу.");
                break;
            default:
                System.out.println("В году всего 12 месяцев, Милорд.");
                break;

        }
    }

    public void seasonIfElseIf(Integer num) {
        if (num < 3 || num == 12) {
            System.out.println("На дворе зима, Милорд. Одевайтесь теплее.");
        } else if (num < 6) {
            System.out.println("За окном весна, Милорд. Готовте ваших крестьян к посевной.");
        } else if (num < 9) {
            System.out.println("Лето, Милорд. Ваш летний дворец приведён в подобающий вид и ждёт вас.");
        } else if (num < 12) {
            System.out.println("Крестьяне собирают осенний урожай, Милорд. Натуральный оброк уже доставили на вашу усадьбу.");
        } else {
            System.out.println("В году всего 12 месяцев, Милорд.");
        }
    }
}
