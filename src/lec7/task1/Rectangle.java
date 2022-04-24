package lec7.task1;

import commons.PointTwoDem;
import commons.TwoDemVector;

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

        check += TwoDemVector.vectorCos(aPoint, bPoint, cPoint);
        check += TwoDemVector.vectorCos(bPoint, cPoint, dPoint);
        check += TwoDemVector.vectorCos(cPoint, dPoint, aPoint);
        check += TwoDemVector.vectorCos(dPoint, aPoint, bPoint);

        return check == 0;
    }

    private boolean isSquareCheck() {
        double aSide = TwoDemVector.vectorLength(aPoint, bPoint);
        double bSide = TwoDemVector.vectorLength(bPoint, cPoint);
        double cSide = TwoDemVector.vectorLength(cPoint, dPoint);
        double dSide = TwoDemVector.vectorLength(dPoint, aPoint);

        return (aSide == bSide) && (bSide == cSide) && (cSide == dSide) && (dSide == aSide);
    }

    @Override
    public double calculatePerimeter() {

        return TwoDemVector.vectorLength(aPoint, bPoint) +
                TwoDemVector.vectorLength(bPoint, cPoint) +
                TwoDemVector.vectorLength(cPoint, dPoint) +
                TwoDemVector.vectorLength(dPoint, aPoint);
    }

    @Override
    public double calculateSquare() {

        return TwoDemVector.vectorLength(aPoint, bPoint) * TwoDemVector.vectorLength(bPoint, cPoint);
    }

    public boolean isSquare(){
        return square;
    }
}
