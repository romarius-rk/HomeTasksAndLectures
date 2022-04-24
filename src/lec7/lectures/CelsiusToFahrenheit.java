package lec7.lectures;

public class CelsiusToFahrenheit implements Converter {

    public CelsiusToFahrenheit() {
    }

    @Override
    public void convert(double cd) {
        double fd = cd * 1.8 + 32.0;
        System.out.printf("%f радусов Цельсия = %f градусов Фаренгейта.", cd, fd);
    }
}
