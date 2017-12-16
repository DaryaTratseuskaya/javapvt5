package by.itacademy.task9.Task2;

import java.util.List;

/**
 * Created by daryatratseuskaya on 12/14/17
 */
public class Calculations {

    final public double maxSpaceFillPercent = 70;
    final public int windowLight = 700;
    final public int maxLightInRoom = 4000;
    final public int minLightInRoom = 300;

    /**
     * Return sum of lamps light
     *
     * @param lamps - ArrayList of lamps
     * @return
     */
    public int calculateLightOfLamp(List<Lamp> lamps) {
        int sumLamp = 0;
        if (lamps != null || lamps.size() < 1) {
            for (int i = 0; i < lamps.size(); i++) {
                sumLamp = sumLamp + lamps.get(i).getLight();
            }
        }
        return sumLamp;
    }

    public int calcLampsInRoom(List<Building> buildingList, List<Room> roomList, List<Lamp> lampList) {

//        for (Building building : buildingList){
//            for (Room room : building.getRoomList()){
//                for (Lamp lamp : lampList){
//                   return  lampsInRoom = lamp.getLight();
//                }
//            }
//        }
//
        int[] lampsInRoom = new int[10];
        int sum = 0;
        if (lampList != null || lampList.size() < 1) {
            for (int i = 0; i < buildingList.get(i).getRoomList().get(i).getLampList().size(); i++) {
                sum = sum + buildingList.get(i).getRoomList().get(i).getLampList().get(i).getLight();
                 lampsInRoom[i] = sum;
                sum += i;
                return sum;
            }
        }
        return 0;
    }

    public int calculateLightOfWindows(List<Room> roomList) {
        if (roomList != null || roomList.size() < 1) {
            for (int i = 0; i < roomList.size(); i++) {
                int lightOfWindows = 0;
                return lightOfWindows = roomList.get(i).getNumberOfWindows() * windowLight;
            }
        }
        return 0;
    }

    public int sumAllLight(int lampsInRoom, int lightOfWindows) {
        int sumAllLight = 0;
        return sumAllLight = lampsInRoom + lightOfWindows;
    }

    /**
     * Checks if light in the room is in limits
     *
     * @param sum
     * @throws IlluminationTooMuchException
     */
    public void lightLimitsCheck(int sum) throws IlluminationTooMuchException {
        if (sum > maxLightInRoom) {
            throw new IlluminationTooMuchException();
        }
    }

    public double getSumFurniture(List<Furniture> furnitures, List<Building> buildingList, List<Room> roomList) {
        double[] sumFurniture = new double[10];
        double sum = 0;
        if (furnitures != null || furnitures.size() < 1) {
            for (int i = 0; i < buildingList.get(i).getRoomList().get(i).getFurnitureList().size(); i++) {
                sum = sum + buildingList.get(i).getRoomList().get(i).getFurnitureList().get(i).getSquareFurniture();
                 sumFurniture[i] = sum;
                 for (int j = 0; j < sumFurniture.length; j++) {
                     sum += j;
                     return sum;
                 }
            }
        }
        return 0;
    }


    public double calculatePercentFurniture(double sumFurniture, double roomSquare) {
        double percentFurniture = 0;
        percentFurniture = (sumFurniture * 100) / roomSquare;
        return percentFurniture;
    }

    public void checkSpace(double percentFurniture, double maxSpaceFillPercent) throws SpaceUsageTooMuchException {
        if (percentFurniture > maxSpaceFillPercent) {
            throw new SpaceUsageTooMuchException();
        }
    }

    public double checkFreeSpace(double squareRoom, double sumFurniture) {
        double freeSquare = 0;
        return freeSquare = squareRoom - sumFurniture;

    }


}





