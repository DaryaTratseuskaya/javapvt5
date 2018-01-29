package by.itacademy.task.Task1.data.parser.json;


import by.itacademy.task.Task1.data.parser.Parsing;
import by.itacademy.task.Task1.domain.entity.Root;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


import java.io.File;
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


