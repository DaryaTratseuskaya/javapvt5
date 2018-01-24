package by.itacademy.task17.Task2;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by daryatratseuskaya on 1/24/18
 */
public class Task2 {


    public static void main(String[] args) {

        if (!(args != null && args.length > 0)) {
            System.err.println("Invalid arguments");
            printHelp();
            return;
        }

        for (String argument : args) {
            File f = new File(argument);
            if (f.isDirectory() && f.canRead()) {
                getFilesInfo(f);
                createXML();

            } else {
                System.err.println("Directory " + argument + " specified, " +
                        "but it is not accessible (please make sure the name is correct");
            }
        }
    }

    private static void printHelp() {
        System.out.println("***             List  Files Awesome Utility                ***");
    }

    static Map<String, List<File>> hashMap = new HashMap<>();

    public static void getFilesInfo(File file) {

        if (file.isDirectory()) {
            File[] arrFiles = file.listFiles();

            for (File a : arrFiles) {
                if (a.isFile()) {
                    String stringPattern = "([\\wА-яа-я]{0,})(.{1}\\w+$)";
                    Pattern pattern = Pattern.compile(stringPattern);
                    Matcher m = pattern.matcher(a.getName());

                    if (m.matches()) {
                        List<File> files = new ArrayList<>();
                        if (hashMap.containsKey(m.group(2))) {
                            files = hashMap.get(m.group(2));
                            files.add(a);
                            hashMap.replace(m.group(2), hashMap.get(m.group(2)), files);
                        } else {
                            files.add(a);
                            hashMap.put(m.group(2), files);
                        }
                    }
                } else if (a.isDirectory()) {
                    getFilesInfo(a);
                }
            }
        }

    }

    public static void createXML() {

        try {
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();

            Document doc = dBuilder.newDocument();
            Element rootElement = doc.createElement("files");
            doc.appendChild(rootElement);

            Set<String> keySet = hashMap.keySet();
            String[] keys = keySet.toArray(new String[0]);

            for (int i = 0; i < keys.length; i++) {
                String name = "ext name = \"" + keys[i] + "\"  " + hashMap.get(keys[i]).size() + " items";
                Element element = doc.createElement("name");
                element.appendChild(doc.createTextNode(name));
                rootElement.appendChild(element);

                for (int j = 0; j < hashMap.get(keys[i]).size(); j++) {
                    Element fileElement = doc.createElement("file");
                    fileElement.appendChild(doc.createTextNode((hashMap.get(keys[i]).get(j)).getName()));
                    element.appendChild(fileElement);
                }
            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("/Users/daryatratseuskaya/IdeaProjects/javapvt5/HomeWork/HomeWork17/fileTest1.xml"));
            transformer.transform(source, result);

        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
        }
    }


}

