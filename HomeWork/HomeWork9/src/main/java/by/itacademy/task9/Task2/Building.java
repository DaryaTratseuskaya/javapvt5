package by.itacademy.task9.Task2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/13/17
 */
public class Building {

   private List<Room> roomList = new ArrayList<>();

    public void addRoom(Room room){
        roomList.add(room);
    }

}
