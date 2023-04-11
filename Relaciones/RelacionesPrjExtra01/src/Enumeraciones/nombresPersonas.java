/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enumeraciones;

/**
 *
 * @author Equipo
 */
public enum nombresPersonas {
    PABLO("Pablo"),PEDRO("Pedro"),JUAN("juan"),PACO("Paco"),PEPE("Pepe");
    private String nombrePer;

    private nombresPersonas() {
    }

    private nombresPersonas(String nombrePer) {
        this.nombrePer = nombrePer;
    }

    public String getNombrePer() {
        return nombrePer;
    }

    public void setNombrePer(String nombrePer) {
        this.nombrePer = nombrePer;
    }
    
    
    
    
    
}
