package by.itacademy.task9.Task2;

import java.util.List;

/**
 * Created by daryatratseuskaya on 12/14/17
 */
public class Calculations {

    final private int maxSpaceFillPercent = 70;
    final private int windowLight = 700;
    final private int maxLightInRoom = 4000;
    final private int minLightInRoom = 300;

    public static void main(String[] args) {

    }

    /**
     * Return sum of lamps light
     * @param lamps
     * @return
     */
    public int calculateLightOfLamp(List<Lamp> lamps){
        if (lamps == null || lamps.size() < 1){
            return 0;
        }
        int sumLamp = 0;
        for (int i = 0; i < lamps.size(); i++){
            sumLamp = sumLamp + i;
        }
        return sumLamp;

    }
    /**
     * Calculate light from the windows
     * @param numberOfWindows
     * @return
     */
    public int calculateLightOfWindows(int numberOfWindows){
        int totalLightWindow = numberOfWindows * windowLight;
        return totalLightWindow;
    }

    /**
     * Calculate total illumination from windows and lamps
     * @param totalLightWindow
     * @param sumLamp
     */
    public void sumAllLight(int totalLightWindow, int sumLamp){
        int sum = totalLightWindow + sumLamp;
    }

    /**
     * Checks if light in the room is in limits
     * @param sum
     * @throws IlluminationTooMuchException
     */
    public void lightLimitsCheck(int sum) throws IlluminationTooMuchException{
        if (sum > maxLightInRoom){
            throw new IlluminationTooMuchException();
        }
    }
}
