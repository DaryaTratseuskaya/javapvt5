package by.itacademy.task.Task1.domain.entity;

import java.util.List;

/**
 * Created by daryatratseuskaya on 1/30/18
 */
public class Singleton {
    private static Singleton instance = new Singleton();
    private List<Currency> list;
    private Singleton(){

    }
    public static Singleton getInstance(){
        return instance;
    };

    public void setCurrency(List<Currency> list){
        this.list = list;
    }

    public List<Currency> getCurrency() {
        return list;
    }
}
