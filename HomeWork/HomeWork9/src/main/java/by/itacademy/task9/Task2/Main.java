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
//        roomList.add(new Room("Room #2", 5, 100));


        List<Lamp> lampList = new ArrayList<>();
        lampList.add(new Lamp(400));
        lampList.add(new Lamp(100));

        List<Furniture> furnitureList = new ArrayList<>();
        furnitureList.add(new Furniture("Table", 1));
        furnitureList.add(new Furniture("Chair", 1));
        furnitureList.add(new Furniture("Sofa", 1));


        buildingList.get(0).addRoom(roomList.get(0));
        roomList.get(0).addLamp(lampList.get(0));


//        buildingList.get(0).addRoom(roomList.get(0));
//        roomList.get(0).addLamp(lampList.get(1));

        roomList.get(0).addFurniture(furnitureList.get(0));
        roomList.get(0).addFurniture(furnitureList.get(1));


        Calculations calculations = new Calculations();

        int lightOfWindows = calculations.calculateLightOfWindows(roomList);
        System.out.println("Total Light from windows = " + lightOfWindows);

        int calcLampsInRoom = calculations.calcLampsInRoom(buildingList, roomList, lampList);
        System.out.println("Lamps In Room = " + calcLampsInRoom);

        int sumAllLight = calculations.sumAllLight(lightOfWindows, calcLampsInRoom);
        System.out.println("Sum of All Light = " + sumAllLight);


        try {
            calculations.lightLimitsCheck(sumAllLight);
        } catch (IlluminationTooMuchException e) {
            System.out.println("Error " + e.toString());
        }


        double getSumFurniture = calculations.getSumFurniture(furnitureList, buildingList, roomList);
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


        for (int i = 0; i < buildingList.size(); i++) {
            System.out.println(buildingList.get(i).getBuildingName());
        }

        for (int i = 0; i < roomList.size(); i++) {
            System.out.println(roomList.get(i).getRoomName());
        }

        for (int i = 0; i < roomList.size(); i++) {
            System.out.println("Illumination: Lamp power = " + roomList.get(i).getLampList().get(i).getLight() + ", number of windows = " +
                    roomList.get(i).getNumberOfWindows() + ", total light = " + sumAllLight);
        }
        System.out.println("Room square = " + roomList.get(0).getSquare() + " (space used = " + getSumFurniture + " m2, free space = " +
                freeSpace + " m2 or " + calculatePercentFurniture + " % of square)");

        System.out.println(" Furniture : " + buildingList.get(0).getRoomList().get(0).getFurnitureList().get(0).getNameFurniture() +
                " square = " + buildingList.get(0).getRoomList().get(0).getFurnitureList().get(0).getSquareFurniture());
        System.out.println(" Furniture : " + buildingList.get(0).getRoomList().get(0).getFurnitureList().get(1).getNameFurniture() +
                " square = " + buildingList.get(0).getRoomList().get(0).getFurnitureList().get(1).getSquareFurniture());

    }


    public static void printAll() {

    }


}
