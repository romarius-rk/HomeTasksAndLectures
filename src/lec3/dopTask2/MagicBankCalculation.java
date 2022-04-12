package lec3.dopTask2;

public class MagicBankCalculation {
    public void bankCalculator (float deposit, float percent, int duration){
        for (int i = 1; i <= duration; i++) {
            if (deposit == 0){
                System.out.println("Милорд, казна пуста и владывать нам нечего.");
                break;
            } else if (deposit < 0){
                System.out.println("Милорд, государство в долгах. Прикажите казнить министра финансов?");
                break;
            }
            deposit = deposit + (deposit * (percent / 100));
        }
        System.out.println("конечная сумма депозита составит " + deposit);
    }
}
