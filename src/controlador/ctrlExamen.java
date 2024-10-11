
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
            consulta.setDate(2, obj.getFecha());
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
     
    
      
    public boolean ActualizarExamen(examen objeto){
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        
        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE examen SET folio_Examen=?, fecha=?,grupo=?, HORA=? WHERE folio_Examen=?");
            consulta.setString(1, objeto.getFolio_examen());
            consulta.setDate(2, objeto.getFecha());
            consulta.setString(3, objeto.getGrupo());
            consulta.setString(4, objeto.getHora());
            consulta.setString(5, objeto.getFolio_examen());

            if (consulta.executeUpdate() > 0 ) {
                respuesta = true;

            }
        } catch (SQLException e) {
            System.out.println("REVISE QUE LOS CAMPOS SEAN CORRECTOS " + e);
        }

        return respuesta;

    }

    public boolean existeAspirante(String matricula) {
        boolean respuesta = false;
        String sql = "select matricula from aspirante where matricula = '" + matricula + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;

            }

        } catch (SQLException e) {
            System.out.println("Error al consultar" + e);
        }

        return respuesta;

    }
    
      public boolean existeExamen(String folio){
        boolean respuesta = false;
        String sql = "select folio_Examen from examen where folio_Examen = '"+folio+"';";
        Statement st;
        
        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            while (rs.next()) {
               respuesta = true;
                
            }
           
        } catch (SQLException e) {
            System.out.println("Error al consultar folio del examen"+e);
        }
        
        return respuesta;
        
    }
    
}
