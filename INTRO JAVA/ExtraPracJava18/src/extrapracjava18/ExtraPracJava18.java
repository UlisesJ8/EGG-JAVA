/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava18;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desee sumar:");
        int n = reader.nextInt();
        int[] vector = new int[n];
        int sumarN = 0;
        for(int i = 0; i < n; i++){
            System.out.println("Ingrese los numeros que desee sumar");
            vector[i] = reader.nextInt();
        }
        
        for(int i = 0; i< n; i++){
           sumarN += vector[i]; 
            
        }
        
        System.out.println("La suma de los numeros del vector es: "+sumarN);
    }
    
}
