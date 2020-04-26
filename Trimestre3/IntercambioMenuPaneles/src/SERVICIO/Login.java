package SERVICIO;

import CONFIGURACION.Propiedades;
import EXCEPTIONS.ConexionException;
import EXCEPTIONS.QueryException;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;

public class Login {
    public boolean verificarClaveLogin(String nombre, String clave) throws IOException, SQLException, ConexionException, NoSuchAlgorithmException, QueryException {
        Servicio servicio = new Servicio();
        boolean verificado = false;
        if(servicio.verificarEncriptador(nombre,clave)){
            Propiedades propiedades = new Propiedades();
            propiedades.setPropiedad("Usuario_actual", nombre);
            propiedades.guardar();
            verificado = true;
        }
        return verificado;
    }
}
