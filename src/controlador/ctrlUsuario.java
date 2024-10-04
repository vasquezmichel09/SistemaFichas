
package controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.aspirante;
import modelo.usuario;


public class ctrlUsuario {
    
     //metodo para iniciar sesion
    public boolean loginUser(usuario objeto) {

        boolean respuesta = false;
        
        Connection cn = Conexion.conectar();
        String sql = "select usuario, password from usuario where usuario='" + objeto.getUsuario() + ""
                + "'and password='" + objeto.getPassword() + "'";
        Statement st;

        try {
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                respuesta = true;
            }
        } catch (SQLException e) {
            System.out.println("Error al iniciar sesion");
            JOptionPane.showMessageDialog(null, "error al inciiar sesion");
        }

        return respuesta;

    }
    
}
