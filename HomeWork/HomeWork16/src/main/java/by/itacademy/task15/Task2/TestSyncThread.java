package by.itacademy.task15.Task2;

import static by.itacademy.task15.Task2.Main.print10;

/**
 * Created by daryatratseuskaya on 1/22/18
 */
public class TestSyncThread extends Thread{
    @Override
    public void run() {
        print10();
    }
}
