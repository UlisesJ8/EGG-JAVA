/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pracjava19;

import java.util.Random;

/**
 *
 * @author Equipo
 */
public class PracJava19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][]matriz = new int[4][4];
        int[][] matriz2 = new int[4][4];
        boolean comprueba = true;
        
        //Crear una matriz de -2 a 4 con este bucle for 
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
            Random aleatorios = new Random();
            matriz[i][j] = -2+aleatorios.nextInt(6);
            System.out.print(matriz[i][j]+"  ");
            }
            System.out.println(" ");
        }
        System.out.println("\n");
        
        //imprimir la matriz traspuesta
         for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
                matriz2[i][j] = matriz[j][i];
                System.out.print(matriz2[i][j]+" ");
                
            }
            System.out.println(" ");
        }
        
        // Comprobar si la matriz traspuesta es antisimetrica a la matriz, es decir, que la traspuesta es igual pero con los numeros invertidos.
        for(int i = 0; i < 3;i++){
            for(int j = 0; j < 3;j++){
                if(matriz[j][i] == matriz2[i][j]){
                comprueba = true;
                }else{
                comprueba = false;
                break;
                }

            }
    
        }
   
        // condicional para indicar si la matriz es antisimetrica o no 
        if(comprueba == true){
            System.out.println("La matriz traspuesta es antisimetrica a la matriz original");
        }else{
            System.out.println("La matriz traspuesta NO es antisimetrica a la matriz original");
        }
        
 }
}