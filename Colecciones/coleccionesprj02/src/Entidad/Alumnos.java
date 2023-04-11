/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Equipo
 */
public class Alumnos {
    private String alumno;
    private ArrayList<Integer> notas;

    public Alumnos() {
    }
    


    public Alumnos(String alumno, ArrayList<Integer> notas) {
        this.alumno = alumno;
        this.notas = notas;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setLista(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    
    @Override
    public String toString() {
        return "Alumnos{" + "alumno=" + alumno + ", lista=" + notas + '}';
    }
    
    




    
}
