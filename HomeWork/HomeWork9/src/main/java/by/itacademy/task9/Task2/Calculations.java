package by.itacademy.task9.Task2;

import java.util.List;

/**
 * Created by daryatratseuskaya on 12/14/17
 */
public class Calculations {

    final private int maxSpaceFillPercent = 70;
    final private int windowLight = 700;
    final public int maxLightInRoom = 4000;
    final private int minLightInRoom = 300;

    /**
     * Return sum of lamps light
     * @param lamps - ArrayList of lamps
     * @return
     */
    public int calculateLightOfLamp(List<Lamp> lamps){
        int sumLamp = 0;
        if (lamps != null || lamps.size() < 1){
            for (int i = 0; i < lamps.size(); i ++){
                 sumLamp = sumLamp + lamps.get(i).getLight();
            }
        }
        return sumLamp;
    }
    /**
     * Calculate light from the windows
     * @param numberOfWindows
     * @return
     */
    public int calculateLightOfWindows(int numberOfWindows){
        return numberOfWindows * windowLight;
    }

    /**
     * Calculate total illumination from windows and lamps
     * @param totalLightWindow
     * @param sumLamp
     */
    public int sumAllLight(int totalLightWindow, int sumLamp){
        int sumAllLight = 0;
        return sumAllLight = totalLightWindow + sumLamp;
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
