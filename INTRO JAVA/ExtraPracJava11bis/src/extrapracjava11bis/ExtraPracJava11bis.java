/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava11bis;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava11bis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese un numero entero:");
        int num = reader.nextInt();
        int cont = 0;
        
        do{
        num = num / 10;
        cont +=1;
        }while( num != 0 );
        
        System.out.println("La cantidad de digitos es: " + cont); 
       
    }
    
}
