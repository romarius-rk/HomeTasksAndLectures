package lec7.task1;

import commons.PointTwoDem;
import commons.TwoDemVector;

public class Triangle implements Figure {
    private PointTwoDem aPoint;
    private PointTwoDem bPoint;
    private PointTwoDem cPoint;

    public Triangle(PointTwoDem aPoint, PointTwoDem bPoint, PointTwoDem cPoint){
        this.aPoint = aPoint;
        this.bPoint = bPoint;
        this.cPoint = cPoint;
    }

    @Override
    public double calculatePerimeter() {

        return TwoDemVector.vectorLength(aPoint,bPoint)+
                TwoDemVector.vectorLength(bPoint,cPoint)+
                TwoDemVector.vectorLength(cPoint,aPoint);
    }

    @Override
    public double calculateSquare() {
        return Math.sqrt((calculatePerimeter()/2)*
                ((calculatePerimeter()/2)- TwoDemVector.vectorLength(aPoint,bPoint))*
                ((calculatePerimeter()/2)- TwoDemVector.vectorLength(bPoint,cPoint))*
                ((calculatePerimeter()/2)- TwoDemVector.vectorLength(cPoint,aPoint)));
    }
}
