package by.itacademy.task9.Task2;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/13/17
 */
public class Room {

    private String roomName;

    public Room(String roomName, int numberOfWindows, double square) {
        this.roomName = roomName;
        this.numberOfWindows = numberOfWindows;
        this.square = square;
    }

    private int numberOfWindows;

    private double square;
    private double freeSquare;

    private List<Lamp> lampList = new ArrayList<>();
    private List<Furniture> furnitureList= new ArrayList<>();

    public void addLamp(Lamp lamp){
        lampList.add(lamp);

    }
    public void addManyLamps(List<Lamp> lamps){
        lampList.addAll(lamps);

    }

    public void addManyFurniture(List<Furniture> furnitures){
        furnitureList.addAll(furnitures);
    }
    public List<Lamp> getLampList(){
        return this.lampList;
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

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }
}
