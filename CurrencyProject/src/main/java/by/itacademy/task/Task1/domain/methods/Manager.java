package by.itacademy.task.Task1.domain.methods;

import by.itacademy.task.Task1.data.downloader.Downloader;

import by.itacademy.task.Task1.data.parser.Parsing;
import by.itacademy.task.Task1.data.parser.json.ParseJSON;
import by.itacademy.task.Task1.data.parser.xml.ParseXML;
import by.itacademy.task.Task1.domain.entity.Root;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;


/**
 * Created by daryatratseuskaya on 12/26/17
 */
public class Manager {

    private Root root;

    public static void downloadFile(int userSelectionDownloadMethod) {

        if (userSelectionDownloadMethod == 1) {
            Downloader.downloadXML();
        } else if (userSelectionDownloadMethod == 2) {
            Downloader.downloadJSON();
        }
    }

    public static Root parseXMLMethod(int userSelectionDownloadMethod) {
        Parsing parsing = null;

        if (userSelectionDownloadMethod == 1) {
            parsing = new ParseXML();
        }
        Root root = null;
        try {
            root = parsing.parse("currency");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return root;
    }

    public static Root parseJSONMethod(int userSelectionDownloadMethod) {
        Parsing parsing = null;
        if (userSelectionDownloadMethod == 2) {
            parsing = new ParseJSON();
        }
        Root root = null;
        try {
            root = parsing.parse("currency");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        }
        return root;
    }

}



