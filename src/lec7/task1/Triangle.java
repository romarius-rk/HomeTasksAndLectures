package lec7.task1;

import commons.PointTwoDem;
import commons.Vector2Tools;

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

    private boolean isTtiangle(PointTwoDem aPoint, PointTwoDem bPoint, PointTwoDem cPoint) {
        return (Vector2Tools.vectorLength(aPoint, bPoint) + Vector2Tools.vectorLength(bPoint, cPoint)
                > Vector2Tools.vectorLength(cPoint, aPoint)) &&
                (Vector2Tools.vectorLength(bPoint, cPoint) + Vector2Tools.vectorLength(cPoint, aPoint)
                        > Vector2Tools.vectorLength(aPoint, bPoint)) &&
                (Vector2Tools.vectorLength(aPoint, bPoint) + Vector2Tools.vectorLength(cPoint, aPoint)
                        > Vector2Tools.vectorLength(bPoint, cPoint));
    }

    @Override
    public double calculatePerimeter() {

        return Vector2Tools.vectorLength(aPoint, bPoint) +
                Vector2Tools.vectorLength(bPoint, cPoint) +
                Vector2Tools.vectorLength(cPoint, aPoint);
    }

    @Override
    public double calculateSquare() {
        return Math.sqrt((calculatePerimeter() / 2) *
                ((calculatePerimeter() / 2) - Vector2Tools.vectorLength(aPoint, bPoint)) *
                ((calculatePerimeter() / 2) - Vector2Tools.vectorLength(bPoint, cPoint)) *
                ((calculatePerimeter() / 2) - Vector2Tools.vectorLength(cPoint, aPoint)));
    }
}
