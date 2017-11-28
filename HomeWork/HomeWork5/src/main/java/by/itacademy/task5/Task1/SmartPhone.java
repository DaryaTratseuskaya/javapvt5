package by.itacademy.task5.Task1;

import by.itacademy.task5.Task1.Devices;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public class SmartPhone extends Devices {

    private String screenTechnology;
    private int flashMemory;
    private int simCard;
    private String simCardType;
    private int batteryCapacity;

    public String getScreenTechnology() {
        return screenTechnology;
    }

    public void setScreenTechnology(String screenTechnology) {
        this.screenTechnology = screenTechnology;
    }

    public int getFlashMemory() {
        return flashMemory;
    }

    public void setFlashMemory(int flashMemory) {
        this.flashMemory = flashMemory;
    }

    public int getSimCard() {
        return simCard;
    }

    public void setSimCard(int simCard) {
        this.simCard = simCard;
    }

    public String getSimCardType() {
        return simCardType;
    }

    public void setSimCardType(String simCardType) {
        this.simCardType = simCardType;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }


}
