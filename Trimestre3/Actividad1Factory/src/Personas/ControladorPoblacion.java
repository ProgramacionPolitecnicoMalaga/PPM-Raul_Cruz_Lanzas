package Personas;

import Lectores.LectorXML;
import org.w3c.dom.NodeList;

import javax.lang.model.element.Element;
import java.util.ArrayList;

public class ControladorPoblacion {
    private ArrayList<Poblacion> arrayPoblaciones;

    public ControladorPoblacion(){
        arrayPoblaciones = new ArrayList<>();
    }

    public ArrayList<Poblacion> obtenerArrarListDePoblaciones(){
        LectorXML lectorXML = new LectorXML("src/poblaciones.xml","row");
        NodeList nodeList = lectorXML.obtenerListaDeNodos();
        ArrayList<Element> arrayElementos = lectorXML.obtenerArrayDeElementos(nodeList);
        for(int i = 0; i < arrayElementos.size(); i++){
            int año = arrayElementos.get(i).getAttribute("Año");
            String nacionalidad = arrayElementos.get(i).getAttribute("Nacionalidad");
            int numeroDeEmpadronados = Integer.valueOf(String.valueOf(arrayElementos.get(i).getAttribute("Número_de_empadronados")));
            arrayPoblaciones.add(new Poblacion(año, nacionalidad, numeroDeEmpadronados));
        }
        return arrayPoblaciones;
    }
}
