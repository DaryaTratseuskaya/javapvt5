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


    boolean bRootName = false;
    boolean bId = false;
    boolean bAge = false;
    boolean bisDegree = false;
    boolean bSurname = false;
    boolean bPeopleName = false;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {


        if (qName.equalsIgnoreCase("root")) {

            root = new Root();
            bRootName = false;

        } else if (qName.equalsIgnoreCase("name")) {

            bRootName = true;

        } else if (qName.equalsIgnoreCase("People")){

            people = new People();

            if (peopleList == null)
                peopleList = new ArrayList<>();

        }  else if (qName.equalsIgnoreCase("age")) {

            bAge = true;

        } else if (qName.equalsIgnoreCase("people")) {

            bId = true;

        } else if (qName.equalsIgnoreCase("isDegree"))

        {

            bisDegree = true;

        } else if (qName.equalsIgnoreCase("surname"))

        {

            bSurname = true;

        } else if (qName.equalsIgnoreCase("name"))

        {

            bPeopleName = true;
        }
    }


    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
//        if (qName.equalsIgnoreCase("name")) {
//            root.getName();
//        } else
            if (qName.equalsIgnoreCase("people")) {
            //add People object to list
            peopleList.add(people);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (bRootName) {
            root.setName(new String(ch, start, length).trim());
        } else if (bAge) {
            people.setAge(Integer.parseInt(new String(ch, start, length)));
            bAge = false;
        } else if (bPeopleName) {
            people.setName(new String(ch, start, length));
            bPeopleName = false;
        } else if (bSurname) {
            people.setSurname(new String(ch, start, length));
            bSurname = false;
        } else if (bisDegree) {
            people.setDegree(Boolean.parseBoolean(new String(ch, start, length)));
            bisDegree = false;
        } else if (bId) {
            people.setId(new String(ch, start, length));
            bId = false;
        }
    }
}


