/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesprj02;

import Entidad.Alumnos;
import Servicio.servicioAlumnos;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Coleccionesprj02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean flag = true;
        Alumnos alum = new Alumnos();
        servicioAlumnos estudiante = new servicioAlumnos();
        Scanner reader = new Scanner(System.in);
        String op;
        do{
            estudiante.cargarAlumnos();
            System.out.println("Desea cargar otro alumno?(si/no)");
            op = reader.next();
            if (op.equalsIgnoreCase("si")) {
                flag = true;
            }
            if(op.equalsIgnoreCase("no")){
                flag = false;
            }
            while (!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no")) {                
                System.out.println("Ingrese una opcion correcta ");
                System.out.println("Desea cargar otro alumno?(si/no)");
                op = reader.next();
                
                if(op.equalsIgnoreCase("no")){
                flag = false;
                }
            }
            
        }while(flag == true);
        
       estudiante.notaFinal();
        
        
        
    }
    
}
