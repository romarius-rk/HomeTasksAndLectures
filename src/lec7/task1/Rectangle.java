package lec7.task1;

import commons.PointTwoDem;
import commons.Vector2Tools;

public class Rectangle implements Figure {
    private final PointTwoDem aPoint;
    private final PointTwoDem bPoint;
    private final PointTwoDem cPoint;
    private final PointTwoDem dPoint;
    private final boolean square;

    public Rectangle(PointTwoDem aPoint, PointTwoDem bPoint, PointTwoDem cPoint, PointTwoDem dPoint) {

        if (!isRectangle(aPoint, bPoint, cPoint, dPoint)) {
            throw new IllegalArgumentException("It's not a rectangle!");
        }

        this.aPoint = aPoint;
        this.bPoint = bPoint;
        this.cPoint = cPoint;
        this.dPoint = dPoint;

        this.square = isSquareCheck();
    }

    private boolean isRectangle(PointTwoDem aPoint, PointTwoDem bPoint, PointTwoDem cPoint, PointTwoDem dPoint) {

        double check = 0;

        check += Vector2Tools.vectorCos(aPoint, bPoint, cPoint);
        check += Vector2Tools.vectorCos(bPoint, cPoint, dPoint);
        check += Vector2Tools.vectorCos(cPoint, dPoint, aPoint);
        check += Vector2Tools.vectorCos(dPoint, aPoint, bPoint);

        return check == 0;
    }

    private boolean isSquareCheck() {
        double aSide = Vector2Tools.vectorLength(aPoint, bPoint);
        double bSide = Vector2Tools.vectorLength(bPoint, cPoint);
        double cSide = Vector2Tools.vectorLength(cPoint, dPoint);
        double dSide = Vector2Tools.vectorLength(dPoint, aPoint);

        return (aSide == bSide) && (bSide == cSide) && (cSide == dSide) && (dSide == aSide);
    }

    @Override
    public double calculatePerimeter() {

        return Vector2Tools.vectorLength(aPoint, bPoint) +
                Vector2Tools.vectorLength(bPoint, cPoint) +
                Vector2Tools.vectorLength(cPoint, dPoint) +
                Vector2Tools.vectorLength(dPoint, aPoint);
    }

    @Override
    public double calculateSquare() {

        return Vector2Tools.vectorLength(aPoint, bPoint) * Vector2Tools.vectorLength(bPoint, cPoint);
    }

    public boolean isSquare(){
        return square;
    }
}
