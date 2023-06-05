/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava16;

import java.util.Scanner;
import javax.print.DocFlavor;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de personas de la cual desee ingresar datos:");
        int num = reader.nextInt();
        String vector[] = new String [num];  
        int vectorEdad[] = new int[num];
        IngresarDatos(num, vectorEdad, vector );
        mostrarDatos(num, vectorEdad, vector );
        
    }
    
    
    public static void IngresarDatos(int num, int vectorEdad[], String vector[] ){
        Scanner reader2 = new Scanner(System.in);
        for(int i = 0; i < num; i++ ){
            System.out.println("Ingrese el nombre de la persona");
            vector[i] = reader2.next();
            
            System.out.println("Ingrese la edad de la persona");
            vectorEdad[i] = reader2.nextInt();
        }
    
    }
    
    public static void mostrarDatos(int num, int vectorEdad[], String vector[] ){
    String op = "";
    Scanner reader3 = new Scanner(System.in);
        do {
      
            for (int i = 0; i < num; i++) {
            System.out.println("Desea mostrar los datos de las personas?");
            System.out.println("Ingrese no, si desea cancelar.  Ingrese si, si desea continuar ");
            op = reader3.next();
            if("no".equalsIgnoreCase(op)){
                break;
            }
                
                
                System.out.println("La persona " + i + " es: " + vector[i] + " y su edad es: " + vectorEdad[i]);
                if (vectorEdad[i] < 18) {
                    System.err.println("Esta persona es menor de edad");
                } else {
                    System.err.println("Esta persona es mayor de edad");
                }
            }

        } while (!"no".equalsIgnoreCase(op));
            
            System.out.println("Usted salio del programa. Saludos");
    
    
    
    
    }
    
    
    
    
    
    
}
