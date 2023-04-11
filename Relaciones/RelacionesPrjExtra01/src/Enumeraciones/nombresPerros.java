/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enumeraciones;

/**
 *
 * @author Equipo
 */
public enum nombresPerros {
    SCOOBY("Scooby"),NALA("Nala"),COCO("Coco"), SIMBA("Simba"),PELUSA("Pelusa");
    private String nombrePerro;

    private nombresPerros() {
    }

    private nombresPerros(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }

    public String getNombrePerro() {
        return nombrePerro;
    }

    public void setNombrePerro(String nombrePerro) {
        this.nombrePerro = nombrePerro;
    }
    
    
    
    
    
}
