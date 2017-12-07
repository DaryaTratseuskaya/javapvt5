package by.itacademy.task6.Task3;

import static java.lang.Math.PI;

/**
 * Created by daryatratseuskaya on 11/30/17
 */
public class Circle extends Shape{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getSqr(){
        return PI * Math.pow(radius,2);

    }

}
