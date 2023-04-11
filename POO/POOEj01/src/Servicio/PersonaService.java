/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Persona;
import java.util.Scanner;
/**
 *
 * @author Equipo
 */
public class PersonaService {

    
    
        
     public  Persona crearPersona(){
    Scanner reading = new Scanner(System.in);
    Persona personaCompleta = new Persona();
        System.out.println("Ingrese el nombre de la persona");
        personaCompleta.setNombre(reading.next());
        
        return personaCompleta;   
    
    }
    
    
    
    
    
    
    
    
    
    
}
