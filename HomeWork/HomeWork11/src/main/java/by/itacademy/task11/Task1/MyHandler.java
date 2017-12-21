package by.itacademy.task11.Task1;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daryatratseuskaya on 12/20/17
 */
public class MyHandler extends DefaultHandler {

    private Root root;

    public Root getRoot() {
        return root;
    }

    private List<People> peopleList;
    private People people;

    public List<People> getPeopleList() {
        return peopleList;
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
            case "/root/people":
                peopleList = new ArrayList<>();
                break;
            case "/root/people/element":
                people = new People();
                break;

        }

    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {

        int lastIndex = path.lastIndexOf('/');
        path = path.substring(0, lastIndex);

        if ("element".equals(qName)) {
            peopleList.add(people);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        String value = new String(ch, start, length).trim();
        switch (path) {
            case "/root/name":
                root.setName(value);
                break;

            case "root/people/element/id":
                people.setId(value);
                break;

            case "/root/people/element/age":
                people.setAge(Integer.parseInt(value));
                break;

            case "/root/people/element/isdegree":
                people.setDegree(Boolean.parseBoolean(value));
                break;

            case "/root/people/element/name":
                people.setName(value);
                break;

            case "/root/people/element/surname":
                people.setSurname(value);

        }


    }
}


