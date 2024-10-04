package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {

    public static Connection conectar() {

        try {
            Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/sistemafichas", "root", "");
            return cn;
           //JOptionPane.showMessageDialog(null,"conectado correctamente.."); 
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El error es..." + e.getMessage());
        }
        return null;
    }
}
