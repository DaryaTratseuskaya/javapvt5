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

    private Root root = null;

    public Root getRoot() {
        return root;
    }

    private List<People> peopleList;
    private People people;

    public List<People> getPeopleList() {
        return peopleList;
    }


    boolean bName = false;
    boolean bId = false;
    boolean bPeople = false;
    boolean bAge = false;

    boolean bisDegree = false;
    boolean bSurname = false;
    boolean bName1 = false;


    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {


        if (qName.equalsIgnoreCase("name")){
            root = new Root();
            bName = true;

        } else if (qName.equalsIgnoreCase("people")) {

            String id = attributes.getValue("id");
            people = new People();
            people.setId((id));
            if (peopleList == null)
                peopleList = new ArrayList<>();

        } else if (qName.equalsIgnoreCase("age")) {

            bAge = true;

        } else if (qName.equalsIgnoreCase("isDegree")) {

            bisDegree = true;

        } else if (qName.equalsIgnoreCase("surname")) {

            bSurname = true;

        } else if (qName.equalsIgnoreCase("name")) {

            bName1 = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("People")) {
            //add People object to list
            peopleList.add(people);
        }
    }

    @Override
    public void characters(char ch[], int start, int length) throws SAXException {

        if (bName){
            root.setName(new String(ch, start, length));
        }else if (bAge) {
            //age element, set Employee age
            people.setAge(Integer.parseInt(new String(ch, start, length)));
            bAge = false;
        } else if (bName1) {
            people.setName(new String(ch, start, length));
            bName = false;
        } else if (bSurname) {
            people.setSurname(new String(ch, start, length));
            bSurname = false;
        } else if (bisDegree) {
            people.setDegree(Boolean.parseBoolean(new String(ch, start, length)));
            bisDegree = false;
        }
        else if (bId) {
            people.setId(new String(ch, start, length));
            bId = false;
        }
    }
}


