/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;
import Entidad.Persona;
import Servicio.PersonaService;
/**
 *
 * @author Equipo
 */
public class POOEj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona primerPersona = new Persona();
        
        Persona segundaPersona = new Persona("Mariano");
        
       PersonaService persServicio = new PersonaService();
        
        Persona tercerPersona = persServicio.crearPersona();
        
        System.out.println("El nombre de la persona es "+ tercerPersona.getNombre());
    }
    
}
