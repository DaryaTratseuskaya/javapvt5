package by.itacademy.task17.Task1;

import org.apache.commons.io.FileUtils;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Text;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;

/**
 * Created by daryatratseuskaya on 1/22/18
 */
public class Main {
    public static void main(String[] args) throws IOException {

        File dir = new File("/Users/daryatratseuskaya/IdeaProjects/javapvt5/FilesForTest");
        String[] extensions = new String[]{"rtf"};

        List<File> files = (List<File>) FileUtils.listFiles(dir, extensions, true);
        for (File file : files) {
            System.out.println("file: " + file.getCanonicalPath());
        }

        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // root files elements
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("files");
            doc.appendChild(rootElement);

            for (File f : files) {
                // file elements
                Element staff = doc.createElement("file");
                rootElement.appendChild(staff);

                // name elements
                Text fileName = doc.createTextNode(f.getName());
                Element name = doc.createElement("name");
                name.appendChild(fileName);
                staff.appendChild(name);

                // path elements
                Text filePath = doc.createTextNode(f.getPath());
                Element path = doc.createElement("path");
                path.appendChild(filePath);
                staff.appendChild(path);

                // size elements
                Text fileSize = doc.createTextNode(String.valueOf(f.length()));
                Element size = doc.createElement("size");
                size.appendChild(fileSize);
                staff.appendChild(size);

                // datetime elements
                Path file1 = f.toPath();
                BasicFileAttributes attributes = Files.readAttributes(file1, BasicFileAttributes.class);

                Text fileDate = doc.createTextNode(String.valueOf(attributes.creationTime()));
                Element datetime = doc.createElement("creationDate");
                datetime.appendChild(fileDate);
                staff.appendChild(datetime);

            }

            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
            transformer.setOutputProperty(OutputKeys.METHOD, "xml");
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");
            transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");

            DOMSource source = new DOMSource(doc);
            StreamResult result = new StreamResult(new File("/Users/daryatratseuskaya/IdeaProjects/javapvt5/HomeWork/HomeWork17/fileTest.xml"));

            // Output to console for testing
            // StreamResult result = new StreamResult(System.out);

            transformer.transform(source, result);

            System.out.println("File saved!");


        } catch (ParserConfigurationException e) {
            System.out.println("parseException");
        } catch (TransformerConfigurationException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }

    }
}
