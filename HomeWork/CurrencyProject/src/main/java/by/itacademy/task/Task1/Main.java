package by.itacademy.task.Task1;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class Main {
    public static void main(String[] args) {

//        Downloader.downloadJSON();
//        ParseJSON.parseJSON();

        Parsing parsing = null;
        Downloader.downloadXML();
        parsing = new ParseXML();
        Root root = parsing.parse("currency.xml");

    }
}
