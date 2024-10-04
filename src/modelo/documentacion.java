package modelo;

public class documentacion {

    private String matricula;
    private int acta;
    private int constancia_secu;
    private int certificado_secu;
    private int comprobante_domicilio;
    private int curp;
    private int fotos;
    private int certificado_conducta;

    public documentacion() {
    }

    public documentacion(String matricula, int acta, int constancia_secu, int certificado_secu, int comprobante_domicilio, int curp, int fotos, int certificado_conducta) {
        this.matricula = matricula;
        this.acta = acta;
        this.constancia_secu = constancia_secu;
        this.certificado_secu = certificado_secu;
        this.comprobante_domicilio = comprobante_domicilio;
        this.curp = curp;
        this.fotos = fotos;
        this.certificado_conducta = certificado_conducta;
    }

    public int getActa() {
        return acta;
    }

    public void setActa(int acta) {
        this.acta = acta;
    }

    public int getConstancia_secu() {
        return constancia_secu;
    }

    public void setConstancia_secu(int constancia_secu) {
        this.constancia_secu = constancia_secu;
    }

    public int getCertificado_secu() {
        return certificado_secu;
    }

    public void setCertificado_secu(int certificado_secu) {
        this.certificado_secu = certificado_secu;
    }

    public int getComprobante_domicilio() {
        return comprobante_domicilio;
    }

    public void setComprobante_domicilio(int comprobante_domicilio) {
        this.comprobante_domicilio = comprobante_domicilio;
    }

    public int getCurp() {
        return curp;
    }

    public void setCurp(int curp) {
        this.curp = curp;
    }

    public int getFotos() {
        return fotos;
    }

    public void setFotos(int fotos) {
        this.fotos = fotos;
    }

    public int getCertificado_conducta() {
        return certificado_conducta;
    }

    public void setCertificado_conducta(int certificado_conducta) {
        this.certificado_conducta = certificado_conducta;
    }
    

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

}
