/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarchivos2;

/**
 *
 * @author INTEL-COREi7
 */
public class Alumno extends Persona {
    protected String GPA;
    protected String matricula;
    protected String facultad;
    protected String numcAprobados;
    protected String carrera;

     public Alumno() {
        this.GPA = " ";
        this.matricula = " ";
        this.facultad = " ";
        this.numcAprobados = " ";
        this.carrera = " ";
    }
     
    public Alumno(String GPA, String matricula, String facultad, String numcAprobados, String carrera) {
        this.GPA = GPA;
        this.matricula = matricula;
        this.facultad = facultad;
        this.numcAprobados = numcAprobados;
        this.carrera = carrera;
    }

    public String getGPA() {
        return GPA;
    }

    public void setGPA(String GPA) {
        this.GPA = GPA;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getNumcAprobados() {
        return numcAprobados;
    }

    public void setNumcAprobados(String numcAprobados) {
        this.numcAprobados = numcAprobados;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" + "GPA=" + GPA + ", matricula=" + matricula + ", facultad=" + facultad + ", numcAprobados=" + numcAprobados + ", carrera=" + carrera + '}';
    }
    
    
    
}
