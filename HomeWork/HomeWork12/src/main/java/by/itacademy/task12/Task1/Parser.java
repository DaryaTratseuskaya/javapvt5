package by.itacademy.task12.Task1;


import org.codehaus.jackson.map.DeserializationConfig;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/18/17
 * <p>
 * Jackson Parser
 */
public class Parser {
    private static final String LINK = "http://kiparo.ru/t/test.json";

    public static void main(String[] args) {

        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;


        try {
            URL url = new URL(LINK);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK) {

                inputStream = httpURLConnection.getInputStream();

                File file = new File("text.json");
                fileOutputStream = new FileOutputStream(file);

                int byteRead = -1;
                byte[] buffer = new byte[2048];
                while ((byteRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }

                parseJSON();

            } else {
                System.out.println("Data not found = " + responseCode);
            }


        } catch (Exception e) {
            System.out.println("Impossible to download file" + e);
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

    public static void parseJSON() {

        ObjectMapper mapper = new ObjectMapper();

        try {
            mapper.configure(DeserializationConfig.Feature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            Root root = mapper.readValue(new File("text.json"), Root.class);


            System.out.println("root = " + root.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}


