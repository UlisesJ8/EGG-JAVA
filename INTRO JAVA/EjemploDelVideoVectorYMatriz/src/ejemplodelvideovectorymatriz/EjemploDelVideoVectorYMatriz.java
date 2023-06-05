/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplodelvideovectorymatriz;

import java.util.Scanner;

/**
 *
 * @author Equipo
 */
public class EjemploDelVideoVectorYMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer = new Scanner(System.in);
    int[] vector;
    vector = new int[2];
    int producto[] = new int[3];
    int[][] matriz = {{4, 6, 8},{2,1,7}};
    System.out.println("Ingrese los valores del vector de tamano " + vector.length +":");
    for(int i = 0; i < vector.length; i++){
    System.out.println("v["+i+"]=");
    vector[i] = leer.nextInt();
    }
    int sum;
    
    for(int j = 0; j < matriz[0].length; j++){
    sum = 0;
            for(int i = 0; i < vector.length; i++){
            sum += vector[i] * matriz[i][j];
            }
        producto[j] = sum;    
    }
    String aux = "";
    System.out.println("* Vector:");
   for (int elemento: vector){
       aux = aux + "  " + elemento;
   } 
   System.out.println(aux);
   System.out.println("\n*Matriz:");
   for(int[] fila: matriz){
    aux = "";
    for(int elemento: fila){
    aux += "  " + elemento;
    }
    System.out.println(aux);
    }
   aux = "";
    System.out.println("\n* Vector * Matriz");
    for(int elemento: producto){
        aux += "   " + elemento;
    
    }
    System.out.println(aux);
    
    }
    
}
