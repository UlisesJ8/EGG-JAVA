/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjavaej18;

import java.util.Random;

/**
 *
 * @author Equipo
 */
public class PracJavaEj18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]matriz = new int[4][4];
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
            Random aleatorios = new Random();
            matriz[i][j] = -9+aleatorios.nextInt(19);
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("\n");
        mostrarTraspuesta(matriz);
    }
    
    public static void mostrarTraspuesta(int [][] matriz){
    
     for(int i = 0; i < 3;i++){
        for(int j = 0; j < 3;j++){
            System.out.print(matriz[j][i]+" ");
            }  
         System.out.println("");
        }
    }
    
}
