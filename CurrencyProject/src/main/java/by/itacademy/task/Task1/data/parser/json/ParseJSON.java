package by.itacademy.task.Task1.data.json;


import by.itacademy.task.Task1.Parsing;
import by.itacademy.task.Task1.Root;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.fasterxml.jackson.databind.util.ISO8601DateFormat;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Created by daryatratseuskaya on 12/18/17
 * <p>
 * Jackson ParseJSON
 */
public class ParseJSON implements Parsing {

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");

    @Override
    public Root parse(String fileName) {
        ObjectMapper mapper = new ObjectMapper();
        Root root = null;
        try {


            mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            mapper.setDateFormat(dateFormat);
            root = mapper.readValue(new File("currency.json"), Root.class);

            System.out.println("=================================== JSON");
            System.out.println("root = " + root.toString());
            System.out.println("=================================== JSON");

        } catch (Exception e) {
            e.printStackTrace();
        }
        return root;
    }
}


