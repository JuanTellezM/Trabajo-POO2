
package CUN_Buscar;

import java.util.Date;

public class Persona {
    //Atributos
    private String ID;
    private int TipoID;
    private String Nombre;
    private String Apellido;
    private Date Nacimiento;
    private char Genero;
    private String TipoSangre;
    
    public Persona(String ID, int TipoID, String Nombre, String Apellido, Date Nacimiento, char Genero, String TipoSangre) {
        this.ID = ID;
        this.TipoID = TipoID;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Nacimiento = Nacimiento;
        this.Genero = Genero;
        this.TipoSangre = TipoSangre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getTipoID() {
        return TipoID;
    }

    public void setTipoID(int TipoID) {
        this.TipoID = TipoID;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public char getGenero() {
        return Genero;
    }

    public void setGenero(char Genero) {
        this.Genero = Genero;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }




       
}
