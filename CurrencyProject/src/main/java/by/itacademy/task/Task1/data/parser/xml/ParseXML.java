package by.itacademy.task.Task1.data.xml;

import by.itacademy.task.Task1.Currency;
import by.itacademy.task.Task1.Parsing;
import by.itacademy.task.Task1.Root;
import by.itacademy.task.Task1.data.xml.MyHandlerXMLParse;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class ParseXML implements Parsing {

    @Override
    public Root parse(String fileName) {

        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            MyHandlerXMLParse handler = new MyHandlerXMLParse();
            saxParser.parse(new File("currency.xml"), handler);

            Root root = handler.getRoot();

            List<Currency> currencyList = handler.getCurrencyList();

            root.setCurrency(currencyList);

            System.out.println("========================================== XML");
            System.out.println("root = " + root.toString());
            System.out.println("========================================== XML");


        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }




        return null;
    }
}
