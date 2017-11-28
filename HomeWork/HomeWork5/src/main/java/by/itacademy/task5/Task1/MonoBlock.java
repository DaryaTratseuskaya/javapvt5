package by.itacademy.task5.Task1;

import by.itacademy.task5.Task1.Devices;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public class MonoBlock extends Devices {

    private String screenSurface;
    private String wiFiType;
    private String lanType;
    private boolean remoteController;

    public String getScreenSurface() {
        return screenSurface;
    }

    public void setScreenSurface(String screenSurface) {
        this.screenSurface = screenSurface;
    }

    public String getWiFiType() {
        return wiFiType;
    }

    public void setWiFiType(String wiFiType) {
        this.wiFiType = wiFiType;
    }

    public String getLanType() {
        return lanType;
    }

    public void setLanType(String lanType) {
        this.lanType = lanType;
    }

    public boolean isRemoteController() {
        return remoteController;
    }

    public void setRemoteController(boolean remoteController) {
        this.remoteController = remoteController;
    }


}
