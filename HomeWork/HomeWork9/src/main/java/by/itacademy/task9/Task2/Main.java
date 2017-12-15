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
        buildingList.add(new Building("Building #2"));
        buildingList.add(new Building("Building #3"));

        List<Room> roomList = new ArrayList<>();
        roomList.add(new Room("Room #1", 1, 100));
        roomList.add(new Room("Room #2", 2, 90));
        roomList.add(new Room("Room #3", 0, 0));

        List<Lamp> lampList = new ArrayList<>();
        lampList.add(new Lamp(100));
        lampList.add(new Lamp(300));
        lampList.add(new Lamp(700));

        List<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Furniture("Table", 10));
        furnitureList.add(new Furniture("Chair", 5));
        furnitureList.add(new Furniture("Sofa", 10));




        Calculations calculations = new Calculations();
//        for (int i = 0; i < buildingList.size(); i++) {
            int totalLightWindow = calculations.calculateLightOfWindows(List<Room> roomList,lampList);
            System.out.println("Total Light from windows = " + totalLightWindow);
//        }

        buildingList.get(0).addRoom(roomList.get(0));
        roomList.get(0).addLamp(lampList.get(0));

        buildingList.get(1).addRoom(roomList.get(1));
        roomList.get(1).addLamp(lampList.get(1));

        buildingList.get(2).addRoom(roomList.get(2));
        roomList.get(2).addLamp(lampList.get(2));

        buildingList.get(0).addRoom(roomList.get(0));
        roomList.get(0).addLamp(lampList.get(0));
        roomList.get(0).addManyLamps(lampList);







        int sumLamp = calculations.calculateLightOfLamp(lampList);
        System.out.println("Sum of Lamps = " + sumLamp);

        int sumAllLight = calculations.sumAllLight(totalLightWindow, sumLamp);
        System.out.println("Sum of All Light = " + sumAllLight);

        try {
            calculations.lightLimitsCheck(sumAllLight);
        } catch (IlluminationTooMuchException e) {
            System.out.println("Sum of All Light = " + sumAllLight + " is bigger then " + "maximum possible Light In the Room = " + calculations.maxLightInRoom + " " + e.toString());
        }



//        roomList.get(0).addManyFurniture(furnitureList);

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
