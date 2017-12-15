package by.itacademy.task9.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/14/17
 */
public class Main {
    public static void main(String[] args) {

        List<Building> buildingList = new ArrayList<>();
        buildingList.add(new Building("Building #1"));

        List<Room> roomList = new ArrayList<>();
        roomList.add(new Room("Room #1", 5, 100));

        List<Lamp> lampList = new ArrayList<>();
        lampList.add(new Lamp(800));

        List<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Furniture("Table", 10));
        furnitureList.add(new Furniture("Chair", 5));
        furnitureList.add(new Furniture("Sofa", 10));


        buildingList.get(0).addRoom(roomList.get(0));
        roomList.get(0).addLamp(lampList.get(0));


        Calculations calculations = new Calculations();

        int lightOfWindows = calculations.calculateLightOfWindows(roomList);
        System.out.println("Total Light from windows = " + lightOfWindows);

        int calcLampsInRoom = calculations.calcLampsInRoom(buildingList, roomList, lampList);
        System.out.println("Lamps In Room = " + calcLampsInRoom);

        int sumAllLight = calculations.sumAllLight(lightOfWindows,calcLampsInRoom);
        System.out.println("Sum of All Light = " + sumAllLight);


        try {
            calculations.lightLimitsCheck(sumAllLight);
        } catch (IlluminationTooMuchException e) {
            System.out.println("Error " + e.toString());
        }


        double getSumFurniture = calculations.getSumFurniture(furnitureList);
        System.out.println("Sum of furniture added = " + getSumFurniture + " square meters");
        double calculatePercentFurniture = calculations.calculatePercentFurniture(getSumFurniture, roomList.get(0).getSquare());
        System.out.println("Percent of Furniture in the room space = " + calculatePercentFurniture + " %");

        try {
            calculations.checkSpace(calculatePercentFurniture, calculations.maxSpaceFillPercent);
        } catch (SpaceUsageTooMuchException e) {
            System.out.println("Error " + e.toString());
        }

        double freeSpace = calculations.checkFreeSpace(roomList.get(0).getSquare(), getSumFurniture);
        System.out.println("Free space left in square meters: " + freeSpace);


    }


}
