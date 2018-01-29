package by.itacademy.task.Task1.domain.methods;

import static by.itacademy.task.Task1.Main.selectFileTypeForDownload;

/**
 * Created by daryatratseuskaya on 1/29/18
 */
public class ParseThreadXML implements Runnable {
    private int userSelectionDownloadMethod;

    public ParseThreadXML(int parameter) {
        this.userSelectionDownloadMethod = parameter;
    }

    @Override
    public void run() {

        System.out.println("started xml parsing");
        int userSelectionDownloadMethod = this.userSelectionDownloadMethod;
        Manager.parseXMLMethod(userSelectionDownloadMethod);


    }
}
