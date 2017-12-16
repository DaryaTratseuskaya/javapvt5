package by.itacademy.task9.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/13/17
 */
public class Building {

    private String buildingName;

    private List<Building> buildingList = new ArrayList<>();

    public List<Building> getBuildingList() {
        return this.buildingList;
    }

    public Building(String buildingName) {

        this.buildingName = buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    }

    public void setBuildingList(List<Building> buildingList) {
        this.buildingList = buildingList;
    }

    public String getBuildingName() {
        return buildingName;
    }

    private List<Room> roomList = new ArrayList<>();

    public void addRoom(Room room) {
        roomList.add(room);
    }

    public List<Room> getRoomList(){
        return this.roomList;
    }



  }
