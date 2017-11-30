package by.itacademy.task6.Task3;

import sun.security.provider.SHA;

/**
 * Created by daryatratseuskaya on 11/30/17
 */
public class Rectangle extends Shape {

    private double sideA;
    private double sideB;

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getSqr() {
        return sideA * sideB;
    }
}
