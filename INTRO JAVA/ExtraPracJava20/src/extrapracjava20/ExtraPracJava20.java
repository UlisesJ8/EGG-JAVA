/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava20;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el tamano del vector");
        int n = reader.nextInt();
        int[] vector = new int[n];
        vector = rellenarVector(n);
        
        mostrarVector(n, vector);
        
    }
    
    
    public static int[] rellenarVector(int n){
        int[] vectorA = new int[n];
        
        for(int i = 0; i < n; i++){
        
        vectorA[i] = (int) (Math.random()*10);
        
        }
        
        return vectorA;
    }
    
    
    public static void mostrarVector(int n,int[] vector){
    
    for(int i = 0; i < n; i++){
        
        System.out.println(vector[i]);
        
        }
    
    }
    
    
    
}
