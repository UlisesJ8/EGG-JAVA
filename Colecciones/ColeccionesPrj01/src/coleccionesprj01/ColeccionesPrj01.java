/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesprj01;

import Entidad.Perro;
import Servicio.servicioPerro;
import java.util.ArrayList;
import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author Equipo
 */
public class ColeccionesPrj01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro per = new Perro(); 
        Servicio.servicioPerro dog = new servicioPerro();
        Scanner reader = new Scanner(System.in);
        String op = "";
        boolean flag = true;
        do {            
            dog.crearLista();
            System.out.println("Desea seguir agregando perros?(Si/No)");   
            op = reader.next();
             if (op.equalsIgnoreCase("si")) {
                flag = true;
            }
            if(op.equalsIgnoreCase("no")){
                flag = false;
            } 
            
            while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no")) {                
                System.out.println("Ingrese una opcion correcta ");
                System.out.println("Desea seguir agregando perros?(Si/No)");   
                op = reader.next();
                
                if(op.equalsIgnoreCase("no")){
                flag = false;
                }
            }
            
        } while (flag == true) ;

        dog.mostrarPerros();
        
        dog.BuscarPerro();
        
        
    }
    
}
