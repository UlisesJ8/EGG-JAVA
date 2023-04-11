/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj07poopersona;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Prj07POOpersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int conD = 0, conI = 0, conS = 0, Mayor = 0, Menor = 0;
        PersonaServicio humano1 = new PersonaServicio();
        Persona hum1 = humano1.crearPersona();

        humano1.CalcularIMC(hum1);
        humano1.esMayorDeEdad(hum1);

        if (hum1.getEdadM() == true) {
            Mayor += 1;
        } else {
            Menor += 1;
        }

        if (hum1.getnIMC() == -1) {
            conD += 1;
        } else if (hum1.getnIMC() == 0) {
            conI += 1;

        } else {
            conS += 1;
        }

        PersonaServicio humano2 = new PersonaServicio();
        Persona hum2 = humano2.crearPersona();
        humano2.CalcularIMC(hum2);
        humano2.esMayorDeEdad(hum2);

        if (hum2.getEdadM() == true) {
            Mayor += 1;
        } else {
            Menor += 1;

        }

        if (hum2.getnIMC() == -1) {
            conD += 1;
        } else if (hum2.getnIMC() == 0) {
            conI += 1;

        } else {
            conS += 1;
        }

        PersonaServicio humano3 = new PersonaServicio();
        Persona hum3 = humano3.crearPersona();
        humano3.CalcularIMC(hum3);
        humano3.esMayorDeEdad(hum3);

        if (hum3.getEdadM() == true) {
            Mayor += 1;
        } else {
            Menor += 1;

        }

        if (hum3.getnIMC() == -1) {
            conD += 1;
        } else if (hum3.getnIMC() == 0) {
            conI += 1;

        } else {
            conS += 1;
        }

        PersonaServicio humano4 = new PersonaServicio();
        Persona hum4 = humano4.crearPersona();
        humano4.CalcularIMC(hum4);
        humano4.esMayorDeEdad(hum4);

        if (hum4.getEdadM() == true) {
            Mayor += 1;
        } else {
            Menor += 1;

        }

        if (hum4.getnIMC() == -1) {
            conD += 1;
        } else if (hum4.getnIMC() == 0) {
            conI += 1;

        } else {
            conS += 1;
        }

        
        System.out.println("El "+ conD*25 + "% de las personas tiene un peso deficiente");
        System.out.println("El "+ conI*25 + "% de las personas tiene un peso ideal");
        System.out.println("El "+ conS*25 + "% de las personas tiene sobrepeso");
        
        System.out.println("El "+ Mayor*25 + "% de las personas es mayor de edad");
        System.out.println("El "+ Menor*25 + "% de las personas es menor de edad");
        
        
        
        
        
        
        
        
        
        
    
    }
    
}
