package by.itacademy.task11.Task1;



import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/18/17
 *
 * SAX Parser
 */
public class Parser extends DefaultHandler{
    private static final String LINK = "http://kiparo.ru/t/test.xml";

    public static void main(String[] args) {

        InputStream inputStream = null;
        FileOutputStream fileOutputStream = null;


        try{
            URL url = new URL(LINK);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();

            int responseCode = httpURLConnection.getResponseCode();

            if (responseCode == HttpURLConnection.HTTP_OK){

                inputStream = httpURLConnection.getInputStream();

                File file = new File("text.xml");
                fileOutputStream = new FileOutputStream(file);

                int byteRead = -1;
                byte[] buffer = new byte[2048];
                while( (byteRead = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, byteRead);
                }

                parseXML();

            }else {
                System.out.println("Data not found = " + responseCode);
            }



        }catch (Exception e){
//            System.out.println("Impossible to download file" + e);
            throw new RuntimeException(e);
        } finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                }catch (IOException e){
                    System.out.println("Impossible to close inputStream");
                }
            }
            if (fileOutputStream != null){
                try {
                    fileOutputStream.close();
                }catch (IOException e) {
                    System.out.println("Impossible to close fileOutPutStream");
                }
            }
        }
    }

    public static void parseXML(){

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            MyHandler handler = new MyHandler();
            saxParser.parse(new File("text.xml"), handler);

            Root root = handler.getRoot();

            List<People> peopleList = handler.getPeopleList();

            root.setPeople(peopleList);

            System.out.println("==========================================");
            System.out.println("root = " + root.toString());


        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
    }






    }


