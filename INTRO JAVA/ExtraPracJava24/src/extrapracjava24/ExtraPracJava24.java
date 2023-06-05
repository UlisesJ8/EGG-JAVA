/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava24;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    int a = 1;
    int b = 1;
    int c = 0;
    int num;
    
        do{
        System.out.println("Ingrese el valor N para determinar la escala de fibonacci(Escribir un numero mayor a 2):");
        num = reader.nextInt();
        }while(num < 2);
        System.out.print(a+","+b+",");
        
        while(c < num ){
        c = a + b;
        if(c < num){
        System.out.print(c+",");
        }
        b = a;
        a = c;
        
        }
        
        
        System.out.println("");
    }
    
}
