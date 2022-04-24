package commons;

public class TwoDemVector {

    public static double vectorLength(PointTwoDem p1, PointTwoDem p2) {
        return Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
    }

    public static double vectorCos(PointTwoDem a, PointTwoDem b,
                                   PointTwoDem c) {
        double scale = Math.pow(10, 5);
        return Math.round(((Math.pow(vectorLength(a,b),2)+ Math.pow(vectorLength(b,c),2)- Math.pow(vectorLength(a,c),2))/
                (2*vectorLength(a,b)*vectorLength(b,c)))*scale)/scale;
    }
}
