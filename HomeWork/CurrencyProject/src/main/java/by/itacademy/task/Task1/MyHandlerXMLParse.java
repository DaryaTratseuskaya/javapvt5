package by.itacademy.task.Task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class MyHandlerXMLParse extends DefaultHandler{

    private static DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss Z");

    private Root root;

    public Root getRoot() {
        return root;
    }

    private List<Currency> currencyList;
    private Currency currency;

    public List<Currency> getCurrencyList() {
        return currencyList;
    }

    String path = "";

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        path = path + "/" + qName;

        switch (path.toLowerCase()) {
            case "/root":
                root = new Root();
                break;
            case "/root/currency":
                currencyList = new ArrayList<>();
                break;
            case "/root/currency/element":
                currency = new Currency();
                break;

        }

    }
    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        int lastIndex = path.lastIndexOf('/');
        path = path.substring(0, lastIndex);

        if ("element".equals(qName)) {
            currencyList.add(currency);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        String value = new String(ch, start, length).trim();
        switch (path) {
            case "/root/bankName":
                root.setBankName(value);
                break;

            case "/root/bankLocation":
                root.setBankLocation(value);
                break;

            case "/root/date":
                try {
                    root.setDate(dateFormat.parse(value));
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
                break;

            case "/root/baseCurrencyId":
                root.setBaseCurrencyId(Integer.parseInt(value));
                break;

            case "root/currency/element/code":
                currency.setCode(Integer.parseInt(value));
                break;

            case "/root/currency/element/name":
                currency.setName(value);
                break;

            case "/root/currency/element/id":
                currency.setId(Integer.parseInt(value));
                break;

            case "/root/currency/element/rate":
                currency.setRate(Float.parseFloat(value));
                break;

            case "/root/currency/element/visible":
                currency.setVisible(Boolean.parseBoolean(value));

        }


    }




}
