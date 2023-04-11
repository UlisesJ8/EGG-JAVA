/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava8;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       int cont = 0;
       int num = 0;
       int par = 0, impar = 0;
        do {
            System.out.println("Ingrese numeros enteros que no sean multiplos de 5 ");
            num = reader.nextInt();

            if (num % 2 == 0 && num >= 0) {
                par += 1;
            } 
            if(num % 2 != 0 && num >= 0) {
                impar += 1;
            }
            
            if (num >= 0) {
                cont += 1;
            }
        } while (num % 5 != 0 || num < 0);
       
        System.out.println("Usted ingreso "+cont +" numeros enteros");
        System.out.println(par + " eran pares");
        System.out.println(impar + " eran impares");
    }
    
}
