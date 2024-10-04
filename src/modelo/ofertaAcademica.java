
package modelo;


public class ofertaAcademica {
   private String clave_especialidad;
   private String nombre_especialidad;

    public ofertaAcademica() {
    }

    public ofertaAcademica(String clave_especialidad, String nombre_especialidad) {
        this.clave_especialidad = clave_especialidad;
        this.nombre_especialidad = nombre_especialidad;
    }

    public String getClave_especialidad() {
        return clave_especialidad;
    }

    public void setClave_especialidad(String clave_especialidad) {
        this.clave_especialidad = clave_especialidad;
    }

    public String getNombre_especialidad() {
        return nombre_especialidad;
    }

    public void setNombre_especialidad(String nombre_especialidad) {
        this.nombre_especialidad = nombre_especialidad;
    }
   
   
   
}
