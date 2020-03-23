package com.politecnicomalaga.dao;

import com.politecnicomalaga.modelo.Empleado;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpleadosDAO {
    private DBConn conn;

    public EmpleadosDAO() throws SQLException {
        conn = new DBConn();
    }

    public void registrarEmpleado(String nombre, String edad) throws SQLException {
        conn.update("INSERT INTO Empleado(nombre, edad) VALUES('"+ nombre +"','"+ edad +"')");
    }

    public void editarDatosEmpleado(String id, String nombre, String edad) throws SQLException {
        conn.update("UPDATE Empleado SET nombre= '"+ nombre +"', edad= '" + edad +"' WHERE id= "+ id);
    }

    public void eliminarEmpleado(String id) throws SQLException {
        conn.update("DELETE FROM Empleado WHERE id" + id);
    }

    public ArrayList<Empleado> buscarPorPatron(String nombre) throws SQLException {
        ResultSet result = conn.read("SELECT id, nombre, edad FROM Empleado WHERE nombre LIKE '%" + nombre + "%'");
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        while (result.next()){
            listaEmpleados.add(new Empleado(result.getInt("id"), result.getString("nombre"), result.getInt("edad")));
        }
        return listaEmpleados;
    }

    public ArrayList<Empleado> getEmpleados(ResultSet result) throws SQLException {
        ArrayList<Empleado> listaEmpleados = new ArrayList<>();
        while (result.next()){
            listaEmpleados.add(new Empleado(result.getInt("id"), result.getString("nombre"), result.getInt("edad")));
        }
        return listaEmpleados;
    }

    public ArrayList<Empleado> obtenerListaCompletaDeEmpleados() throws SQLException{
        ResultSet result = conn.read("SELECT * FROM Empleado");
        return getEmpleados(result);
    }

    public boolean isNumeric (String cadena){
        boolean resultado;
        try{
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException exception){
            resultado = false;
        }
        return resultado;
    }
}