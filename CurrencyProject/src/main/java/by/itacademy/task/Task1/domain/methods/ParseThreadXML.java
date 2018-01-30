package by.itacademy.task.Task1.domain.methods;

import by.itacademy.task.Task1.domain.entity.Root;

import java.util.concurrent.atomic.AtomicReference;

import static by.itacademy.task.Task1.Main.selectFileTypeForDownload;

/**
 * Created by daryatratseuskaya on 1/29/18
 */
public class ParseThreadXML implements Runnable {
    private int userSelectionDownloadMethod;
    private AtomicReference<Root> root = new AtomicReference<>();

    public Root getXML() {
        return root.get();
    }

    public ParseThreadXML(int parameter) {
        this.userSelectionDownloadMethod = parameter;
    }

    @Override
    public void run() {

        System.out.println("started xml parsing");
        int userSelectionDownloadMethod = this.userSelectionDownloadMethod;

        root.set(Manager.parseXMLMethod(userSelectionDownloadMethod));


    }
}
