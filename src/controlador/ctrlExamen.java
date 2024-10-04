
package controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.aspirante;
import modelo.documentacion;
import modelo.examen;


public class ctrlExamen {
    
    public boolean Guadar(examen obj) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into examen values(?,?,?,?)");
      
           
            consulta.setString(1, obj.getFolio_examen());
            consulta.setString(2, obj.getFecha());
            consulta.setString(3, obj.getGrupo());
            consulta.setString(4, obj.getHora());
          
            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
        } catch (SQLException e) {
            System.out.println("Error al guardar el aspirante" + e);
        }

        return respuesta;

    }
     
      public boolean existeAspirante(String matricula){
        boolean respuesta = false;
        String sql = "select matricula from aspirante where matricula = '"+matricula+"';";
        Statement st;
        
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
               respuesta = true;
                
            }
           
        } catch (SQLException e) {
            System.out.println("Error al consultar"+e);
        }
        
        return respuesta;
        
    }
    
}
