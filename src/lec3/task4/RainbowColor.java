package lec3.task4;

public class RainbowColor {
    public void check (int colorNum){
        switch (colorNum) {
            case 1 :
                System.out.println("Красный.");
                break;
            case 2 :
                System.out.println("Оранжевый.");
                break;
            case 3 :
                System.out.println("Жёлтый.");
                break;
            case 4 :
                System.out.println("Зелёный.");
                break;
            case 5 :
                System.out.println("Голубой.");
                break;
            case 6 :
                System.out.println("Синий.");
                break;
            case 7 :
                System.out.println("Фиолетовый.");
                break;
            default:
                System.out.println("В радуге всего 7 цветов, Дружочек;)");
                break;
        }
    }
}
