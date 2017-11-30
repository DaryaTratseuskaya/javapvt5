package by.itacademy.task6.Task1;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public class Denomination {


    private int hundreds;
    private int fifties;
    private int twenties;

    public int getHundreds() {
        return hundreds;
    }

    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    public int getFifties() {
        return fifties;
    }

    public void setFifties(int fifties) {
        this.fifties = fifties;
    }

    public int getTwenties() {
        return twenties;
    }

    public void setTwenties(int twenties) {
        this.twenties = twenties;
    }

    public Denomination(int hundreds, int fifties, int twenties) {
        this.hundreds = hundreds;
        this.fifties = fifties;
        this.twenties = twenties;
    }
}
