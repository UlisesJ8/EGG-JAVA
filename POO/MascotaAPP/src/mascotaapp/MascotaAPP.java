/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotaapp;

import java.util.Scanner;
import mascotaapp.servicios.ServicioMascota;
import mascotapp.entidades.Mascota;

/**
 *
 * @author Equipo
 */
public class MascotaAPP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reading = new Scanner(System.in);
//        Mascota m1 = new Mascota("Fernando Chiquito","Chiquito", "Perro");
//        Mascota m2 = new Mascota();
//      
//        m1.apodo = "Chiquito";
//        m1.nombre = reading.next();
//        m1.tipo = "Beagle";
//        m1.edad = 14;
//        m1.cola = true;
//        m1.color = "Tricolor";

//        m1.setNombre("Pepe Chiquito");
//        System.out.println(m1.toString());
//        m1.pasear(100);
//        System.out.println(m1.toString());

         
//        System.out.println(m1);
//        System.out.println("-------------------");
//        System.out.println(m2.getNombre());
//        System.out.println(m1.apodo+ " " + m1.edad+" " + m1.tipo+" "+m1.color);
                
            ServicioMascota sm = new ServicioMascota();

            Mascota m1 = sm.crearMascota();
            
            System.out.println(m1.toString());
                
            m1 = null;

                
    }
    
}
