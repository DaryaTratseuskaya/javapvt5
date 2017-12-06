package by.itacademy.task7.Task1;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public  class Devices extends Producer {

    private String producer;
    private String releaseDate;
    private String diagonal;
    private String screenResolution;
    private String screenDefinition;
    private String serialNumber;

    private String operationSystem;
    private String platform;
    private int ram;

    private String processor;
    private int clockFrequency;

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(String diagonal) {
        this.diagonal = diagonal;
    }

    public String getScreenResolution() {
        return screenResolution;
    }

    public void setScreenResolution(String screenResolution) {
        this.screenResolution = screenResolution;
    }

    public String getScreenDefinition() {
        return screenDefinition;
    }

    public void setScreenDefinition(String screenDefinition) {
        this.screenDefinition = screenDefinition;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public int getClockFrequency() {
        return clockFrequency;
    }

    public void setClockFrequency(int clockFrequency) {
        this.clockFrequency = clockFrequency;
    }

    @Override
    public String printProducer() {
        String text = producer + " " + releaseDate;
        return  text;
    }


}
