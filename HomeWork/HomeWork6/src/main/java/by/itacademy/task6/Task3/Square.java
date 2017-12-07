package by.itacademy.task6.Task3;

/**
 * Created by daryatratseuskaya on 11/30/17
 */
public class Square extends Shape {

    private double sideC;

    public Square(double sideC) {
        this.sideC = sideC;
    }

    public double getSqr() {

        return sideC * sideC;
    }
}
