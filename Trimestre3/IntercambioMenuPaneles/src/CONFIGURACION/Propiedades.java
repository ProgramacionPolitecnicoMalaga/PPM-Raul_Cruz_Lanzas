package CONFIGURACION;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Propiedades {

    public final static String NOMBRE_ARCHIVO_PROPIEDADES = "config.properties";
    private Properties properties;

    public Propiedades() throws IOException{
        File archivoPropiedades = new File (NOMBRE_ARCHIVO_PROPIEDADES);
        properties = new Properties();
        if(archivoPropiedades.exists()){
            properties.load(new FileInputStream(archivoPropiedades));
        }
    }

    public String getPropiedades(String nombrePropiedad){
        return properties.getProperty(nombrePropiedad);
    }

    public void setPropiedad(String nombrePropiedad, String valorPropiedad){
        properties.setProperty(nombrePropiedad, valorPropiedad);
    }

    public void guardar() throws IOException{
        FileOutputStream outputStream = new FileOutputStream(new File(NOMBRE_ARCHIVO_PROPIEDADES));
        properties.store(outputStream, "Inicio de sesión");
    }
}
