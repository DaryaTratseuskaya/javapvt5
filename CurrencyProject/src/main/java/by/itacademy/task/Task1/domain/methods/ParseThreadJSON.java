package by.itacademy.task.Task1.domain.methods;

import by.itacademy.task.Task1.domain.entity.Root;

import java.util.concurrent.atomic.AtomicReference;


/**
 * Created by daryatratseuskaya on 1/29/18
 */
public class ParseThreadJSON implements Runnable {
    private int userSelectionDownloadMethod;
    private AtomicReference<Root> root = new AtomicReference<>();

    public Root getJSON() {
        return root.get();
    }

    public ParseThreadJSON(int parameter) {

        this.userSelectionDownloadMethod = parameter;
    }

    @Override
    public void run() {

        System.out.println("started json parsing");
        int userSelectionDownloadMethod = this.userSelectionDownloadMethod;

        root.set(Manager.parseJSONMethod(userSelectionDownloadMethod));

    }
}
