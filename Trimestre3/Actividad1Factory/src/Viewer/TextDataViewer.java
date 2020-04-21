package Viewer;

import Personas.ControladorPoblacion;
import Personas.Poblacion;

import java.util.ArrayList;

public class TextDataViewer implements InterfaceDataViewer {

    @Override
    public String mostrarContenido() {
            ControladorPoblacion poblaciones = new ControladorPoblacion();
        ArrayList<Poblacion> arrayPoblaciones = poblaciones.obtenerArrarListDePoblaciones();
        String text;
        text = "Listado de empadronamientos:\n";
        for(int i = 0; i < arrayPoblaciones.size(); i++){
            text += "\n";
            text += "    El total de empadronados en " + arrayPoblaciones.get(i).getAño() +" procedentes de " + arrayPoblaciones.get(i).getNacionalidad() + " fue de " + arrayPoblaciones.get(i).getNumeroDeEmpadronados()+ " personas.\n";
            text += "\n";
        }

        return text;
    }
}
