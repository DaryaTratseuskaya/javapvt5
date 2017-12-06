package by.itacademy.task7.Task3;

/**
 * Created by daryatratseuskaya on 11/30/17
 */
public class Triangle extends Shape{

    private double sideG;
    private double height;

    public Triangle(double sideG, double height) {
        this.sideG = sideG;
        this.height = height;
    }

    public double getSqr() {
        return 0.5 * sideG * height;
    }
}
