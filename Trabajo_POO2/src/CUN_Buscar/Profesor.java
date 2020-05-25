
package CUN_Buscar;

import java.util.Date;

public class Profesor extends Persona{
    
    //Atributos
    private String clases;
    private double Salario;

    public Profesor(String clases, double Salario, String ID, int TipoID, String Nombre, String Apellido, Date Nacimiento, char Genero, String TipoSangre) {
        super(ID, TipoID, Nombre, Apellido, Nacimiento, Genero, TipoSangre);
        this.clases = clases;
        this.Salario = Salario;
    }

    public String getClases() {
        return clases;
    }

    public void setClases(String clases) {
        this.clases = clases;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double Salario) {
        this.Salario = Salario;
    }




  
}
