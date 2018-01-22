package by.itacademy.task15.Task1;

/**
 * Created by daryatratseuskaya on 1/22/18
 */
public class DownLoadFile extends Thread {

    private ParseFile parseFile;

    public ParseFile getParseFile() {
        return parseFile;
    }

    public void setParseFile(ParseFile parseFile) {
        this.parseFile = parseFile;
    }

    @Override
    public void run() {
        System.out.println("File download is started");

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("XML download is started");

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (getParseFile()) {
            System.out.println("XML download is finished");
            parseFile.notify();
        }

        synchronized (this) {
            System.out.println("DownloadFile is sleeping");
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("JSON downloading is started");

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (getParseFile()) {
            System.out.println("JSON downloading is finished");
            parseFile.notify();
        }

        System.out.println("DownloadFile finished");
    }
}
