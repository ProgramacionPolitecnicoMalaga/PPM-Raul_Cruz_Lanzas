import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.LinkedList;

public class Interfaz {
    private JPanel panelMain;
    private JComboBox comboProyectos;
    private JComboBox comboEmpleados;
    private JTextField txtNombreTarea;
    private JTextField txtDescripcionTarea;
    private JTextField txtHorasEmpleadasTarea;
    private JTextField txtDepartamento;
    private JTextField txtFactorProductividad;
    private JButton btnAñadirTarea;
    private JTextArea txtListaTareas;
    private JTextArea txtListaProyectos;
    private JTextField txtSueldoBase;
    private JTextField txtComplementos;
    private JButton btnListaTareasEmpleado;
    private JButton btnListaTareasProyectos;
    private JButton btnListaNominas;
    private JPanel panelControl;
    private JPanel panelXML;

    public Interfaz(){
        ListaEmpleadoTarea listaEmpleadoTarea = new ListaEmpleadoTarea();

        ArchivoXML archivoXML = new ArchivoXML("files/empleados.xml", "empleado");
        NodeList nodeList = archivoXML.ObtenerListaNodos();
        for(int i=0; i < nodeList.getLength(); i++){
            Node miNodoActual = nodeList.item(i);

            String DNI = miNodoActual.getAttributes().getNamedItem("DNI").getTextContent();
            String nombreEmpleado = miNodoActual.getAttributes().getNamedItem("Nombre").getTextContent();
            String apellidosEmpleado = miNodoActual.getAttributes().getNamedItem("Apellidos").getTextContent();
            double productividadEmpleado = Double.parseDouble(miNodoActual.getAttributes().getNamedItem("Productividad").getTextContent());
            int categoriaEmpleado = Integer.parseInt(miNodoActual.getAttributes().getNamedItem("Categoria").getTextContent());
            CategoriaEmpleado categoriaEmpleado1 = new CategoriaEmpleado(categoriaEmpleado);

            Empleado empleado2 = new Empleado(nombreEmpleado, apellidosEmpleado, DNI, productividadEmpleado, categoriaEmpleado1);
            comboEmpleados.addItem(empleado2);
        }

        ArchivoXML archivoXML1 = new ArchivoXML("files/proyectos.xml", "proyecto");
        NodeList nodeList1 = archivoXML1.ObtenerListaNodos();
        for(int i=0; i < nodeList1.getLength(); i++){
            Node miNodoActual = nodeList.item(i);

            String nombreProyecto = miNodoActual.getAttributes().getNamedItem("Proyecto").getTextContent();
            String descripcionProyecto = miNodoActual.getAttributes().getNamedItem("Descripcion").getTextContent();
            String departamentoProyecto = miNodoActual.getAttributes().getNamedItem("Departamento").getTextContent();
            double produccionProyecto = Double.parseDouble(miNodoActual.getAttributes().getNamedItem("Produccion").getTextContent());

            Proyecto proyecto2 = new Proyecto(nombreProyecto, descripcionProyecto, departamentoProyecto, produccionProyecto);
            comboProyectos.addItem(proyecto2);
        }

        btnListaTareasEmpleado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Empleado empleado = (Empleado) comboEmpleados.getSelectedItem();
                XMLGeneratorListaTareaEmpleados xmlGeneratorListaTareaEmpleados = new XMLGeneratorListaTareaEmpleados(empleado, listaEmpleadoTarea);
            }
        });

        btnAñadirTarea.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                String nombreTarea = txtNombreTarea.getText();
                String descripcion = txtDescripcionTarea.getText();
                Double horasEmpleadas = Double.parseDouble(txtHorasEmpleadasTarea.getText());
                Empleado miEmpleado = (Empleado) comboEmpleados.getSelectedItem();
                Proyecto proyecto = (Proyecto) comboProyectos.getSelectedItem();

                Tarea tarea1 = new Tarea(nombreTarea,descripcion,horasEmpleadas,miEmpleado,proyecto);
                LinkedList<Tarea> listaArray = tarea1.getEmpleado().getListaTareas();
                listaArray.addLast(tarea1);

                listaEmpleadoTarea.mapaEmpleadoTarea.put(miEmpleado, listaArray);
                System.out.println("Tarea añadida al mapa");
                System.out.println(listaEmpleadoTarea.mapaEmpleadoTarea);
            }
        });
    }


    public static void main(String[] args) {
        JFrame frame = new JFrame("Empleados y Proyectos");
        frame.setContentPane(new Interfaz().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
