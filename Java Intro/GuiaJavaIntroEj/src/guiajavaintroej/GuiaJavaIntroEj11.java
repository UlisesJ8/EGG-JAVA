/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiajavaintroej;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class GuiaJavaIntroEj11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Escribir una frase:");
        String frase = leer.nextLine();
        String newFrase = Retorno(frase);
        System.out.println("La nueva frase es:");
        System.out.print(newFrase);
             
     }
    
    public static String Retorno(String frase) {
        String nuevaCadena;
        nuevaCadena = frase;
        nuevaCadena = nuevaCadena.replace('a','@').replace('e','#').replace('i','$').replace('o','$').replace('u','*');
       
        return nuevaCadena;           
     }
}