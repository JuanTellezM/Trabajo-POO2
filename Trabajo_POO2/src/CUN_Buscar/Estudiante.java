
package CUN_Buscar;

import java.util.Date;

public class Estudiante extends Persona{
    private String semestre;
    private double matricula;

    public Estudiante(String semestre, double matricula, String ID, int TipoID, String Nombre, String Apellido, Date Nacimiento, char Genero, String TipoSangre) {
        super(ID, TipoID, Nombre, Apellido, Nacimiento, Genero, TipoSangre);
        this.semestre = semestre;
        this.matricula = matricula;
    }

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }


    
    
}
