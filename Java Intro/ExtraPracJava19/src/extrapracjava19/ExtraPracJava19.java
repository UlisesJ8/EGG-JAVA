/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extrapracjava19;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class ExtraPracJava19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Ingrese el tamano de los vectores");
        int n = reader.nextInt();
        int[] vectorA = new int[n];
        int[] vectorB = new int[n];
        boolean comprobar = true;
        vectorA = devolverVector1(n);
        vectorB = devolverVector2(n);
        
        for(int i = 0; i < n; i++ ){
         
            if(vectorA[i] == vectorB[i]){
            comprobar = true;
            
            }else{
            comprobar = false;
            break;
            
            }  
            
        }
        
        
        
        if(comprobar == true){
            System.out.println("Los vectores son iguales");
        }else{
            System.out.println("Los vectores NO son iguales");
        }
        
    }
    
    
    public static int[] devolverVector1(int n){
    Scanner reader = new Scanner(System.in);
    int [] vectorI = new int[n];
    for(int i = 0; i < n; i++ ){
        System.out.println("Ingrese numeros del vector A, posicion "+i);
        vectorI[i] = reader.nextInt();
        }
    
    return vectorI;
    }
    
    public static int[] devolverVector2(int n){
    Scanner reader = new Scanner(System.in);
    int [] vectorJ = new int[n];
        for(int i = 0; i < n; i++ ){
         System.out.println("Ingrese numeros del vector B, posicion "+i);
         vectorJ[i] = reader.nextInt();
        }
   
    return vectorJ;
    }

    
}
