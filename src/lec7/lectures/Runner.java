package lec7.lectures;

import commons.CmdReader;

public class Runner {
    public static void main(String[] args) {
        CmdReader reader = new CmdReader();
        int temper = reader.readInt("Enter temperature on the board.");

        String varType = reader.read("Enter 'k' or 'f'.");

        TypeDegreesList type = getType(varType);

        convert(type, temper);

    }

    private static TypeDegreesList getType(String varType) {
        TypeDegreesList type;
        switch (varType) {
            case "k":
                type = TypeDegreesList.KELVIN;
                break;
            case "f":
                type = TypeDegreesList.FAHRENHEIT;
                break;
            case "r":
                type = TypeDegreesList.REAUMUR;
                break;
            default:
                type = TypeDegreesList.CELSIUS;
                break;
        }
        return type;
    }

    private static void convert(TypeDegreesList type, int temper) {
        switch (type) {
            case KELVIN:
                CelsiusToKelvin ctk = new CelsiusToKelvin();
                ctk.convert(temper);
                break;
            case FAHRENHEIT:
                CelsiusToFahrenheit ctf = new CelsiusToFahrenheit();
                ctf.convert(temper);
                break;
            default:
                System.out.println("I told u k or f");
                break;
        }
    }
}
