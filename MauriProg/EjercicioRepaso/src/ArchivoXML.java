import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ArchivoXML {
    private String ruta;
    private String tagName;

    public ArchivoXML(String ruta, String tagName){
        this.ruta = ruta;
        this.tagName = tagName;
    }

    public NodeList ObtenerListaNodos(){
        try{
            File archivo = new File(ruta);
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document document = dBuilder.parse(archivo);

            document.getDocumentElement().normalize();
            NodeList nodeList = document.getElementsByTagName(tagName);

            return nodeList;
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
