package com.politecnicomalaga.controlador;

import com.politecnicomalaga.dao.EmpleadosDAO;
import com.politecnicomalaga.modelo.Empleado;

import java.sql.SQLException;
import java.util.ArrayList;

public class ControladorEmpleados {
    EmpleadosDAO empleadosDAO;

    public ControladorEmpleados() throws SQLException{
        empleadosDAO = new EmpleadosDAO();
    }

    public void eliminarEmpleado(String[] idEmpleados) throws SQLException{
        for(String id : idEmpleados){
            empleadosDAO.eliminarEmpleado(id);
        }
    }

    public void crearEmpleado(String nombre, String edad) throws SQLException{
        empleadosDAO.registrarEmpleado(nombre, edad);
    }

    public void editarEmpleado(String id, String nombre, String edad) throws SQLException{
        empleadosDAO.editarDatosEmpleado(id, nombre, edad);
    }

    public ArrayList<Empleado> getEmpleados(String cadenaAbuscar) throws SQLException{
        ArrayList<Empleado> filtrarListaEmpleado;
        if(cadenaAbuscar.equals(" ")){
            filtrarListaEmpleado = empleadosDAO.obtenerListaCompletaDeEmpleados();
        } else{
            filtrarListaEmpleado = empleadosDAO.buscarPorPatron(cadenaAbuscar);
        }
        return filtrarListaEmpleado;
    }

    public ArrayList<Empleado> getEmpleadosPorPatron(String patron){
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        try {
            EmpleadosDAO empleadosDAO = new EmpleadosDAO();
            listaEmpleados = empleadosDAO.buscarPorPatron(patron);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaEmpleados;
    }
}
