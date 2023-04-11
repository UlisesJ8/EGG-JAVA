/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 *
 * @author Equipo
 */
public class Voto {
    ArrayList<Alumno> votados;
    Alumno estudiante;

    public Voto() {
    }

    public Voto(ArrayList<Alumno> votados, Alumno estudiante) {
        this.votados = votados;
        this.estudiante = estudiante;
    }

    public Voto(ArrayList<Alumno> votados) {
        this.votados = votados;
    }

    public ArrayList<Alumno> getVotados() {
        return votados;
    }

    public void setVotados(ArrayList<Alumno> votados) {
        this.votados = votados;
    }


   
    public Alumno getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Alumno estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return  "votados=" + votados ;
    }


 

   

   
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
