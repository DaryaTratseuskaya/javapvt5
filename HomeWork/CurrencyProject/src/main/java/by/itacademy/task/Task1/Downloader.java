package by.itacademy.task.Task1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class Downloader {

    private static final String LINK_JSON = "http://kiparo.ru/t/currency.json";
    private static final String LINK_XML = "http://kiparo.ru/t/currency.xml";

    /**
     * Class to download JSON file.
     * Uses LINK_JSON source.
     */
    public static void downloadJSON(){

        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;


        try {
            URL url = new URL(LINK_JSON);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

                inputStream = httpURLConnection.getInputStream();

                File file = new File("currency.json");
                fileOutputStream = new FileOutputStream(file);

                int byteRead = -1;
                byte[] buffer = new byte[2048];
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }

//                parseJSON();

            } else {
                System.out.println("Data not found = " + responseCode);
            }


        } catch (Exception e) {
            System.out.println("Impossible to downloadJSON file" + e);
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Impossible to close inputStream");
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println("Impossible to close fileOutPutStream");
                }
            }
        }
    }

    /**
     * Class to download XML file.
     * Uses LINK_XML source.
     */
    public static void downloadXML(){

        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;


        try {
            URL url = new URL(LINK_XML);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

                inputStream = httpURLConnection.getInputStream();

                File file = new File("currency.xml");
                fileOutputStream = new FileOutputStream(file);

                int byteRead = -1;
                byte[] buffer = new byte[2048];
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }

//                parseXML();

            } else {
                System.out.println("Data not found = " + responseCode);
            }


        } catch (Exception e) {
            System.out.println("Impossible to downloadXML file" + e);
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    System.out.println("Impossible to close inputStream");
                }
            }
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println("Impossible to close fileOutPutStream");
                }
            }
        }
    }
    }

