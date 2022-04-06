package lec3.study;

public class Switch {

    public static void main(String[] args) {
        int num = 3;
        //for (int num = 0; num < 4; num++)
        switch (num){
            case 0 :
                System.out.println("Вы ввели 0");
                break;
            case 1 :
                System.out.println("Вы ввели 1");
                break;
            case 2 :
            case 3 :
                System.out.println("Вы ввели 2 или 3");
                break;
        }
    }
}
