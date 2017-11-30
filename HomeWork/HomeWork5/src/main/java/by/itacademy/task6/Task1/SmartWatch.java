package by.itacademy.task6.Task1;

/**
 * Created by daryatratseuskaya on 11/27/17
 */
public class SmartWatch extends Producer {

    private String watchType;
    private boolean isSimCard;
    private String bandMaterial;

    public SmartWatch(String watchType, boolean isSimCard, String bandMaterial) {

        this.watchType = watchType;
        this.isSimCard = isSimCard;
        this.bandMaterial = bandMaterial;
    }


    public String printProducer() {
        String text = watchType + " " + bandMaterial;
        return text;
    }
}
