package lec6.lecture;

public class VectorCalculator {
    private double x;
    private double y;
    private double z;

    public VectorCalculator() {
        this.x = 5;
        this.y = 2.5;
        this.z = 3.75;
    }

    public VectorCalculator(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double vectorLength(double x, double y, double z) {
        return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
    }

    public double vectorLength() {
        return Math.sqrt((Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)));
    }

    public double scolyarProizved(VectorCalculator vectorCalculator1) {
        return vectorCalculator1.x * x + vectorCalculator1.y * y + vectorCalculator1.z * z;
    }

    public double[] vectorProizved (VectorCalculator vectorCalculator1){
        double[] xyz = new double[3];
        xyz[0] = y*vectorCalculator1.z - z*vectorCalculator1.y;
        xyz[1] = z*vectorCalculator1.x - x*vectorCalculator1.z;
        xyz[2] = x*vectorCalculator1.y - y*vectorCalculator1.x;
        return xyz;
    }
}
