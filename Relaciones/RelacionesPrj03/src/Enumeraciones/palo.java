/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enumeraciones;

/**
 *
 * @author Equipo
 */
public enum palo {
    ESPADA("Espada"),BASTO("Basto"), ORO("Oro"), COPA("Copa");
    private String nombre;

    private palo() {
    }

    private palo(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}
