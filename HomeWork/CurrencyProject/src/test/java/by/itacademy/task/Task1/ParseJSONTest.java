package by.itacademy.task.Task1;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import org.apache.commons.io.IOUtils;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.StringWriter;

import static org.junit.Assert.*;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class ParseJSONTest {
    @Test
    public void testParseJSON() throws Exception {


        Root root = ParseJSON.parseJSON(readJson("currency.json"));
        assertNotNull(root);
        assertEquals("Super duper bank",root.getBankName());
        assertEquals("Minks",root.getBankLocation());
        assertEquals(1,root.getBaseCurrencyId());

        assertEquals(786, root.getCurrency().get(0).getCode());
        assertEquals(0,root.getCurrency().get(0).getId());
        assertEquals("USD",root.getCurrency().get(0).getName());
        assertEquals(true,root.getCurrency().get(0).isVisible());


    }

    public String readJson(String fileName) throws Exception {

        InputStream inputStream = ParseJSONTest.class.getClassLoader().getResourceAsStream(fileName);
        StringWriter writer = new StringWriter();
        IOUtils.copy(inputStream,writer);


        return writer.toString();
    }

    @Test(expected = Exception.class )
    public void testParseJSONInvalidDate() throws Exception {


        Root root = ParseJSON.parseJSON(readJson("currency_invalid_date.json"));


    }


}