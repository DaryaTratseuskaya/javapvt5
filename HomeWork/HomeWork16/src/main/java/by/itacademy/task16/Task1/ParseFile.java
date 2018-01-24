package by.itacademy.task16.Task1;

/**
 * Created by daryatratseuskaya on 1/22/18
 */
public class ParseFile extends Thread {

    private DownLoadFile downloadFile;

    public DownLoadFile getDownloadFile() {
        return downloadFile;
    }

    public void setDownloadFile(DownLoadFile downloadFile) {
        this.downloadFile = downloadFile;
    }

    @Override
    public void run() {
        System.out.println("Start Parsing File");
        System.out.println("ParseFile is sleeping");
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("XML Parse is started");

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (getDownloadFile()) {
            System.out.println("XML Parse is finished");
            downloadFile.notify();
        }
        System.out.println("ParseFile is sleeping ");
        synchronized (this) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("JSON Parse is started");

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("JSON Parse is finished");
        System.out.println("ParseFile finished");
    }
}
