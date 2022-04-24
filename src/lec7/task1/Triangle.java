package lec7.task1;

import commons.PointTwoDem;
import commons.TwoDemVector;

public class Triangle implements Figure {
    private PointTwoDem aPoint;
    private PointTwoDem bPoint;
    private PointTwoDem cPoint;

    public Triangle(PointTwoDem aPoint, PointTwoDem bPoint, PointTwoDem cPoint) {

        if (!isTtiangle(aPoint, bPoint, cPoint)) {
            throw new IllegalArgumentException("This triangle does not exist!");
        }
        this.aPoint = aPoint;
        this.bPoint = bPoint;
        this.cPoint = cPoint;

    }

    public boolean isTtiangle(PointTwoDem aPoint, PointTwoDem bPoint, PointTwoDem cPoint) {
        return (TwoDemVector.vectorLength(aPoint, bPoint) + TwoDemVector.vectorLength(bPoint, cPoint)
                > TwoDemVector.vectorLength(cPoint, aPoint)) &&
                (TwoDemVector.vectorLength(bPoint, cPoint) + TwoDemVector.vectorLength(cPoint, aPoint)
                        > TwoDemVector.vectorLength(aPoint, bPoint)) &&
                (TwoDemVector.vectorLength(aPoint, bPoint) + TwoDemVector.vectorLength(cPoint, aPoint)
                        > TwoDemVector.vectorLength(bPoint, cPoint));
    }

    @Override
    public double calculatePerimeter() {

        return TwoDemVector.vectorLength(aPoint, bPoint) +
                TwoDemVector.vectorLength(bPoint, cPoint) +
                TwoDemVector.vectorLength(cPoint, aPoint);
    }

    @Override
    public double calculateSquare() {
        return Math.sqrt((calculatePerimeter() / 2) *
                ((calculatePerimeter() / 2) - TwoDemVector.vectorLength(aPoint, bPoint)) *
                ((calculatePerimeter() / 2) - TwoDemVector.vectorLength(bPoint, cPoint)) *
                ((calculatePerimeter() / 2) - TwoDemVector.vectorLength(cPoint, aPoint)));
    }
}
