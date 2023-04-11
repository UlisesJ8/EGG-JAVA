/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.HashSet;

/**
 *
 * @author Equipo
 */
public class Alumno {
    private String nombreCompleto;
    private int DNI;
    private int cantidadVotos;
    

    public Alumno(String nombreCompleto, int DNI, int cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
        this.cantidadVotos = cantidadVotos;
    }

  

    public Alumno(String nombreCompleto, int DNI) {
        this.nombreCompleto = nombreCompleto;
        this.DNI = DNI;
    }

    

    public Alumno(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Alumno(int DNI) {
        this.DNI = DNI;
    }
    
   
    public Alumno() {
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombreCompleto=" + nombreCompleto + ", DNI=" + DNI + ", cantidadVotos=" + cantidadVotos + "\n" ;
    }

    
    
}
