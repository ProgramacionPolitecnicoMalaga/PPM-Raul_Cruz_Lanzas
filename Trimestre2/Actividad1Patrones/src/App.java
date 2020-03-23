import com.politecnicomalaga.vista.vistaEmpleados;
import javax.swing.*;
import java.awt.*;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) throws SQLException {
        JFrame frame = new JFrame("Empleados");
        frame.setContentPane(new vistaEmpleados().getPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        int height = toolkit.getScreenSize().height - 200;
        int width = 300;
        frame.setPreferredSize(new Dimension(width, height));
        frame.setMinimumSize(new Dimension(width, 200));
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
