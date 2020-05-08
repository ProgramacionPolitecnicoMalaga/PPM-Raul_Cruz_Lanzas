package Adapter;

import Modelo.Personas;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class Adapter extends AbstractTableModel {
    private static final int Nombre = 0;
    private static final int Apellido = 1;
    private static final int Edad = 2;
    private ArrayList<Personas> listaPersonas;
    private final static String[] nombreColumnas = {"Nombre", "Apellido", "Edad"};

    public Adapter(ArrayList<Personas> listaPersonas){
        this.listaPersonas = listaPersonas;
    }

    @Override
    public int getRowCount() {
        return listaPersonas.size();
    }

    @Override
    public int getColumnCount() {
        return nombreColumnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex){
            case Nombre:
                return listaPersonas.get(rowIndex).getNombre();
            case Apellido:
                return listaPersonas.get(rowIndex).getApellidos();
            case Edad:
                return listaPersonas.get(rowIndex).getEdad();
            default:
                return null;
        }
    }

    @Override
    public String getColumnName(int columnIndex){
        return nombreColumnas[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex){
        return true;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex){
        switch (columnIndex){
            case Nombre:

            case Apellido:
                return String.class;
            case Edad:
                return Integer.class;
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex){
        switch (columnIndex){
            case Nombre:
                listaPersonas.get(rowIndex).setNombre((String) aValue);
                break;
            case Apellido:
                listaPersonas.get(rowIndex).setApellidos((String) aValue);
                break;
            case Edad:
                listaPersonas.get(rowIndex).setEdad((Integer) aValue);
                break;
        }
        fireTableCellUpdated(rowIndex, columnIndex);
    }

    public void añadirFila(){
        listaPersonas.add(new Personas(" ", " ", 0));
        fireTableDataChanged();
    }

    public void eliminarFila(int row){
        listaPersonas.remove(row);
        fireTableRowsDeleted(row, row);
    }
}
