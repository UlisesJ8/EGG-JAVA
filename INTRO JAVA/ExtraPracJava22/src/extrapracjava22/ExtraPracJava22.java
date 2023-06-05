/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava22;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas de la matriz");
        int n = reader.nextInt();
        System.out.println("Ingrese la cantidad de columnas de la matriz");
        int m = reader.nextInt();
        
        int[][] matriz = new int[n][m];
        int suma = 0; 
        
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m ; j++){
            matriz[i][j] = (int ) (Math.random()*10);
            suma += matriz[i][j];
 
            }
        
        }
        
        
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < m ; j++){
                
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        
        
        
        
        System.out.println("La suma de todos los elementos de la matriz es: "+ suma);
        
        
        
        
    }
    
}
