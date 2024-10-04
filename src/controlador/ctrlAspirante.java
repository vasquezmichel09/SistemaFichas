package controlador;

import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import modelo.aspirante;
import modelo.documentacion;
import modelo.examen;

public class ctrlAspirante {

    public boolean Guadar(aspirante objeto, examen obj, documentacion objd, String clave_doc, documentacion objd2) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("insert into aspirante values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
            consulta.setString(1, objeto.getMatricula());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApe_pat());
            consulta.setString(4, objeto.getApe_mat());
            consulta.setString(5, objeto.getCurp());
            consulta.setString(6, objeto.getCorreo());
            consulta.setString(7, objeto.getNum_telefono());
            consulta.setString(8, objeto.getTipo_discapacidad());
            consulta.setString(9, objeto.getNombre_tutor());
            consulta.setString(10, objeto.getTelefono_tutor());
            consulta.setString(11, objeto.getDireccion());
            consulta.setString(12, objeto.getCCT());
            consulta.setString(13, objeto.getTipo_secundaria());
            consulta.setString(14, objeto.getNombre_secundaria());
            consulta.setString(15, objeto.getClave_especialidad());
            consulta.setString(16, objeto.getFolio_examen());

            PreparedStatement consulta2 = cn.prepareStatement("insert into documentacion_por_aspirante (clave_doc,matricula,entregado)"
                    + "values (?,?,?)");
            
            for (int i = 1; i <7; i++) {
                consulta2 = cn.prepareStatement("insert into documentacion_por_aspirante (matricula,acta_nacimiento,constancia_secundaria,certificado_secu,comprobante_domicilio,curpdoc,fotos,certificado_conducta)"
                    + "values (?,?,?,?,?,?,?,?)");
            
            consulta2.setString(1, objd.getMatricula());
            consulta2.setInt(2, objd.getActa());
            consulta2.setInt(3, objd.getConstancia_secu());
            consulta2.setInt(4, objd.getCertificado_secu());
            consulta2.setInt(5, objd.getComprobante_domicilio());
            consulta2.setInt(6, objd.getCurp());
            consulta2.setInt(7, objd.getFotos());
            consulta2.setInt(8, objd.getCertificado_conducta());
            
            
            }

            

            if (consulta.executeUpdate() > 0 && consulta2.executeUpdate() > 0) {
                respuesta = true;

            }
        } catch (SQLException e) {
            System.out.println("Error al guardar el aspirante controlador" + e);
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
    
    

    public boolean Actualizar(aspirante objeto, examen obj, documentacion objd) {
        boolean respuesta = false;
        Connection cn = Conexion.conectar();

        try {
            PreparedStatement consulta = cn.prepareStatement("UPDATE aspirante SET matricula=?, nombre=?, "
                    + "ape_pat=?,ape_mat=?,curp=?,correo=?,num_telefono=?,iddiscapacidad=?,nombre_tutor=?, telefono_tutor=?,"
                    + "direccion=?,CCT=?,tipo_secundaria=?,nombre_secundaria=?, clave_especialidad = ?,folio_examen=? WHERE matricula=?");
            consulta.setString(1, objeto.getMatricula());
            consulta.setString(2, objeto.getNombre());
            consulta.setString(3, objeto.getApe_pat());
            consulta.setString(4, objeto.getApe_mat());
            consulta.setString(5, objeto.getCurp());
            consulta.setString(6, objeto.getCorreo());
            consulta.setString(7, objeto.getNum_telefono());
            consulta.setString(8, objeto.getTipo_discapacidad());
            consulta.setString(9, objeto.getNombre_tutor());
            consulta.setString(10, objeto.getTelefono_tutor());
            consulta.setString(11, objeto.getDireccion());
            consulta.setString(12, objeto.getCCT());
            consulta.setString(13, objeto.getTipo_secundaria());
            consulta.setString(14, objeto.getNombre_secundaria());
            consulta.setString(15, objeto.getClave_especialidad());
            consulta.setString(16, objeto.getFolio_examen());
            consulta.setString(17, objeto.getMatricula());

            PreparedStatement consulta2 = cn.prepareStatement("UPDATE documentacion_por_aspirante SET acta_nacimiento=?,constancia_secundaria=?,certificado_secu=?,comprobante_domicilio=?,curpdoc=?,fotos=?,certificado_conducta=? WHERE matricula=?");

           
            consulta2.setInt(1,objd.getActa());
            consulta2.setInt(2,objd.getConstancia_secu());
            consulta2.setInt(3,objd.getCertificado_secu());
            consulta2.setInt(4,objd.getComprobante_domicilio());
            consulta2.setInt(5,objd.getCurp());
            consulta2.setInt(6,objd.getFotos());
            consulta2.setInt(7,objd.getCertificado_conducta());
            consulta2.setString(8,objd.getMatricula());
            
            

            if (consulta.executeUpdate() > 0 && consulta2.executeUpdate() > 0) {
                respuesta = true;

            }
        } catch (SQLException e) {
            System.out.println("REVISE QUE LOS CAMPOS SEAN CORRECTOS " + e);
        }

        return respuesta;

    }

}
