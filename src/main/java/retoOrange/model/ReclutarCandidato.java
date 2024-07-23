package retoOrange.model;

public class ReclutarCandidato {

    private String  strNombre;
    private String  strContrasena;
    private String strTitulo;
       private String strStatus;
    private String  strPrimerNombre;
    private String  strSegundoNombre;
    private String strApellido;
    private String  strVacante;
    private String  strCorreo;
    private String strNumero;
    private String  strClaves;
    private String  strNoteUno;
    private String  strNoteDos;




    public ReclutarCandidato(String strNombre, String strContrasena, String strTitulo, String  strPrimerNombre, String  strSegundoNombre, String strApellido,
                             String  strVacante, String  strCorreo, String strNumero, String  strClaves, String  strNoteUno, String strStatus,
                             String  strNoteDos) {
        this.strNombre = strNombre;
        this.strContrasena = strContrasena;
        this.strTitulo = strTitulo;
        this.strPrimerNombre = strPrimerNombre;
        this.strSegundoNombre = strSegundoNombre;
        this.strApellido = strApellido;
        this.strVacante = strVacante;
        this.strCorreo = strCorreo;
        this.strNumero = strNumero;
        this.strClaves = strClaves;
        this.strNoteUno = strNoteUno;
        this.strStatus = strStatus;
        this.strStatus = strNoteDos;


    }

    public String getStrNoteDos() {
        return strNoteDos;
    }

    public void setStrNoteDos(String strNoteDos) {
        this.strNoteDos = strNoteDos;
    }
    public String getStrStatus() {
        return strStatus;
    }

    public void setStrStatus(String strStatus) {
        this.strStatus = strStatus;
    }

    public String getStrPrimerNombre() {
        return strPrimerNombre;
    }

    public void setStrPrimerNombre(String strPrimerNombre) {
        this.strPrimerNombre = strPrimerNombre;
    }

    public String getStrSegundoNombre() {
        return strSegundoNombre;
    }

    public void setStrSegundoNombre(String strSegundoNombre) {
        this.strSegundoNombre = strSegundoNombre;
    }

    public String getStrContrasena() {
        return strContrasena;
    }

    public void setStrContrasena(String strContrasena) {
        this.strContrasena = strContrasena;
    }

    public String getStrApellido() {
        return strApellido;
    }

    public void setStrApellido(String strApellido) {
        this.strApellido = strApellido;
    }

    public String getStrVacante() {
        return strVacante;
    }

    public void setStrVacante(String strVacante) {
        this.strVacante = strVacante;
    }

    public String getStrCorreo() {
        return strCorreo;
    }

    public void setStrCorreo(String strCorreo) {
        this.strCorreo = strCorreo;
    }

    public String getStrNumero() {
        return strNumero;
    }

    public void setStrNumero(String strNumero) {
        this.strNumero = strNumero;
    }

    public String getStrClaves() {
        return strClaves;
    }

    public void setStrClaves(String strClaves) {
        this.strClaves = strClaves;
    }

    public String getStrNoteUno() {
        return strNoteUno;
    }

    public void setStrNoteUno(String strNoteUno) {
        this.strNoteUno = strNoteUno;
    }
    public String getStrNombre() {return strNombre;}
    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }
    public String getStrTitulo() {
        return strTitulo;
    }
    public void setStrTitulo(String strTitulo) {
        this.strTitulo = strTitulo;
    }



}
