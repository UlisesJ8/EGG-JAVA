/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Enumeraciones;

/**
 *
 * @author Equipo
 */
public enum numeros {
    UNO ("Uno"),DOS ("Dos"),TRES ("Tres"),CUATRO ("Cuatro"),CINCO ("Cinco"),SEIS ("Seis"),SIETE ("Siete"),DIEZ ("Diez"),ONCE ("Once"),DOCE("Doce");
    private String numeros;

    private numeros() {
    }

    private numeros(String numeros) {
        this.numeros = numeros;
    }

    public String getNumeros() {
        return numeros;
    }

    public void setNumeros(String numeros) {
        this.numeros = numeros;
    }
    
    
    
    
    
    
    
}
