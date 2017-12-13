package by.itacademy.task9.Task2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/13/17
 */
public class Room {

    final private int maxSpaceFillPercent = 70;
    final private int windowLight = 700;
    final private int maxLightInRoom = 4000;
    final private int minLightInRoom = 300;

    private int numberOfWindows;

    private double square;
    private double freeSquare;

    private List<Lamp> lampList = new ArrayList<>();
    private List<Furniture> furnitureList= new ArrayList<>();

    public void addLamp(Lamp lamp){
        lampList.add(lamp);

    }

    public void addFurniture(Furniture furniture)throws Exception{ //сделать свойэксепшен и проверку на свободное место
        //проверка и кинуть ошибку
//       if () {
//           throw new Exception();
//           return;
//       }
        furnitureList.add(furniture);
    }


    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getFreeSquare() {
        return freeSquare;
    }

    public void setFreeSquare(double freeSquare) {
        this.freeSquare = freeSquare;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }
}
