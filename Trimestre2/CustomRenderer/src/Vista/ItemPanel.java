package Vista;

import Modelo.Item;
import Modelo.Tipo;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.HashMap;

public class ItemPanel extends JPanel implements ListCellRenderer<Item> {
    private JLabel lblTipo;
    private JLabel lblAutor;
    private JLabel lblFecha;
    private JTextArea txtAreaTexto;
    private HashMap<Integer, Item> listaItems = new HashMap<>();

    public ItemPanel(){
        setLayout(new BorderLayout(10,10));
        lblTipo = new JLabel();
        lblAutor = new JLabel();
        lblFecha = new JLabel();
        txtAreaTexto = new JTextArea();
        txtAreaTexto.setWrapStyleWord(true);
        txtAreaTexto.setLineWrap(true);

        Border margenAutorFecha = new EmptyBorder(10,10,0,10);
        Border margenTexto = new EmptyBorder(0,10,20,10);
        Border margenTipo = new EmptyBorder(10,10,0,10);
        lblTipo.setBorder(margenTipo);
        lblAutor.setBorder(margenAutorFecha);
        lblFecha.setBorder(margenAutorFecha);
        txtAreaTexto.setBorder(margenTexto);

        add(lblTipo, BorderLayout.NORTH);
        add(lblAutor, BorderLayout.WEST);
        add(lblFecha, BorderLayout.EAST);
        add(txtAreaTexto, BorderLayout.SOUTH);
    }

    public Component getListCellRendererComponent(JList<? extends Item> jList, Item item, int i, boolean isSelected, boolean cellHasFocus){
        lblTipo.setOpaque(true);
        lblTipo.setText(item.getTipo().getNombreTipo());
        lblAutor.setText(item.getAutor());
        lblFecha.setText(item.getFecha().toString());
        txtAreaTexto.setText(item.getTexto());
        txtAreaTexto.setSize(jList.getWidth(), Short.MAX_VALUE);

        if (isSelected){
            setBackground(Color.YELLOW);
        } else{
            setBackground(Color.cyan);
        }

        if(cellHasFocus){
            txtAreaTexto.setFont(new Font("College", Font.BOLD, 12));
        } else{
            txtAreaTexto.setFont(new Font("College", Font.PLAIN, 16));
        }
        switch (item.getTipo().getId()){
            case Tipo.IT: lblTipo.setBackground( Color.orange );
                break;
            case Tipo.DESARROLLO: lblTipo.setBackground( Color.green );
                break;
            case Tipo.MANTENIMIENTO: lblTipo.setBackground( Color.pink );
                break;
            case Tipo.GENERAL: lblTipo.setBackground( Color.red );
                break;
        }
        return this;
    }
}
