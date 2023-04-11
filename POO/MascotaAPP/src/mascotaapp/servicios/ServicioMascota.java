/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp.servicios;

import java.util.Scanner;
import mascotapp.entidades.Mascota;

/**
 *
 * @author Equipo
 */
public class ServicioMascota {
   
    
    private Scanner reading = new Scanner(System.in).useDelimiter("\n");


    public Mascota crearMascota(){
        
        System.out.println("Introducir nombre");
        String nombre = reading.next();
        
        System.out.println("Introducir apodo");
        String apodo = reading.next();
        
        System.out.println("Introducir tipo");
        String tipo = reading.next();
        
        
        return new Mascota(nombre, apodo, tipo);
       
    }
    
    public static void main(String[]args){
    int a = 10;
    Mascota mm = new Mascota();
    modificador(a,mm);
    
        System.out.println("a "+a);
        System.out.println("Mascota "+mm);
    
    }
    
    
    
    public static void modificador(int num, Mascota m){
    
    
    num = 100;
    m.setApodo("Mascota Referencia");
    }
    
    
    
    
    
}
