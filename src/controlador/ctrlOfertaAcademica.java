package controlador;

import Conexion.Conexion;
import Vistas.ConsultaOfertaAcademica;
import static Vistas.ConsultaOfertaAcademica.jTableOferta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.aspirante;
import modelo.examen;
import modelo.ofertaAcademica;

public class ctrlOfertaAcademica {

    public boolean Guadar(ofertaAcademica objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into plan_estudios values(?,?)");
            consulta.setString(1, objeto.getClave_especialidad());
            consulta.setString(2, objeto.getNombre_especialidad());

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
        } catch (SQLException e) {
            System.out.println("Error al guardar el aspirante" + e);
        }

        return respuesta;

    }

    public boolean existeOfertaAcademica(String claveoferta) {
        boolean respuesta = false;
        String sql = "select clave_especialidad from plan_estudios where clave_especialidad = '" + claveoferta + "';";
        Statement st;

        try {
            Connection cn = Conexion.conectar();
            st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                respuesta = true;

            }

        } catch (SQLException e) {
            System.out.println("Error al consultar oferta academica" + e);
        }

        return respuesta;

    }

    public boolean actualizar(ofertaAcademica objeto) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();
        ConsultaOfertaAcademica consul = new ConsultaOfertaAcademica();
        int fila = jTableOferta.getSelectedRow();
        String claveoferta = jTableOferta.getValueAt(fila, 0).toString();
        String nombre = jTableOferta.getValueAt(fila, 1).toString();
            

        try {
            PreparedStatement consulta = cn.prepareStatement("update plan_estudios set clave_especialidad='"+claveoferta+"', nombre_especialidad='"+nombre+"' WHERE clave_especialidad='"+claveoferta+"'");

            

            if (consulta.executeUpdate() > 0) {
                respuesta = true;

            }
        } catch (SQLException e) {
            System.out.println("Error al actualizar la oferta academica" + e);
        }

        return respuesta;

    }
}
