
package modelo;


public class aspirante {
    
    private String matricula;
    private String nombre;
    private String ape_pat;
    private String ape_mat;
    private String curp;
    private String correo;
    private String num_telefono;
    private String tipo_discapacidad;
    private String nombre_tutor;
    private String telefono_tutor;
    private String direccion;
    private String CCT;
    private String tipo_secundaria;
    private String nombre_secundaria;
    private String clave_especialidad;
    private String folio_examen;        
    private int checkacta;
    public aspirante() {
    }

    public aspirante(String matricula, String nombre, String ape_pat, String ape_mat, String curp, String correo, String num_telefono, String tipo_discapacidad, String nombre_tutor, String telefono_tutor, String direccion, String CCT, String tipo_secundaria, String nombre_secundaria, String clave_especialidad, String folio_examen, int checkacta) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.ape_pat = ape_pat;
        this.ape_mat = ape_mat;
        this.curp = curp;
        this.correo = correo;
        this.num_telefono = num_telefono;
        this.tipo_discapacidad = tipo_discapacidad;
        this.nombre_tutor = nombre_tutor;
        this.telefono_tutor = telefono_tutor;
        this.direccion = direccion;
        this.CCT = CCT;
        this.tipo_secundaria = tipo_secundaria;
        this.nombre_secundaria = nombre_secundaria;
        this.clave_especialidad = clave_especialidad;
        this.folio_examen = folio_examen;
        this.checkacta = checkacta;
    }

    public int getCheckacta() {
        return checkacta;
    }

    public void setCheckacta(int checkacta) {
        this.checkacta = checkacta;
    }

    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApe_pat() {
        return ape_pat;
    }

    public void setApe_pat(String ape_pat) {
        this.ape_pat = ape_pat;
    }

    public String getApe_mat() {
        return ape_mat;
    }

    public void setApe_mat(String ape_mat) {
        this.ape_mat = ape_mat;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNum_telefono() {
        return num_telefono;
    }

    public void setNum_telefono(String num_telefono) {
        this.num_telefono = num_telefono;
    }

    public String getTipo_discapacidad() {
        return tipo_discapacidad;
    }

    public void setTipo_discapacidad(String tipo_discapacidad) {
        this.tipo_discapacidad = tipo_discapacidad;
    }

    public String getNombre_tutor() {
        return nombre_tutor;
    }

    public void setNombre_tutor(String nombre_tutor) {
        this.nombre_tutor = nombre_tutor;
    }

    public String getTelefono_tutor() {
        return telefono_tutor;
    }

    public void setTelefono_tutor(String telefono_tutor) {
        this.telefono_tutor = telefono_tutor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCCT() {
        return CCT;
    }

    public void setCCT(String CCT) {
        this.CCT = CCT;
    }

    public String getTipo_secundaria() {
        return tipo_secundaria;
    }

    public void setTipo_secundaria(String tipo_secundaria) {
        this.tipo_secundaria = tipo_secundaria;
    }

    public String getNombre_secundaria() {
        return nombre_secundaria;
    }

    public void setNombre_secundaria(String nombre_secundaria) {
        this.nombre_secundaria = nombre_secundaria;
    }

    public String getClave_especialidad() {
        return clave_especialidad;
    }

    public void setClave_especialidad(String clave_especialidad) {
        this.clave_especialidad = clave_especialidad;
    }

    public String getFolio_examen() {
        return folio_examen;
    }

    public void setFolio_examen(String folio_examen) {
        this.folio_examen = folio_examen;
    }

   
    
    
    
    
}
