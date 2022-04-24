package lec7.lectures;

public class CelsiusToKelvin implements Converter {

    private final double kelvinConst = 273.15;

    public CelsiusToKelvin() {

    }

    @Override
    public void convert(double cd) {
        double kd = cd + kelvinConst;
        System.out.printf("%f радусов Цельсия = %f градусов Кельвина.", cd, kd);
    }
}
