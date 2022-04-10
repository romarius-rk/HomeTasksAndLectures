package lec3.task1;

public class TimeOfTheYear {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        String mode = reader.read("Выберите метод ветвления Switch(1) или If Else(2). ");
        int choice = Integer.parseInt(mode);
        String numOfMonthStr = reader.read("Введите номер месяца.");
        Integer num = Integer.valueOf(numOfMonthStr);

        SeasonCalculator seasonCalculator = new SeasonCalculator();
        if (choice == 1) {
            seasonCalculator.seasonSwitch(num);
        } else if (choice == 2) {
            seasonCalculator.seasonIfElseIf(num);
        }
    }
}
