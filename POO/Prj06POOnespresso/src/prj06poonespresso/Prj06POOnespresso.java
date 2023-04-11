/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prj06poonespresso;

import Entidad.Cafetera;
import Servicio.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class Prj06POOnespresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        CafeteraServicio cafe = new CafeteraServicio();
        int op = 0;
        
        do{
        System.out.println("----Menu------");
        System.out.println("1. Llenar la cafetera");
        System.out.println("2. Servir taza");
        System.out.println("3. Vaciar Cafetera");
        System.out.println("4. Agregar Cafe");
        System.out.println("5. Salir del programa.");
        op = reader.nextInt();
        switch(op){
            case 1:
                cafe.llenarCafetera();
            break;
            
            case 2:
                cafe.servirTaza();
            break;
            case 3:
                cafe.vaciarCafetera();
            break;
                    
            case 4:
                cafe.agregarCafe();
            break;
                    
            case 5:
                System.out.println("Perfecto. Usted salio del programa");
            break;
                    
            default:
                System.out.println("Usted ingreso una opcion incorrecta. Reintente nuevamente");
 
        
        }
        
        }while(op != 5);
        
        }
    
}
