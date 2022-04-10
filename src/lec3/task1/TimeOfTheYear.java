package lec3.task1;

import java.util.Scanner;

public class TimeOfTheYear {
    public static void main(String[] args) {
        Scanner numOfMonth = new Scanner(System.in);
        Scanner switchOrIf = new Scanner(System.in);
        System.out.println("Выберите метод ветвления Switch(1) или If Else(2). ");
        String str2 = switchOrIf.nextLine();
        int choice = Integer.parseInt(str2);
        System.out.println("Введите номер месяца");
        String str = numOfMonth.nextLine();
        Integer num = Integer.valueOf(str);

        if (choice == 1) {
            stich(num);
        }
         else if (choice == 2) {
             toBeOrNotToBe(num);
        }
    }
    public static void stich (Integer num){
        switch (num){
            case 12 :
            case 1 :
            case 2 :
                System.out.println("На дворе зима, Милорд. Одевайтесь теплее.");
                break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("За окном весна, Милорд. Готовте ваших крестьян к посевной.");
                break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("Лето, Милорд. Ваш летний дворец приведён в подобающий вид и ждёт вас.");
                break;
            case 9 :
            case 10:
            case 11:
                System.out.println("Крестьяне собирают осенний урожай, Милорд. Натуральный оброк уже доставили на вашу усадьбу.");
                break;
            default :
                System.out.println("В году всего 12 месяцев, Милорд.");
                break;

        }
    }
    public static void toBeOrNotToBe (Integer num){
        if (num < 3 || num == 12){
            System.out.println("На дворе зима, Милорд. Одевайтесь теплее.");
        }
        else if ( num < 6){
            System.out.println("За окном весна, Милорд. Готовте ваших крестьян к посевной.");
        }
        else if ( num < 9){
            System.out.println("Лето, Милорд. Ваш летний дворец приведён в подобающий вид и ждёт вас.");
        }
        else if ( num < 12){
            System.out.println("Крестьяне собирают осенний урожай, Милорд. Натуральный оброк уже доставили на вашу усадьбу.");
        }
        else {
            System.out.println("В году всего 12 месяцев, Милорд.");
        }
    }
}
