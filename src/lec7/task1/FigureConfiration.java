package lec7.task1;

import commons.PointTwoDem;
import commons.TwoDemVector;

public class FigureConfiration {
    public static void main(String[] args) {
        Circle circle = new Circle(14.5);
        System.out.printf("Радиус круга равен %f.\n Периметр круга равен %f.\n Площадь круга равна %f.\n", circle.getRadius(),
                circle.calculatePerimeter(), circle.calculateSquare());

        PointTwoDem aPoint = new PointTwoDem(2, 4);
        PointTwoDem bPoint = new PointTwoDem(5, 7);
        PointTwoDem cPoint = new PointTwoDem(8, 4);
        PointTwoDem dPoint = new PointTwoDem(5, 1);

        PointTwoDem ePoint = new PointTwoDem(1, 1);
        PointTwoDem fPoint = new PointTwoDem(2, 2);
        PointTwoDem gPoint = new PointTwoDem(2, 3);

        PointTwoDem hPoint = new PointTwoDem(2, 4);
        PointTwoDem iPoint = new PointTwoDem(5, 7);
        PointTwoDem jPoint = new PointTwoDem(10, 2);
        PointTwoDem kPoint = new PointTwoDem(7, -1);


        Triangle triangle = new Triangle(ePoint, fPoint, gPoint);
        System.out.printf("Периметр треугольника равен %f.\n Площадь треугольника равна %f.\n", triangle.calculatePerimeter(), triangle.calculateSquare());

        Rectangle rectangle = new Rectangle(hPoint, iPoint, jPoint, kPoint);
        String figType = rectangle.isSquare() ? "квадрат" : "прямоугольник";
        System.out.printf("Фигура %s.\nЕё периметр равен %f.\nЕё площадь равна %f.\n", figType,
                rectangle.calculatePerimeter(), rectangle.calculateSquare());

        Rectangle square = new Rectangle(aPoint, bPoint, cPoint, dPoint);
        figType = square.isSquare() ? "квадрат" : "прямоугольник";
        System.out.printf("Фигура %s.\nЕё периметр равен %f.\nЕё площадь равна %f.\n", figType,
                square.calculatePerimeter(), square.calculateSquare());

        Rectangle squareTwo = new Rectangle(new PointTwoDem(1, 1), new PointTwoDem(1, 4), new PointTwoDem(4, 4), new PointTwoDem(4, 1));
        figType = squareTwo.isSquare() ? "квадрат" : "прямоугольник";
        System.out.printf("Фигура %s.\nЕё периметр равен %f.\nЕё площадь равна %f.\n", figType,
                squareTwo.calculatePerimeter(), squareTwo.calculateSquare());

        Figure[] figures = {circle, triangle, square, squareTwo, rectangle};
        double perimSum = 0;
        for (Figure f : figures) {
            perimSum += f.calculatePerimeter();
        }
        System.out.printf("Сумма периметров фигур массива равна %f.", perimSum);
    }

}
