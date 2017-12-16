package by.itacademy.task9.Task2;

/**
 * Created by daryatratseuskaya on 12/15/17
 */
public class Furniture {
    private String nameFurniture;
    private double squareFurniture;

    public Furniture(String nameFurniture, double squareFurniture) {
        this.nameFurniture = nameFurniture;
        this.squareFurniture = squareFurniture;
    }

    public String getNameFurniture() {
        return nameFurniture;
    }

    public void setNameFurniture(String nameFurniture) {
        this.nameFurniture = nameFurniture;
    }

    public double getSquareFurniture() {
        return squareFurniture;
    }

    public void setSquareFurniture(double squareFurniture) {
        this.squareFurniture = squareFurniture;
    }
    public Furniture (double squareFurniture){
         this.squareFurniture = squareFurniture;
    }
}
