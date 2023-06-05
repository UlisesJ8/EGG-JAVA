/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava9;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 0, num2 = 0, cont = 0; 
        int a = 0, b = 0;
        do{
            System.out.println("Escribe dos numeros enteros mayores que 1");
            num = reader.nextInt();
            num2 = reader.nextInt();
            a = num; 
            b = num2;
            
            while(a >= b){
            a = a - b;
            cont += 1;         
            }
            
            
        }while(num <= 1 || num2 <= 1 );
        
        System.out.println("El resto es "+ a +" y el cociente es " + cont);
        
        
    }
    
}
