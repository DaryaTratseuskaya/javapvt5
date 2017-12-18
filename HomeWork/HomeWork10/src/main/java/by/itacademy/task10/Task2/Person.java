package by.itacademy.task10.Task2;

/**
 * Created by daryatratseuskaya on 12/18/17
 */
public class Person {
    private String FIO;
    private String key;

    public Person(String FIO, String key) {
        this.FIO = FIO;
        this.key = key;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
