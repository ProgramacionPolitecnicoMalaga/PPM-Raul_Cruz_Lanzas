package Viewer;

import Personas.ControladorPoblacion;
import Personas.Poblacion;

import java.util.ArrayList;

public class HTMLDataViewer implements InterfaceDataViewer {
    @Override
    public String mostrarContenido() {
        return getString();
    }

    static String getString() {
        ControladorPoblacion poblaciones = new ControladorPoblacion();
        ArrayList<Poblacion> arrayPoblaciones = poblaciones.obtenerArrarListDePoblaciones();
        String html;
        html = "<table>\n";
        html += "    <tr>\n";
        html += "       <th>Nacionalidad</th><th>Año</th><th>Total</th>\n";
        html += "    </tr>\n";
        for (int i = 0; i < arrayPoblaciones.size(); i++) {
            html += "    <tr>\n";
            html += "       <td>" + arrayPoblaciones.get(i).getNacionalidad() + "</td><td>" + arrayPoblaciones.get(i).getAño() + "</td><td>" + arrayPoblaciones.get(i).getNumeroDeEmpadronados() + "</td>\n";
            html += "    </tr>\n";
        }
        html += "</table>\n";

        return html;
    }
}