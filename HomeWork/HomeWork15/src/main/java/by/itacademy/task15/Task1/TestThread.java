package by.itacademy.task15.Task1;

import static by.itacademy.task15.Task1.Main.print10;

/**
 * Created by daryatratseuskaya on 1/22/18
 */
public class TestThread extends Thread {

    @Override
    public void run() {
        print10();
    }
}
