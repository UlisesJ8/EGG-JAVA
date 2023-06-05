/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepcionesprj01;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExcepcionesPrj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        PersonaServicio humano1 = new PersonaServicio();
//        Persona hum1[] = new Persona[4];
//        
//        for (int i = 0; i < hum1.length; i++) {
//            hum1[i] = humano1.crearPersona();
//            humano1.CalcularIMC(hum1[i]);
//            humano1.esMayorDeEdad(hum1[i]);
//        }
        
        
//            System.out.println(Arrays.toString(hum1));
       try{ 
       Persona people = null;
       humano1.esMayorDeEdad(people);
       }catch(NullPointerException e){
           System.out.println("Error: "+ e.getMessage());
           System.out.println("Error la persona creada es = null");
       }catch(Exception e){
        System.out.println("Error: "+ e.getMessage());
       }
        
        
    }
    
}
