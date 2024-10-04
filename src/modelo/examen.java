
package modelo;

import java.sql.Date;

public class examen {
    
    private String folio_examen;
    private String fecha;
    private String hora;
    private String grupo;

    public examen() {
    }

    public examen(String folio_examen, String fecha, String hora, String grupo) {
        this.folio_examen = folio_examen;
        this.fecha = fecha;
        this.hora = hora;
        this.grupo = grupo;
    }

    public String getFolio_examen() {
        return folio_examen;
    }

    public void setFolio_examen(String folio_examen) {
        this.folio_examen = folio_examen;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

  
    
}
