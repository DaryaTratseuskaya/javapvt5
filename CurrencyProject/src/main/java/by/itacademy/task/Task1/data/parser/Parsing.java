package by.itacademy.task.Task1.data.parser;

import by.itacademy.task.Task1.domain.entity.Root;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;

/**
 * Created by daryatratseuskaya on 12/26/17
 */
public interface Parsing {

    Root parse(String fileName) throws ParserConfigurationException, SAXException;
}
