package by.itacademy.task.Task1.domain.methods;

import static by.itacademy.task.Task1.Main.selectFileTypeForDownload;

/**
 * Created by daryatratseuskaya on 1/29/18
 */
public class ParseThreadXML implements Runnable{
    @Override
    public void run() {
        int userSelectionDownloadMethod = selectFileTypeForDownload();
        Manager.parseXMLMethod(userSelectionDownloadMethod);

    }
}
