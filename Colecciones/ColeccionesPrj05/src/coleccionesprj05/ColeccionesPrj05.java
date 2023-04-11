/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccionesprj05;

import Entidad.Pais;
import Servicio.servicioPaises;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ColeccionesPrj05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pais nacionality = new Pais();
        Servicio.servicioPaises nacionalidad = new servicioPaises();
        Scanner reader = new Scanner(System.in);
        boolean flag = true;
        String op = "";
        
        do{
        nacionalidad.cargarPaises();
        System.out.println("Desea cargar otro pais?(si/no)");
        op = reader.next();
        
        if("no".equalsIgnoreCase(op)){
        flag = false;
        }
        
        while(!op.equalsIgnoreCase("si") && !op.equalsIgnoreCase("no")){
        System.out.println("Ingrese una opcion correcta");
        System.out.println("Desea cargar otro pais?(si/no)");
        op = reader.next();
        
            if("no".equalsIgnoreCase(op)){
                flag = false;
            }
            
        }
        
            
        }while(flag == true );
        
        nacionalidad.mostrarPaises();
        nacionalidad.ordenarPaises();
        nacionalidad.eliminarPais();
        
        
        
        
        
        
        
        
    }
    
}
