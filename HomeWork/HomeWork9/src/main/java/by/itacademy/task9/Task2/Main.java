package by.itacademy.task9.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/14/17
 */
public class Main {
    public static void main(String[] args) {

        Building building = new Building();
        Room room = null;
        room = new Room("Room #1", 6,100);
        if (room != null){
            building.addRoom(room);
        }

        Calculations calculations = new Calculations();
        int totalLightWindow = calculations.calculateLightOfWindows(room.getNumberOfWindows());
        System.out.println("totalLightWindow = " + totalLightWindow);

        List<Lamp> lampList = new ArrayList<>();
        lampList.add(new Lamp(100));
        lampList.add(new Lamp(300));


        room.addManyLamps(lampList);

        int sumLamp = calculations.calculateLightOfLamp(lampList);
        System.out.println("sumLamps = " + sumLamp);

        int sumAllLight = calculations.sumAllLight(totalLightWindow,sumLamp);
        System.out.println("sumAllLight = " + sumAllLight);

        try {
            calculations.lightLimitsCheck(sumAllLight);
        } catch (IlluminationTooMuchException e) {
            System.out.println("sumAllLight = " + sumAllLight + " > " + "maxLightInRoom = " + calculations.maxLightInRoom + " " + e.toString());
        }


    }



}
