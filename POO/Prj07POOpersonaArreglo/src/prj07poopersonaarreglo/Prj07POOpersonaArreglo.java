/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj07poopersonaarreglo;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Prj07POOpersonaArreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner reader = new Scanner(System.in);
        PersonaServicio humano1 = new PersonaServicio();
        Persona hum1[] = new Persona[4];
        
        for (int i = 0; i < hum1.length; i++) {
            hum1[i] = humano1.crearPersona();
            humano1.CalcularIMC(hum1[i]);
            humano1.esMayorDeEdad(hum1[i]);
        }
        
        
            System.out.println(Arrays.toString(hum1));
        
        
        
    }
    
}
